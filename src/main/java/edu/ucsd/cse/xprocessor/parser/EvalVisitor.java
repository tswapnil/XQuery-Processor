package edu.ucsd.cse.xprocessor.parser;

import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
	private Stack<Integer> forStack;
	private int currentForIteration;

	public EvalVisitor() {
		super();
		this.doc = null;
		this.contextStack = new Stack<XQueryContext>();
		this.pathStack = new Stack<Node>();
		this.currentNode = null;
		this.currentContext = new XQueryContext();
		this.forStack = new Stack<Integer>();
		this.currentForIteration = -1;
	}

	/**
	 * Milestone #3
	 * 
	 * @throws Exception
	 * 
	 * 
	 */

	public NodeListImpl join(XQueryContext listL, XQueryContext listR, NodeListImpl attListL, NodeListImpl attListR)
			throws Exception {
		if (attListL.getLength() != attListR.getLength()) {
			throw new Exception("Attribute Lists are not of equal length ");
		}
		return null;
	}

	/**
	 * Milestone #2
	 */

	private static Text makeText(String text) {
		//System.out.println("visiting makeText");
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
		//System.out.println("visiting makeElement");
		Element elementNode = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			elementNode = doc.createElement(tagName);
			if (nodes != null) {
				for (Node node : nodes) {
					if(node ==null){
						//System.out.println("Node is null");
						continue;
					}
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
		//System.out.println("visiting XqAp");
		// no change required
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqJoinExpr(XQueryParser.XqJoinExprContext ctx) {
		//System.out.println("visiting XqJoinExpr");
		// TODO: to be completed
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqVar(XQueryParser.XqVarContext ctx) {
		//System.out.println("visiting XqVar");
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

	@Override
	public XQueryResult visitXqTagClause(XQueryParser.XqTagClauseContext ctx) {
		//System.out.println("visiting XqTagClause");

		return visitChildren(ctx);
	}

	@Override
	public XQueryResult visitTagClauseImpl(XQueryParser.TagClauseImplContext ctx) {
		if (ctx.openTagNameList.size() != ctx.closeTagNameList.size()) {
			throw new IllegalArgumentException("Please keep the number of open tags and closed tags same");
		}
		if (ctx.openTagNameList.size() != ctx.queryList.size()) {
			throw new IllegalArgumentException("Please keep the number of tags and queries same");
		}
		NodeListImpl nodes = new NodeListImpl();
		for (int i = 0; i < ctx.openTagNameList.size(); i++) {
			if (!ctx.openTagNameList.get(i).getText().equals(ctx.closeTagNameList.get(i).getText())) {
				throw new IllegalArgumentException("Please keep the tag Names same");
			}
			XQueryResult queryResult = visit(ctx.queryList.get(i));
			String tagName = ctx.openTagNameList.get(i).getText();

			NodeListImpl queryNodes = null;
			if (queryResult != null) {
				queryNodes = queryResult.getNodes();
			}
			nodes.add(makeElement(tagName, queryNodes));

		}
		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		result.setNodes(nodes);
		return result;

	}

	/**
	 * {@inheritDoc}
	 */
	/*
	 * @Override public XQueryResult
	 * visitXqContTagExpr(XQueryParser.XqContTagExprContext ctx) {
	 * System.out.println("visiting XqContTagExpr");
	 * System.out.println(ctx.openTagName.getText());
	 * System.out.println(ctx.closeTagName.getText());
	 * 
	 * // make sure open and closing tag names match if
	 * (!ctx.openTagName.getText().equals(ctx.closeTagName.getText())) { throw
	 * new RuntimeException(
	 * "Malformed query! Opening and closing tag-name for the container node do not match. OpenTag: "
	 * + ctx.openTagName.getText() + ", CloseTag: " +
	 * ctx.closeTagName.getText()); }
	 * 
	 * String tagName = ctx.openTagName.getText(); XQueryResult queryResult =
	 * visit(ctx.query); NodeListImpl queryNodes = null; if (queryResult !=
	 * null) { queryNodes = queryResult.getNodes(); }
	 * 
	 * NodeListImpl nodes = new NodeListImpl(); nodes.add(makeElement(tagName,
	 * queryNodes)); XQueryResult result = new
	 * XQueryResult(XQueryResultType.NODES); result.setNodes(nodes);
	 * 
	 * return null; }
	 */

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqParenExpr(XQueryParser.XqParenExprContext ctx) {
		//System.out.println("visiting XqParenExpr");
		// no further change required
		return visit(ctx.query);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx) {
		//System.out.println("visiting XqStrConstDef");
		String strConst = ctx.strConst.getText();
		strConst = strConst.substring(1, strConst.length() - 1);

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
		//System.out.println("Visiting let expr");
		if (currentContext != null) {
			// letClause only updates the current context but returns null so
			// ignoring return value
			visit(ctx.declaration);

			XQueryResult queryResult = visit(ctx.query);
			if (queryResult == null) {
				XQueryResultType resultType = XQueryResultType.NODES;
				NodeListImpl nodes = new NodeListImpl();

				queryResult = new XQueryResult(resultType);
				queryResult.setNodes(nodes);
			}
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
		System.out.println("visiting XqConcatExpr");
		System.out.println(ctx.leftQuery.getText());
		System.out.println(ctx.rightQuery.getText());
		
		XQueryResult leftResult = visit(ctx.leftQuery);
		XQueryResult rightResult = visit(ctx.rightQuery);

		System.out.println("left nodes -------");
		for(int i=0;i<leftResult.getNodes().getLength();i++){
			System.out.println(leftResult.getNodes().item(i));
			
		}
		System.out.println("right nodes -------");
		for(int i=0;i<rightResult.getNodes().getLength();i++){
			System.out.println(rightResult.getNodes().item(i));
			
		}
		
		if (leftResult != null && rightResult != null && leftResult.getType() != rightResult.getType()) {
			System.err.println("Cannot concatenate lists of different types");
			return null;
		}

		XQueryResultType resultType = XQueryResultType.NODES;
		NodeListImpl nodes = new NodeListImpl();
		if (leftResult != null) {
			resultType = leftResult.getType();
			if (leftResult.getNodes() != null) {
				System.out.println("Populating left Nodes");
				nodes.addAll(leftResult.getNodes());
			}
		}

		if (rightResult != null) {
			resultType = rightResult.getType();
			if (rightResult.getNodes() != null) {
				System.out.println("Populating right Nodes");
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
		//System.out.println("visiting XqDblSlashExpr");
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
		//System.out.println("visiting XqForExpr");
		long startTime = System.currentTimeMillis();
		XQueryResultType resultType = XQueryResultType.NODES;
		NodeListImpl nodes = new NodeListImpl();

		if (currentContext != null) {
			// push current context to the stack as for loop scope begins
			contextStack.push(currentContext);

			if (currentForIteration > -1) {
				forStack.push(currentForIteration);
			}
			currentForIteration = 0;

			// forClause visit must update context with new variable values and
			// return a boolean saying if there are more iterations remaining
			// (like hasNext() in an iterator).
			XQueryResult loopResult = visit(ctx.loop);
			while (loopResult != null && loopResult.getType() == XQueryResultType.BOOLEAN && loopResult.isTrue()) {

				if (ctx.declaration != null) {
					visit(ctx.declaration);
				}

				boolean conditionSatisfied = true;
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

				// Increment iteration count
				currentForIteration++;

				loopResult = visit(ctx.loop);
			}

			// restore the context from the stack as for loop scope has ended
			currentContext = contextStack.pop();

			// restore iteration count for any previous for statement
			try {
				currentForIteration = forStack.pop().intValue();
			} catch (EmptyStackException e) {
				// we have exited the outer most for so invalidate iteration
				// count
				currentForIteration = -1;
				// e.printStackTrace();
			}
		} else {
			throw new NullPointerException("Variable context is null.");
		}

		XQueryResult result = new XQueryResult(resultType);
		result.setNodes(nodes);
		long stopTime = System.currentTimeMillis();
		long timeElapsed = stopTime - startTime;
		//System.out.println("Time Elapsed for Nested For Query = " + timeElapsed);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitXqSlashExpr(XQueryParser.XqSlashExprContext ctx) {
		//System.out.println("visiting XqSlashExpr");
		NodeListImpl nodes = new NodeListImpl();
		XQueryResult queryResult = visit(ctx.query);
		//System.out.println(ctx.query.getText());
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
			//System.out.println("visiting ForVarIter");
			if (ctx.varList.size() != ctx.queryList.size()) {
				throw new RuntimeException("Malformed query! Number of variables and sub-queries are not same.");
			}

			boolean firstIteration = false;

			if (currentForIteration == 0) {
				firstIteration = true;
				for (int i = 0; i < ctx.varList.size(); i++) {
					String varName = ctx.varList.get(i).getText();
					// System.out.println(varName);
					XQueryResult subQueryResult = visit(ctx.queryList.get(i));
					// System.out.println("QueryList(i) =
					// "+ctx.queryList.get(i).getText());
					// System.out.println("For subqueryresult " +
					// subQueryResult.getNodes().get(0).getChildNodes().item(1).getTextContent());
					// System.out.println("For subqueryresult " +
					// subQueryResult.getNodes().get(1));
					currentContext = currentContext.setVariableValue(varName, subQueryResult);
				}
			}

			boolean iterationsLeft = true;

			if (firstIteration) {
				for (int i = 0; i < ctx.varList.size(); i++) {
					String varName = ctx.varList.get(i).getText();
					// check if none of the variables is running on an empty
					// from the beginning
					// else there is no point iterating
					if (currentContext.getVariableValue(varName) == null) {
						iterationsLeft = false;
					}
				}
			} else {
				int varNum = ctx.varList.size() - 1; // start from last variable
														// (i.e. inner most)
				boolean allVariablesExhausted = true;
				while (varNum >= 0) { // condition here
					String varName = ctx.varList.get(varNum).getText();
					if (currentContext.incrementVariableIterator(varName) == false) {
						varNum--;
					} else {
						allVariablesExhausted = false;

						// reset/re-evaluate all variables (already exhausted)
						// to the right of this variable as their context has
						// changed.
						for (int i = varNum + 1; i < ctx.varList.size(); i++) {
							String vName = ctx.varList.get(i).getText();
							XQueryResult subQueryResult = visit(ctx.queryList.get(i));
							currentContext = currentContext.setVariableValue(vName, subQueryResult);
						//	System.out.println("QueryList(i) = " + ctx.queryList.get(i).getText());
						//	System.out.println("For subqueryresult " + subQueryResult.getNodes());

						}

						// exit while loop as all variables are now ready for
						// next iteration
						break;
					}
				}

				if (allVariablesExhausted) {
					iterationsLeft = false;
				}
			}

			XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(iterationsLeft);
			return result;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitLetVarDef(XQueryParser.LetVarDefContext ctx) {

		//System.out.println("visiting LetVarDef");
		if (currentContext != null) {
			if (ctx.varList.size() != ctx.queryList.size()) {
				throw new RuntimeException("Malformed query! Number of variables and sub-queries are not same.");
			}

			for (int i = 0; i < ctx.varList.size(); i++) {
				String varName = ctx.varList.get(i).getText();
				XQueryResult subQueryResult = visit(ctx.queryList.get(i));
				currentContext = currentContext.setVariableValue(varName, subQueryResult);
			}
			XQueryResultType resultType = XQueryResultType.NODES;
			NodeListImpl nodes = new NodeListImpl();

			XQueryResult result = new XQueryResult(resultType);
			result.setNodes(nodes);

			return result;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitWhereCondExpr(XQueryParser.WhereCondExprContext ctx) {
		//System.out.println("visiting where Cond");
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
	public XQueryResult visitCondEmpty(XQueryParser.CondEmptyContext ctx) {
		//System.out.println("visiting CondEmpty");
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
	public XQueryResult visitReturnQuery(XQueryParser.ReturnQueryContext ctx) {
		//System.out.println("visiting ReturnQuery");
		if (currentContext != null) {
			XQueryResult queryResult = visit(ctx.query);

			return queryResult;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	private XQueryResult visitCondVarIter(XQueryParser.CondVarCheckContext ctx) {
		//System.out.println("visiting CondVarIter");
		if (currentContext != null) {
			if (ctx.varList.size() != ctx.queryList.size()) {
				throw new RuntimeException("Malformed query! Number of variables and sub-queries are not same.");
			}

			boolean firstIteration = false;

			if (currentForIteration == 0) {
				firstIteration = true;
				for (int i = 0; i < ctx.varList.size(); i++) {
					String varName = ctx.varList.get(i).getText();

					XQueryResult subQueryResult = visit(ctx.queryList.get(i));
					//System.out.println("Varname is " + varName + " Query is " + ctx.queryList.get(i).getText());
					//System.out.println("Result of the query is " + subQueryResult.getNodes());
					currentContext = currentContext.setVariableValue(varName, subQueryResult);
				}
			}

			boolean iterationsLeft = true;

			if (firstIteration) {
				for (int i = 0; i < ctx.varList.size(); i++) {
					String varName = ctx.varList.get(i).getText();
					// check if none of the variables is running on an empty
					// from the beginning
					// else there is no point iterating
					if (currentContext.getVariableValue(varName) == null) {
						iterationsLeft = false;
					}
				}
			} else {
				int varNum = ctx.varList.size() - 1; // start from last variable
														// (i.e. inner most)
				boolean allVariablesExhausted = true;
				while (varNum >= 0) { // condition here
					String varName = ctx.varList.get(varNum).getText();
					if (currentContext.incrementVariableIterator(varName) == false) {
						varNum--;
					} else {
						allVariablesExhausted = false;

						// reset/re-evaluate all variables (already exhausted)
						// to the right of this variable as their context has
						// changed.
						for (int i = varNum + 1; i < ctx.varList.size(); i++) {
							String vName = ctx.varList.get(i).getText();
							XQueryResult subQueryResult = visit(ctx.queryList.get(i));
							currentContext = currentContext.setVariableValue(vName, subQueryResult);
						}

						// exit while loop as all variables are now ready for
						// next iteration
						break;
					}
				}

				if (allVariablesExhausted) {
					iterationsLeft = false;
				}
			}

			XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(iterationsLeft);
			return result;
		} else {
			throw new NullPointerException("Variable context is null.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondVarCheck(XQueryParser.CondVarCheckContext ctx) {
		//System.out.println("visiting CondVarCheck");
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);

		if (currentContext != null) {
			// push current context to the stack as for loop scope begins
			contextStack.push(currentContext);

			if (currentForIteration > -1) {
				forStack.push(currentForIteration);
			}
			currentForIteration = 0;

			boolean conditionSatisfied = false;

			// forClause visit must update context with new variable values and
			// return a boolean saying if there are more iterations remaining
			// (like hasNext() in an iterator).
			XQueryResult iterResult = visitCondVarIter(ctx);
			while (iterResult != null && iterResult.getType() == XQueryResultType.BOOLEAN && iterResult.isTrue()) {
				XQueryResult conditionResult = visit(ctx.condition);
				if (conditionResult.getType() == XQueryResultType.BOOLEAN) {
					conditionSatisfied = conditionResult.isTrue();
				}

				if (conditionSatisfied) {
					break;
				}

				// Increment iteration count
				currentForIteration++;

				iterResult = visitCondVarIter(ctx);
			}

			// restore the context from the stack as for loop scope has ended
			currentContext = contextStack.pop();

			// restore iteration count for any previous for statement
			try {
				currentForIteration = forStack.pop().intValue();
			} catch (EmptyStackException e) {
				// we have exited the outer most for so invalidate iteration
				// count
				currentForIteration = -1;
				// e.printStackTrace();
			}

			result.setTruth(conditionSatisfied);
		} else {
			throw new NullPointerException("Variable context is null.");
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondOrExpr(XQueryParser.CondOrExprContext ctx) {
		//System.out.println("visiting CondorExpr");
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
		//System.out.println("visiting CondParenExpr");
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
		//System.out.println("visiting CondEqualVal Left Query" + ctx.leftQuery.getText() + " Right query = "
		//		+ ctx.rightQuery.getText());
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);
		result.setTruth(false);

		XQueryResult xq1Result = visit(ctx.leftQuery);

		XQueryResult xq2Result = visit(ctx.rightQuery);

		NodeListImpl nodesLeft = xq1Result.getNodes();
		NodeListImpl nodesRight = xq2Result.getNodes();
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondAndExpr(XQueryParser.CondAndExprContext ctx) {
		//System.out.println("visiting CondAndExpr");
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
		//System.out.println("visiting CondEqualId");
		XQueryResult result = new XQueryResult(XQueryResultType.BOOLEAN);

		if (currentContext != null) {
			XQueryResult leftQuaryResult = visit(ctx.leftQuery);
			XQueryResult rightQueryResult = visit(ctx.rightQuery);
			NodeListImpl nodesLeft = leftQuaryResult.getNodes();
			NodeListImpl nodesRight = rightQueryResult.getNodes();
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
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XQueryResult visitCondNotExpr(XQueryParser.CondNotExprContext ctx) {
		//System.out.println("visiting CondNotExpr");
		XQueryResult result = null;
		XQueryResult conditionResult = visit(ctx.condition);
		if (conditionResult != null && conditionResult.getType() == XQueryResultType.BOOLEAN) {
			result = new XQueryResult(XQueryResultType.BOOLEAN);
			result.setTruth(!conditionResult.isTrue());
		}

		return result;
	}

	public String levelOrderHash(Node node) {
		if (node == null) {
			return "NULL";
		}
		Deque<Node> dq = new LinkedList<Node>();
		dq.add(node);
		NodeListImpl nodes = new NodeListImpl();
		Node levelMarker = null;
		String str = "";
		dq.add(null);
		int j = 0;

		while (!(dq.size() == 1 && dq.removeFirst() == null)) {
			Node temp = dq.removeFirst();

			if (temp != null) {
				String tString = "" + temp.getNodeValue();
				tString = tString.trim();
				tString += temp.getNodeType();
				tString = tString.trim();
				tString += temp.getTextContent();
				tString = tString.trim();
				if (temp == node) {
					str = str + tString;
				} else {
					str = str + temp.getNodeName().trim() + tString;
				}

				for (int i = 0; i < temp.getChildNodes().getLength(); i++) {
					dq.add(temp.getChildNodes().item(i));
				}

			} else {
				str += "|";
				dq.add(null);

			}

		}

		return str;
	}

	// public String getHash(Node node ){
	// return "";
	// }
	// public String getHashPre (Node node, int level){
	//
	// if(node == null){
	// return "";
	// }
	// //System.out.println("Get Hash level = "+level+" "+node.getNodeName());
	// String str = "";
	// str = level + node.getNodeName()+node.getNodeType() + node.getNodeValue()
	// + level ;
	// Node first = null;
	// if (node.hasChildNodes()){
	// first = node.getFirstChild();
	// }
	// else {
	// return str;
	// }
	//
	// while(first!=null){
	// str = str + getHashPre(first,level+1);
	// first = first.getNextSibling();
	// }
	//
	//
	// return str;
	//
	// }

	public boolean equality(Node x, Node y) {
		/*
		 * Short method : return
		 * levelOrderHash(x.getChildNodes().item(0)).hashCode() ==
		 * y.getChildNodes().item(0)).hashCode() ;
		 */
		//System.out.println(levelOrderHash(x.getChildNodes().item(0)).hashCode());
		//System.out.println(levelOrderHash(y.getChildNodes().item(0)).hashCode());
		if (x == null || y == null) {
			//System.out.println("Block 1");
			return false;
		}
		if (x.getParentNode() != null && y.getParentNode() != null) {
			//System.out.println("Block 2");
			if (!(x.getParentNode().getNodeName().trim().equals("tuple")
					&& y.getParentNode().getNodeName().trim().equals("tuple"))) {
				//System.out.println("Yes this is the one");
				//System.out.println(x.getParentNode().getNodeName());
				//System.out.println(y.getParentNode().getNodeName());

				if (!x.getNodeName().equals(y.getNodeName())) {
					return false;
				}

			}
		} else {
			//System.out.println("Block 3");
			//System.out.println("x = " + x.getNodeName() + " y=" + y.getNodeName());
			if (!x.getNodeName().equals(y.getNodeName())) {
				return false;
			}

		}

		if (x.getNodeType() != y.getNodeType()) {
			//System.out.println("Block 4");
			return false;
		}
		if (!x.getTextContent().equals(y.getTextContent())) {
			//System.out.println("Block 5");
			return false;
		}

		if (x.getChildNodes().getLength() != y.getChildNodes().getLength()) {
			//System.out.println("Block 6");
			return false;
		}
		for (int i = 0; i < x.getChildNodes().getLength(); i++) {
			//System.out.println("Comparing " + x.getChildNodes().item(i).getNodeName() + " "
			//		+ y.getChildNodes().item(i).getNodeName());
			if (!equality(x.getChildNodes().item(i), y.getChildNodes().item(i))) {
				return false;
			}
		}

		return true;
	}

	public Node join(Node x, Node y) {
		NodeListImpl nodes = new NodeListImpl();
		for (int i = 0; i < x.getChildNodes().getLength(); i++) {
			nodes.add(x.getChildNodes().item(i));
		}
		for (int i = 0; i < y.getChildNodes().getLength(); i++) {
			nodes.add(y.getChildNodes().item(i));
		}

		return makeElement("tuple", nodes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws Exception
	 */
	@Override
	public XQueryResult visitJoinDef(XQueryParser.JoinDefContext ctx) {
		//System.out.println("visiting JoinDef");
		long startTime = System.currentTimeMillis();
		XQueryResult left = visit(ctx.query1);
		XQueryResult right = visit(ctx.query2);
		XQueryResult result = new XQueryResult(XQueryResultType.NODES);
		if (ctx.attrList1.size() != ctx.attrList2.size()) {

			throw new IllegalArgumentException("Attribute Lists Do not match in size");

		}
		if (left == null | right == null) {
			NodeListImpl nodes = new NodeListImpl();
			result.setNodes(nodes);
			return result;
		}
		NodeListImpl lNodes = left.getNodes();
		NodeListImpl rNodes = right.getNodes();

		System.out.println("Printing Attribute List -------------------------------------");
		//System.out.println("lNodes length == " + lNodes.getLength());
		//for (int i = 0; i < ctx.attrList1.size(); i++) {
			//System.out.println(ctx.attrList1.get(i).getText() + " vs " + ctx.attrList2.get(i).getText());
		//}
		String hashVar = ctx.attrList1.get(0).getText();
		String hashVarR = ctx.attrList2.get(0).getText();
		HashMap<Integer, NodeListImpl> lMap = new LinkedHashMap<Integer, NodeListImpl>();
		HashMap<Integer, NodeListImpl> rMap = new LinkedHashMap<Integer, NodeListImpl>();
		// //Testing getNextSibling
		// Node x = lNodes.get(0);
		// x = x.getFirstChild();
		// x = x.getFirstChild();
		// x = x.getFirstChild();
		// x = x.getNextSibling();
		// x = x.getFirstChild();
		// while(x!=null)
		// {System.out.println("x value is "+x.getNodeName() +" NextSibling "+
		// x.getNextSibling());
		// x= x.getNextSibling();
		// }
		for (int j = 0; j < lNodes.getLength(); j++) {

			for (int k = 0; k < lNodes.get(j).getChildNodes().getLength(); k++) {
				String keyString = lNodes.get(j).getChildNodes().item(k).getNodeName();
				//System.out.println("KeyString is " + keyString + " HashVar is " + hashVar);
				if (!hashVar.equals(keyString)) {
					//System.out.println("Entered ");
					continue;
				}
				int key = levelOrderHash(lNodes.get(j).getChildNodes().item(k)).hashCode();
				if (!lMap.containsKey(key)) {
					NodeListImpl nodes = new NodeListImpl();
					nodes.add(lNodes.get(j));
					lMap.put(key, nodes);

				} else {
					NodeListImpl nodes = lMap.get(key);
					nodes.add(lNodes.get(j));
					lMap.put(key, nodes);
				}

				// System.out.println("Hash of item "
				// +lNodes.get(j).getChildNodes().item(k).getNodeName() + " is "
				// +
				// levelOrderHash(lNodes.get(j).getChildNodes().item(k)).hashCode());

			}
		}
		NodeListImpl resOfJoin = new NodeListImpl();
		for (int j = 0; j < rNodes.getLength(); j++) {
			for (int k = 0; k < rNodes.get(j).getChildNodes().getLength(); k++) {
				String keyString = rNodes.get(j).getChildNodes().item(k).getNodeName();
				//System.out.println("KeyString is " + keyString + " hashVarR is " + hashVarR);
				if (!hashVarR.equals(keyString)) {
					continue;
				}
				int key = levelOrderHash(rNodes.get(j).getChildNodes().item(k)).hashCode();
				Node inHand = rNodes.get(j);
				//System.out.println(
				//		"Node Name " + rNodes.get(j).getChildNodes().item(k).getNodeName() + " Hash is " + key);
				if (lMap.containsKey(key)) {
					NodeListImpl list = lMap.get(key);
					for (int h = 0; h < list.getLength(); h++) {
						Node curNode = list.get(h);
						//System.out.println("CurNode is " + curNode.getChildNodes().item(0));
						//System.out.println("inHand is " + inHand.getChildNodes().item(0));
						boolean bool = true;
						for (int ai = 0; ai < ctx.attrList1.size(); ai++) {
							String lAtt = ctx.attrList1.get(ai).getText();
							String rAtt = ctx.attrList2.get(ai).getText();
							for (int t1 = 0; t1 < curNode.getChildNodes().getLength(); t1++) {
								for (int t2 = 0; t2 < inHand.getChildNodes().getLength(); t2++) {
									if (lAtt.equals(curNode.getChildNodes().item(t1).getNodeName())
											&& rAtt.equals(inHand.getChildNodes().item(t2).getNodeName())) {
										if (!equality(curNode.getChildNodes().item(t1),
												inHand.getChildNodes().item(t2))) {
											bool = false;
										}
									}
								}
							}

						}

						// if(equality(curNode.getChildNodes().item(0),inHand.getChildNodes().item(0))){
						// Apply Condition
						if (bool) {

							resOfJoin.add(join(curNode, inHand));
						}
					}
				} else {
					// Do nothing
				}
				// System.out.println(lNodes.get(j).getChildNodes().item(k).getNodeName().hashCode());

			}
		}

		result.setNodes(resOfJoin);
		long stopTime = System.currentTimeMillis();
		long timeElapsed = stopTime - startTime;
		//System.out.println("Time Elapsed in Hash Join ----------------  " + timeElapsed);
		// TODO: to be completed
		return result;
	}

	/**
	 * Milestone #2 Ends
	 */

	/**
	 * Milestone #1
	 */

	@Override
	public XQueryResult visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {
		// System.out.println(ctx.relpath.getText());
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
			String text = node.getTextContent();
			text = text.trim();
			if (node.getNodeType() == Node.TEXT_NODE && !text.isEmpty()) {
				nodes.add(node);
			}
		}

		result.setNodes(nodes);

		return result;
	}

	@Override
	public XQueryResult visitRpConcatExpr(XQueryParser.RpConcatExprContext ctx) {
		// System.out.println("visiting rpCOncatExpr");
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
		result.setNodes(nodes);
		// System.out.println(currentNode.getNodeName());
		if (currentNode == null) {
			return result;
		}
		if (currentNode.getNodeName().equals(ctx.tagName.getText())) {
			nodes.add(currentNode);
		}
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
