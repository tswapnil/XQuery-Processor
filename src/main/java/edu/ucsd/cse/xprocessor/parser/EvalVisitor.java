package edu.ucsd.cse.xprocessor.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import edu.ucsd.cse.xprocessor.result.NodeListImpl;
import edu.ucsd.cse.xprocessor.result.XQueryResult;
import edu.ucsd.cse.xprocessor.result.XQueryResultType;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 * @param <T>
 *
 */
public class EvalVisitor extends XQueryBaseVisitor<XQueryResult> {

	private Document doc;
	// private Stack<Node> pathStack;
	private Node currentNode;

	public EvalVisitor() {
		super();
		this.doc = null;
		// this.pathStack = new Stack<Node>();
		this.currentNode = null;
	}

	@Override
	public XQueryResult visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {
		System.out.println("visiting ApSlashFile");
		File xmlFile = new File(ctx.docName.getText());

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = dbFactory.newDocumentBuilder();
			doc = docBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.err.println("Failed to parse the XML document '" + ctx.docName.getText() + "' : " + e);
		}

		XQueryResult result = new XQueryResult(XQueryResultType.NODES);

		if (doc != null) {
			Node docRoot = doc.getDocumentElement();
			currentNode = docRoot;
			result = visit(ctx.relpath);
			currentNode = null;
		}

		return result;
	}

	@Override
	public XQueryResult visitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx) {
		System.out.println("Visiting ApDblSlashFile");
		return visitChildren(ctx);
	}

	@Override
	public XQueryResult visitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx) {
		System.out.println("Visiting RpDblSlashFile");
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public XQueryResult visitRpDot(XQueryParser.RpDotContext ctx) {
		System.out.println("Visiting RpDot");
		if (doc == null) {
			return null;
		}

		XQueryResultType resultType;
		if(currentNode.getNodeType() == Node.ATTRIBUTE_NODE) {
			resultType = XQueryResultType.ATTR;
		} else {
			resultType = XQueryResultType.NODES;
		}
		
		XQueryResult result = new XQueryResult(resultType);
		NodeListImpl nodes = new NodeListImpl();
		nodes.add(currentNode);

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpText(XQueryParser.RpTextContext ctx) {
		System.out.println("Visiting RpText");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		NodeListImpl nodes = new NodeListImpl();
		for (int i = 0; i < currentNode.getChildNodes().getLength(); i++) {
			Node node = currentNode.getChildNodes().item(i);
			if (node.getNodeType() == Node.TEXT_NODE) {
				nodes.add(node);
			}
		}

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpConcatExpr(XQueryParser.RpConcatExprContext ctx) {
		System.out.println("Visiting RpConcatExpr");
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public XQueryResult visitRpSlashExpr(XQueryParser.RpSlashExprContext ctx) {
		System.out.println("Visiting RpSlashExpr");
		if (doc == null) {
			return null;
		}

		NodeListImpl nodes = new NodeListImpl();
		XQueryResult leftResult = visit(ctx.left);
		
		XQueryResultType resultType = XQueryResultType.NODES;

		if (leftResult.getNodes() != null && leftResult.getNodes().getLength() > 0) {
			for (int i = 0; i < leftResult.getNodes().getLength(); i++) {
				Node node = leftResult.getNodes().item(i);
				currentNode = node;
				XQueryResult rightResult = visit(ctx.right);
				nodes.addAll(rightResult.getNodes());
				resultType = rightResult.getType();
			}
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpFilterExpr(XQueryParser.RpFilterExprContext ctx) {
		System.out.println("Visiting RpFilterExpr");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		NodeListImpl nodes = new NodeListImpl();

		XQueryResult relPathResult = visit(ctx.relpath);
		NodeListImpl relPathNodes = relPathResult.getNodes();
		if (nodes != null) {
			for (Node node : relPathNodes) {
				currentNode = node;
				XQueryResult filterResult = visit(ctx.filter);
				if (filterResult.isTrue()) {
					nodes.add(node);
				}
			}
		}

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpTagName(XQueryParser.RpTagNameContext ctx) {
		System.out.println("Visiting RpTagName");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		NodeListImpl nodes = new NodeListImpl();
		for (int i = 0; i < currentNode.getChildNodes().getLength(); i++) {
			Node node = currentNode.getChildNodes().item(i);
			if (node.getNodeName().equals(ctx.tagName.getText())) {
				nodes.add(node);
			}
		}

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpDblDot(XQueryParser.RpDblDotContext ctx) {
		System.out.println("Visiting RpDblDot");
		if (doc == null) {
			return null;
		}

		
		
		NodeListImpl nodes = new NodeListImpl();
		nodes.add(currentNode.getParentNode());
		
		XQueryResultType resultType;
		if(currentNode.getParentNode().getNodeType() == Node.ATTRIBUTE_NODE) {
			resultType = XQueryResultType.ATTR;
		} else {
			resultType = XQueryResultType.NODES;
		}
		
		XQueryResult result = new XQueryResult(resultType);
		
		currentNode = currentNode.getParentNode();

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpAttrName(XQueryParser.RpAttrNameContext ctx) {
		System.out.println("Visiting RpAttrName");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.ATTR);
		NodeListImpl nodes = new NodeListImpl();
		nodes.add(((Element) currentNode).getAttributeNode(ctx.attrName.getText()));
		
		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
		System.out.println("Visiting RpWildCard");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		NodeListImpl nodes = new NodeListImpl();
		for (int i = 0; i < currentNode.getChildNodes().getLength(); i++) {
			Node node = currentNode.getChildNodes().item(i);
			nodes.add(node);
		}

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpParenExpr(XQueryParser.RpParenExprContext ctx) {
		System.out.println("Visiting RpParentExpr");
		if (doc == null) {
			return null;
		}

		XQueryResult result = visit(ctx.relpath);

		return result;
	}

	@Override
	public XQueryResult visitFilterAndExpr(XQueryParser.FilterAndExprContext ctx) {
		System.out.println("Visiting FilterAndExpr");
		//System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
	
		XQueryResult leftResult = visit(ctx.leftf);
		XQueryResult rightResult = visit(ctx.rightf);
		if(leftResult.isTrue() && rightResult.isTrue()){
			result.setTruth(true);
		}
		return result;
	}

	@Override
	public XQueryResult visitFilterRp(XQueryParser.FilterRpContext ctx) {
		System.out.println("Visiting FilterRp");
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		XQueryResult rpResult = visit(ctx.relPathFilter);
		result.setTruth(false);
		NodeListImpl nodes = rpResult.getNodes();
		if(nodes!=null && nodes.getLength()!=0)
		  result.setTruth(true);
		//System.out.println(ctx.toString());
		return result;
	}

	public boolean xEqualy (Node x , Node y){
		if(x==null || y==null){
			return false;
		}
		if(!x.getNodeName().equals(y.getNodeName())){
			return false;
		}
		if(x.getNodeType()!=y.getNodeType()){
			return false;
		}
		if(!x.getTextContent().equals(y.getTextContent())){
			return false;
		}
		if(x.getChildNodes().getLength()!=y.getChildNodes().getLength()){
			return false;
		}
		for(int i=0;i<x.getChildNodes().getLength();i++){
			if(!xEqualy(x.getChildNodes().item(i), y.getChildNodes().item(i))){
				return false;
			}
		}
	 return true;
	}
	@Override
	public XQueryResult visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx) {
		System.out.println("Visiting FilterEqualVal");
		//System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		XQueryResult rp1Result = visit(ctx.left);
		XQueryResult rp2Result = visit(ctx.right);
		NodeListImpl nodesLeft = rp1Result.getNodes();
		NodeListImpl nodesRight = rp2Result.getNodes();
		if(nodesLeft==null || nodesRight==null){
			return result;
		}
		for(int i=0;i<nodesLeft.getLength();i++){
			for(int j=0;j<nodesRight.getLength();j++){
				if(xEqualy(nodesLeft.item(i),nodesRight.item(j))){
					result.setTruth(true);
					break;
				}
			}
		}
		
		
		return result;
	}

	@Override
	public XQueryResult visitFilterOrExpr(XQueryParser.FilterOrExprContext ctx) {
		System.out.println("Visiting FilterOrExpr");
		//System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
	
		XQueryResult leftResult = visit(ctx.leftf);
		XQueryResult rightResult = visit(ctx.rightf);
		if(leftResult.isTrue() || rightResult.isTrue()){
			result.setTruth(true);
		}
		return result;
		
	}

	@Override
	public XQueryResult visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		System.out.println("Visiting FilterParentExpr");
		//System.out.println(ctx.toString());
		
		return visit(ctx.filter);
	}

	@Override
	public XQueryResult visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		System.out.println("Visiting FilterNotExpr");
		//System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
	
		XQueryResult tempResult = visit(ctx.filter);
		if(!tempResult.isTrue()){
			result.setTruth(true);
		}
		return result;
	}

	public boolean xIsy(Node x , Node y){
		if(x==null || y==null){
			return false;
		}
		if(x==y){
			return true;
		}
		else{
		  return false;
	    }
	}
	@Override
	public XQueryResult visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx) {
		System.out.println("Visiting FilterEqualId");
		//System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		XQueryResult rp1Result = visit(ctx.left);
		XQueryResult rp2Result = visit(ctx.right);
		NodeListImpl nodesLeft = rp1Result.getNodes();
		NodeListImpl nodesRight = rp2Result.getNodes();
		if(nodesLeft==null || nodesRight==null){
			return result;
		}
		for(int i=0;i<nodesLeft.getLength();i++){
			for(int j=0;j<nodesRight.getLength();j++){
				if(xIsy(nodesLeft.item(i),nodesRight.item(j))){
					result.setTruth(true);
					break;
				}
			}
		}
		
		return result;
	}

}
