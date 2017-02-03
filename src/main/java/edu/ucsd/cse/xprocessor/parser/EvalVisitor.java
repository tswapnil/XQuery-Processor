package edu.ucsd.cse.xprocessor.parser;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
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
	private Stack<Node> pathStack;
	private Node currentNode;

	public EvalVisitor() {
		super();
		this.doc = null;
		this.pathStack = new Stack<Node>();
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
		// System.out.println("Visiting ApDblSlashFile");

		if (doc == null) {
			return null;
		}

		XQueryResultType resultType = XQueryResultType.NODES;

		NodeListImpl nodes = new NodeListImpl();

		NodeListImpl allNodes = new NodeListImpl();

		pathStack.push(currentNode);
		while (!pathStack.isEmpty()) {
			Node temp = pathStack.pop();
			NodeList currNodeChildren = temp.getChildNodes();
			for (int i = currNodeChildren.getLength(); i >= 0; i--) {
				pathStack.add(currNodeChildren.item(i));
			}
			allNodes.add(temp);
		}

		if (allNodes != null && allNodes.getLength() > 0) {
			for (int i = 0; i < allNodes.getLength(); i++) {
				Node node = allNodes.item(i);
				currentNode = node;
				XQueryResult rightResult = visit(ctx.relpath);
				nodes.addAll(rightResult.getNodes());
				resultType = rightResult.getType();
			}
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx) {
		System.out.println("Visiting RpDblSlashFile");
		System.out.flush();
		if (doc == null) {
			return null;
		}

		XQueryResultType resultType = XQueryResultType.NODES;

		NodeListImpl nodes = new NodeListImpl();

		NodeListImpl allLeftNodes = new NodeListImpl();

		XQueryResult leftResult = visit(ctx.left);
		if (leftResult != null && leftResult.getNodes() != null) {
			for (int i = leftResult.getNodes().getLength(); i >= 0; i--) {
				pathStack.push(leftResult.getNodes().item(i));
			}
		}
		while (!pathStack.isEmpty()) {
			Node temp = pathStack.pop();
			NodeList currNodeChildren = temp.getChildNodes();
			for (int i = currNodeChildren.getLength(); i >= 0; i--) {
				Node child = currNodeChildren.item(i);
				if(child != null && child.getNodeType() == Node.ELEMENT_NODE) {
					pathStack.add(child);
				}
			}
			allLeftNodes.add(temp);
		}

		if (allLeftNodes != null && allLeftNodes.getLength() > 0) {
			for (int i = 0; i < allLeftNodes.getLength(); i++) {
				Node node = allLeftNodes.item(i);
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
	public XQueryResult visitRpDot(XQueryParser.RpDotContext ctx) {
		// System.out.println("Visiting RpDot");
		if (doc == null) {
			return null;
		}

		XQueryResultType resultType;
		if (currentNode.getNodeType() == Node.ATTRIBUTE_NODE) {
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
		// System.out.println("Visiting RpText");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.TEXT);
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
		if (doc == null) {
			return null;
		}

		XQueryResult leftResult = visit(ctx.left);
		XQueryResult rightResult = visit(ctx.right);

		if (leftResult != null && rightResult != null && leftResult.getType() != rightResult.getType()) {
			System.err.println("Cannot concatenate lists of different types");
			return null;
		}

		XQueryResultType resultType = XQueryResultType.NODES;
		NodeListImpl nodes = new NodeListImpl();
		if (leftResult != null) {
			resultType = leftResult.getType();
			if (leftResult.getNodes() != null) {
				nodes.addAll(leftResult.getNodes());
			}
		}

		if (rightResult != null) {
			resultType = rightResult.getType();
			if (rightResult.getNodes() != null) {
				nodes.addAll(rightResult.getNodes());
			}
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpSlashExpr(XQueryParser.RpSlashExprContext ctx) {
		// System.out.println("Visiting RpSlashExpr" + ctx.left.getText() +"/"+
		// ctx.right.getText());
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
		// System.out.println("Visiting RpFilterExpr");
		if (doc == null) {
			return null;
		}

		XQueryResult relPathResult = visit(ctx.relpath);
		NodeListImpl relPathNodes = relPathResult.getNodes();
		XQueryResult result = new XQueryResult(relPathResult.getType());
		NodeListImpl nodes = new NodeListImpl();
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
		// System.out.println("Visiting RpTagName " + ctx.tagName.getText());
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

		Node parentNode = null;
		if (currentNode.getNodeType() == Node.ATTRIBUTE_NODE) {
			parentNode = ((Attr) currentNode).getOwnerElement();
		} else {
			parentNode = currentNode.getParentNode();
		}

		nodes.add(parentNode);

		XQueryResultType resultType;
		if (parentNode.getNodeType() == Node.ATTRIBUTE_NODE) {
			resultType = XQueryResultType.ATTR;
		} else if (parentNode.getNodeType() == Node.TEXT_NODE) {
			resultType = XQueryResultType.TEXT;
		} else {
			resultType = XQueryResultType.NODES;
		}

		XQueryResult result = new XQueryResult(resultType);

		currentNode = parentNode;

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
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);

		XQueryResult leftResult = visit(ctx.leftf);
		XQueryResult rightResult = visit(ctx.rightf);
		if (leftResult.isTrue() && rightResult.isTrue()) {
			result.setTruth(true);
		}
		return result;
	}

	@Override
	public XQueryResult visitFilterRp(XQueryParser.FilterRpContext ctx) {
		System.out.println("Visiting FilterRp");
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		XQueryResult rpResult = visit(ctx.relPath);
		result.setTruth(false);
		NodeListImpl nodes = rpResult.getNodes();
		if (nodes != null && nodes.getLength() != 0)
			result.setTruth(true);
		// System.out.println(ctx.toString());
		return result;
	}

	public boolean xEqualy(Node x, Node y) {
		if (x == null || y == null) {
			return false;
		}
		if (!x.getNodeName().equals(y.getNodeName())) {
			return false;
		}
		if (x.getNodeType() != y.getNodeType()) {
			return false;
		}
		if (!x.getTextContent().equals(y.getTextContent())) {
			return false;
		}
		if (x.getChildNodes().getLength() != y.getChildNodes().getLength()) {
			return false;
		}
		for (int i = 0; i < x.getChildNodes().getLength(); i++) {
			if (!xEqualy(x.getChildNodes().item(i), y.getChildNodes().item(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public XQueryResult visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx) {
		System.out.println("Visiting FilterEqualVal");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		XQueryResult rp1Result = visit(ctx.left);
		XQueryResult rp2Result = visit(ctx.right);
		NodeListImpl nodesLeft = rp1Result.getNodes();
		NodeListImpl nodesRight = rp2Result.getNodes();
		if (nodesLeft == null || nodesRight == null) {
			return result;
		}
		for (int i = 0; i < nodesLeft.getLength(); i++) {
			for (int j = 0; j < nodesRight.getLength(); j++) {
				if (xEqualy(nodesLeft.item(i), nodesRight.item(j))) {
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
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);

		XQueryResult leftResult = visit(ctx.leftf);
		XQueryResult rightResult = visit(ctx.rightf);
		if (leftResult.isTrue() || rightResult.isTrue()) {
			result.setTruth(true);
		}
		return result;

	}

	@Override
	public XQueryResult visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		System.out.println("Visiting FilterParentExpr");
		// System.out.println(ctx.toString());

		return visit(ctx.filter);
	}

	@Override
	public XQueryResult visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		System.out.println("Visiting FilterNotExpr");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);

		XQueryResult tempResult = visit(ctx.filter);
		if (!tempResult.isTrue()) {
			result.setTruth(true);
		}
		return result;
	}

	public boolean xIsy(Node x, Node y) {
		if (x == null || y == null) {
			return false;
		}
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public XQueryResult visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx) {
		System.out.println("Visiting FilterEqualId");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		XQueryResult rp1Result = visit(ctx.left);
		XQueryResult rp2Result = visit(ctx.right);
		NodeListImpl nodesLeft = rp1Result.getNodes();
		NodeListImpl nodesRight = rp2Result.getNodes();
		if (nodesLeft == null || nodesRight == null) {
			return result;
		}
		for (int i = 0; i < nodesLeft.getLength(); i++) {
			for (int j = 0; j < nodesRight.getLength(); j++) {
				if (xIsy(nodesLeft.item(i), nodesRight.item(j))) {
					result.setTruth(true);
					break;
				}
			}
		}

		return result;
	}

}
