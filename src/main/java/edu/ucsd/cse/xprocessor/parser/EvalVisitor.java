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
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import edu.ucsd.cse.xprocessor.parser.context.XQueryContext;
import edu.ucsd.cse.xprocessor.result.NodeListImpl;
import edu.ucsd.cse.xprocessor.result.XQueryResult;
import edu.ucsd.cse.xprocessor.result.XQueryResultType;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 * @author Swapnil Taneja (swtaneja@eng.ucsd.edu)
 * @param <T>
 *
 */
public class EvalVisitor extends XQueryBaseVisitor<XQueryResult> {

	private Document doc;
	private Stack<XQueryContext> contextStack;
	private Stack<Node> pathStack;
	private Node currentNode;
	private XQueryContext currentContext;

	public EvalVisitor() {
		super();
		this.doc = null;
		this.contextStack = new Stack<XQueryContext>();
		this.pathStack = new Stack<Node>();
		this.currentNode = null;
		this.currentContext = new XQueryContext();
	}

	/**
	 * Milestone #2
	 */

	private static Text makeText(String text) {
		Text textNode = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			textNode = doc.createTextNode(text);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		return textNode;
	}

	private static Element makeElement(String tagName, NodeListImpl nodes) {
		Element elementNode = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			elementNode = doc.createElement(tagName);
			if (nodes != null) {
				for (Node node : nodes) {
					if (node.getNodeType() == Node.ELEMENT_NODE || node.getNodeType() == Node.TEXT_NODE) {
						elementNode.appendChild(doc.importNode(node, true));
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		return elementNode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqAp(XQueryParser.XqApContext ctx) {
		// no change required
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqJoinExpr(XQueryParser.XqJoinExprContext ctx) {
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqVar(XQueryParser.XqVarContext ctx) {
		XQueryResult result = null;
		if (currentContext != null) {
			String varName = ctx.var.getText();
			Node value = currentContext.getVariableValue(varName);

			result = new XQueryResult(XQueryResultType.NODES);
			NodeListImpl nodes = new NodeListImpl();
			nodes.add(value);
			result.setNodes(nodes);
			
			return result;
		} else {
			throw new NullPointerException("Variable context is null");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqContTagExpr(XQueryParser.XqContTagExprContext ctx) {

		// make sure open and closing tag names match
		if (!ctx.openTagName.getText().equals(ctx.closeTagName.getText())) {
			throw new RuntimeException(
					"Malformed query! Opening and closing tag-name for the container node do not match.");
		}

		String tagName = ctx.openTagName.getText();
		XQueryResult queryResult = visit(ctx.query);
		NodeListImpl queryNodes = null;
		if (queryResult != null) {
			queryNodes = queryResult.getNodes();
		}

		NodeListImpl nodes = new NodeListImpl();
		nodes.add(makeElement(tagName, queryNodes));
		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		result.setNodes(nodes);

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqParenExpr(XQueryParser.XqParenExprContext ctx) {
		// no further change required
		return visit(ctx.query);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx) {
		String strConst = ctx.strConst.getText();

		NodeListImpl nodes = new NodeListImpl();
		nodes.add(makeText(strConst));

		XQueryResult result = new XQueryResult(XQueryResultType.TEXT);
		result.setNodes(nodes);

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqLetExpr(XQueryParser.XqLetExprContext ctx) {
		if (currentContext != null) {
			// letClause only updates the current context but returns null so
			// ignoring return value
			visit(ctx.declaration);

			XQueryResult queryResult = visit(ctx.query);
			return queryResult;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqConcatExpr(XQueryParser.XqConcatExprContext ctx) {
		XQueryResult leftResult = visit(ctx.leftQuery);
		XQueryResult rightResult = visit(ctx.rightQuery);

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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx) {

		XQueryResultType resultType = XQueryResultType.NODES;

		NodeListImpl nodes = new NodeListImpl();
		NodeListImpl allQueryNodes = new NodeListImpl();

		XQueryResult queryResult = visit(ctx.query);
		if (queryResult != null && queryResult.getNodes() != null) {
			for (int i = queryResult.getNodes().getLength(); i >= 0; i--) {
				pathStack.push(queryResult.getNodes().item(i));
			}
		}

		while (!pathStack.isEmpty()) {
			Node temp = pathStack.pop();
			if (temp != null) {
				if (temp.hasChildNodes()) {
					NodeList currNodeChildren = temp.getChildNodes();
					for (int i = currNodeChildren.getLength(); i >= 0; i--) {
						Node child = currNodeChildren.item(i);
						if (child != null && child.getNodeType() == Node.ELEMENT_NODE) {
							pathStack.add(child);
						}
					}
					allQueryNodes.add(temp);
				}
			}
		}

		if (allQueryNodes != null && allQueryNodes.getLength() > 0) {
			for (int i = 0; i < allQueryNodes.getLength(); i++) {
				Node node = allQueryNodes.item(i);
				currentNode = node;
				XQueryResult rpResult = visit(ctx.relPath);
				nodes.addAll(rpResult.getNodes());
				resultType = rpResult.getType();
			}
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqForExpr(XQueryParser.XqForExprContext ctx) {
		XQueryResultType resultType = XQueryResultType.NODES;
		NodeListImpl nodes = new NodeListImpl();

		if (currentContext != null) {
			// push current context to the stack as for loop scope begins
			contextStack.push(currentContext);

			// forClause visit must update context with new variable values and
			// return a boolean saying if there are more iterations remaining
			// (like hasNext() in an iterator).
			XQueryResult loopResult = visit(ctx.loop);
			while (loopResult != null && loopResult.getType() == XQueryResultType.BOOLEAN && loopResult.isTrue()) {

				if (ctx.declaration != null) {
					visit(ctx.declaration);
				}

				boolean conditionSatisfied = false;
				if (ctx.condition != null) {
					XQueryResult conditionResult = visit(ctx.condition);
					if (conditionResult.getType() == XQueryResultType.BOOLEAN) {
						conditionSatisfied = conditionResult.isTrue();
					}
				}

				// (Return in XQuery is like 'emit' in map-reduce and not
				// regular return stmt i.e. combine returned results)
				if (conditionSatisfied) {
					XQueryResult returnResult = visit(ctx.output);
					nodes.addAll(returnResult.getNodes());
					resultType = returnResult.getType();
				}

				loopResult = visit(ctx.loop);
			}

			// restore the context from the stack as for loop scope has ended
			currentContext = contextStack.pop();
		} else {
			throw new NullPointerException("Variable context is null.");
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqSlashExpr(XQueryParser.XqSlashExprContext ctx) {
		NodeListImpl nodes = new NodeListImpl();
		XQueryResult queryResult = visit(ctx.query);

		XQueryResultType resultType = XQueryResultType.NODES;

		if (queryResult.getNodes() != null && queryResult.getNodes().getLength() > 0) {
			for (int i = 0; i < queryResult.getNodes().getLength(); i++) {
				Node node = queryResult.getNodes().item(i);
				currentNode = node;
				XQueryResult rpResult = visit(ctx.relPath);
				if (rpResult == null) {
					continue;
				}
				nodes.addAll(rpResult.getNodes());
				resultType = rpResult.getType();
			}
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitForVarIter(XQueryParser.ForVarIterContext ctx) {
		if (currentContext != null) {
			if (ctx.varList.size() != ctx.queryList.size()) {
				throw new RuntimeException("Malformed query! Number of variables and sub-queries are not same.");
			}

			for (int i = 0; i < ctx.varList.size(); i++) {
				String varName = ctx.varList.get(i).getText();
				XQueryResult subQueryResult = visit(ctx.queryList.get(i));
				String resultIterName = "_" + varName + "_iter";
				currentContext = currentContext.setVariableValue(resultIterName, subQueryResult);
			}

			return null;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitLetVarDef(XQueryParser.LetVarDefContext ctx) {
		if (currentContext != null) {
			if (ctx.varList.size() != ctx.queryList.size()) {
				throw new RuntimeException("Malformed query! Number of variables and sub-queries are not same.");
			}

			for (int i = 0; i < ctx.varList.size(); i++) {
				String varName = ctx.varList.get(i).getText();
				XQueryResult subQueryResult = visit(ctx.queryList.get(i));
				currentContext = currentContext.setVariableValue(varName, subQueryResult);
			}

			return null;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitWhereCondExpr(XQueryParser.WhereCondExprContext ctx) {
		if (currentContext != null) {
			XQueryResult conditionResult = visit(ctx.condition);

			return conditionResult;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitReturnQuery(XQueryParser.ReturnQueryContext ctx) {
		if (currentContext != null) {
			XQueryResult queryResult = visit(ctx.query);

			return queryResult;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondEmpty(XQueryParser.CondEmptyContext ctx) {
		XQueryResult result = null;
		XQueryResult queryResult = visit(ctx.query);
		if (queryResult == null) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(true);
		} else if (queryResult.getType() != XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(queryResult.getNodes().isEmpty());
		} else {
			/* do nothing */
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondVarCheck(XQueryParser.CondVarCheckContext ctx) {
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondOrExpr(XQueryParser.CondOrExprContext ctx) {
		XQueryResult result = null;
		XQueryResult leftResult = visit(ctx.leftCondition);
		XQueryResult rightResult = visit(ctx.rightCondition);
		if (leftResult != null && rightResult != null && leftResult.getType() == XQueryResultType.BOOLEAN
				&& rightResult.getType() == XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(leftResult.isTrue() || rightResult.isTrue());
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondParenExpr(XQueryParser.CondParenExprContext ctx) {
		XQueryResult result = null;
		XQueryResult conditionResult = visit(ctx.condition);
		if (conditionResult != null && conditionResult.getType() == XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(conditionResult.isTrue());
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondEqualVal(XQueryParser.CondEqualValContext ctx) {
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondAndExpr(XQueryParser.CondAndExprContext ctx) {
		XQueryResult result = null;
		XQueryResult leftResult = visit(ctx.leftCondition);
		XQueryResult rightResult = visit(ctx.rightCondition);
		if (leftResult != null && rightResult != null && leftResult.getType() == XQueryResultType.BOOLEAN
				&& rightResult.getType() == XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(leftResult.isTrue() && rightResult.isTrue());
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondEqualId(XQueryParser.CondEqualIdContext ctx) {
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondNotExpr(XQueryParser.CondNotExprContext ctx) {
		XQueryResult result = null;
		XQueryResult conditionResult = visit(ctx.condition);
		if (conditionResult != null && conditionResult.getType() == XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(!conditionResult.isTrue());
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitJoinDef(XQueryParser.JoinDefContext ctx) {
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * Milestone #2 Ends
	 */

	/**
	 * Milestone #1
	 */

	@Override
	public XQueryResult visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {
		// System.out.println("visiting ApSlashFile");
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

		if (doc != null) {
			Node docRoot = doc.getDocumentElement();
			currentNode = docRoot;

		}

		XQueryResultType resultType = XQueryResultType.NODES;

		NodeListImpl nodes = new NodeListImpl();

		NodeListImpl allNodes = new NodeListImpl();

		pathStack.push(currentNode);
		while (!pathStack.isEmpty()) {
			Node temp = pathStack.pop();
			if (temp != null) {
				if (temp.hasChildNodes()) {
					NodeList currNodeChildren = temp.getChildNodes();
					for (int i = currNodeChildren.getLength(); i >= 0; i--) {
						pathStack.add(currNodeChildren.item(i));
					}

					allNodes.add(temp);
				}
			}
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
		// System.out.println("Visiting RpDblSlashFile");
		// System.out.flush();
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
			if (temp != null) {
				if (temp.hasChildNodes()) {
					NodeList currNodeChildren = temp.getChildNodes();
					for (int i = currNodeChildren.getLength(); i >= 0; i--) {
						Node child = currNodeChildren.item(i);
						if (child != null && child.getNodeType() == Node.ELEMENT_NODE) {
							pathStack.add(child);
						}
					}
					allLeftNodes.add(temp);
				}
			}
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
				if (rightResult == null) {
					continue;
				}
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
		// System.out.println("Visiting RpDblDot");
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
		// System.out.println("Visiting RpAttrName");
		if (doc == null) {
			return null;
		}

		XQueryResult result = new XQueryResult(XQueryResultType.ATTR);
		if (ctx.attrName == null) {
			return result;
		}

		NodeListImpl nodes = new NodeListImpl();
		Node att = ((Element) currentNode).getAttributeNode(ctx.attrName.getText());
		nodes.add(att);

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
		// System.out.println("Visiting RpWildCard");
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
		// System.out.println("Visiting RpParentExpr");
		if (doc == null) {
			return null;
		}

		XQueryResult result = visit(ctx.relpath);

		return result;
	}

	@Override
	public XQueryResult visitFilterAndExpr(XQueryParser.FilterAndExprContext ctx) {
		// System.out.println("Visiting FilterAndExpr");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		Node temp = currentNode;
		XQueryResult leftResult = visit(ctx.leftf);
		currentNode = temp;
		XQueryResult rightResult = visit(ctx.rightf);
		currentNode = temp;
		if (leftResult.isTrue() && rightResult.isTrue()) {
			result.setTruth(true);
		}
		return result;
	}

	@Override
	public XQueryResult visitFilterRp(XQueryParser.FilterRpContext ctx) {
		// System.out.println("Visiting FilterRp");
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		Node temp = currentNode;
		XQueryResult rpResult = visit(ctx.relPath);
		currentNode = temp;
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
		// System.out.println("Visiting FilterEqualVal");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		Node temp = currentNode;
		XQueryResult rp1Result = visit(ctx.left);
		currentNode = temp;
		XQueryResult rp2Result = visit(ctx.right);
		currentNode = temp;
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
		// System.out.println("Visiting FilterOrExpr");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		Node temp = currentNode;
		XQueryResult leftResult = visit(ctx.leftf);
		currentNode = temp;
		XQueryResult rightResult = visit(ctx.rightf);
		currentNode = temp;
		if (leftResult.isTrue() || rightResult.isTrue()) {
			result.setTruth(true);
		}
		return result;

	}

	@Override
	public XQueryResult visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		// System.out.println("Visiting FilterParentExpr");
		// System.out.println(ctx.toString());
		Node temp = currentNode;
		XQueryResult result = visit(ctx.filter);
		currentNode = temp;
		return result;
	}

	@Override
	public XQueryResult visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		// System.out.println("Visiting FilterNotExpr");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		Node temp = currentNode;
		XQueryResult tempResult = visit(ctx.filter);
		currentNode = temp;
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
		// System.out.println("Visiting FilterEqualId");
		// System.out.println(ctx.toString());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);
		Node temp = currentNode;
		XQueryResult rp1Result = visit(ctx.left);
		currentNode = temp;

		XQueryResult rp2Result = visit(ctx.right);
		currentNode = temp;
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
