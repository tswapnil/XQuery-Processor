package edu.ucsd.cse.xprocessor.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import edu.ucsd.cse.xprocessor.parser.util.HyperGraph;
import edu.ucsd.cse.xprocessor.parser.util.VariableTree;
import edu.ucsd.cse.xprocessor.parser.util.VariableTreeNode;

public class XQueryOptimizer extends XQueryBaseVisitor<String> {

	private Stack<HashSet<String>> contextStack;
	private HashSet<String> currentContext;
	private VariableTree variableTree;

	public XQueryOptimizer() {
		super();
		this.contextStack = new Stack<HashSet<String>>();
		this.currentContext = new HashSet<String>();
		this.variableTree = new VariableTree();
	}

	@Override
	public String visitStart(XQueryParser.StartContext ctx) {
		return visit(ctx.getChild(0));
	}

	@Override
	public String visitXqAp(XQueryParser.XqApContext ctx) {
		return visit(ctx.getChild(0));
	}

	@Override
	public String visitXqJoinExpr(XQueryParser.XqJoinExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitXqVar(XQueryParser.XqVarContext ctx) {
		return ctx.var.getText();
	}

	@Override
	public String visitXqContTagExpr(XQueryParser.XqContTagExprContext ctx) {
		return ctx.getChild(0).getText() + ctx.openTagName.getText() + ctx.getChild(2).getText()
				+ ctx.getChild(3).getText() + visit(ctx.query) + ctx.getChild(5).getText() + ctx.getChild(6).getText()
				+ ctx.closeTagName.getText() + ctx.getChild(8).getText();
	}

	@Override
	public String visitXqConcatExpr(XQueryParser.XqConcatExprContext ctx) {
		return visit(ctx.leftQuery) + ctx.getChild(1).getText() + " " + visit(ctx.rightQuery);
	}

	@Override
	public String visitXqParenExpr(XQueryParser.XqParenExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.query) + ctx.getChild(2).getText();
	}

	@Override
	public String visitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx) {
		return ctx.strConst.getText();
	}

	@Override
	public String visitXqLetExpr(XQueryParser.XqLetExprContext ctx) {
		String subQuery = "";
		String declareStatement = visit(ctx.declaration);
		if (declareStatement != null) {
			subQuery += declareStatement + "\n";
		}

		String querySegment = visit(ctx.query);
		if (querySegment != null) {
			subQuery += querySegment;
		}

		return subQuery;
	}

	@Override
	public String visitXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx) {
		return visit(ctx.query) + ctx.getChild(1).getText() + visit(ctx.relPath);
	}

	@Override
	public String visitXqForExpr(XQueryParser.XqForExprContext ctx) {

		String subQuery = "";

		// ctx.loop (forClause) also populates the variableTree
		String forStatement = visit(ctx.loop);

		ArrayList<VariableTreeNode> disjointVariableGroups = variableTree.getRootNode().getChildren();
		if (disjointVariableGroups.size() > 0) {
			subQuery += "for $tuple in ";

			HyperGraph hyperGraph = new HyperGraph();

			hyperGraph.initHyperGraphNodes(disjointVariableGroups);

			if (ctx.condition != null) {
				String whereClauseString = visit(ctx.condition).trim();
				String[] whereConditions = whereClauseString.split("where")[1].split("and");
				ArrayList<String> conditionList = new ArrayList<String>();
				for (String condition : whereConditions) {
					conditionList.add(condition);
				}

				hyperGraph.initHyperGraphEdges(conditionList);
			}

			hyperGraph.computeJoinOrder();

			subQuery += hyperGraph.getJoinString() + "\n";

			String resultStatement = visit(ctx.output);
			
			for (String variableName : hyperGraph.getVariableNames()) {
				String regex = "\\" + variableName + "(?![a-zA-Z0-9])";
				String replacementQuery = "\\$" + variableTree.getPath(variableName) + "/*";
				resultStatement = resultStatement.replaceAll(regex, replacementQuery);
			}
			
			resultStatement += "\n";
			
			subQuery += resultStatement;
			
		} else {
			subQuery += forStatement + visit(ctx.declaration) + visit(ctx.condition) + visit(ctx.output);
		}
		
		// reset variable tree
		variableTree = null;
		/*
		 * Stack<VariableTreeNode> nodeStack = new Stack<VariableTreeNode>();
		 * for (int i = independentVariableBlocks.size() - 1; i >= 0; i--) {
		 * nodeStack.push(independentVariableBlocks.get(i)); } while
		 * (!nodeStack.isEmpty()) { VariableTreeNode node = nodeStack.pop(); if
		 * (independentVariableBlocks.contains(node)) {
		 * System.out.println("---****---"); }
		 * 
		 * System.out.println(node.getVariableName() + " in " +
		 * node.getXQuery());
		 * 
		 * ArrayList<VariableTreeNode> children = node.getChildren(); for (int i
		 * = children.size() - 1; i >= 0; i--) {
		 * nodeStack.push(children.get(i)); } }
		 * System.out.println("-------------");
		 */

		return subQuery;
	}

	@Override
	public String visitXqSlashExpr(XQueryParser.XqSlashExprContext ctx) {
		return visit(ctx.query) + ctx.getChild(1).getText() + visit(ctx.relPath);
	}

	@Override
	public String visitForVarIter(XQueryParser.ForVarIterContext ctx) {
		if (ctx.varList.size() != ctx.queryList.size()) {
			throw new RuntimeException("For Loop: Number of variables not equal to number of sub-queries.");
		}

		String subQuery = ctx.getChild(0).getText() + " ";
		for (int i = 0; i < ctx.varList.size(); i++) {
			if (i > 0) {
				subQuery += ",\n";
			}
			String variableName = ctx.varList.get(i).getText();
			String xquery = ctx.queryList.get(i).getText();
			variableTree.addNode(variableName, xquery);
			subQuery += variableName + " in " + xquery;
		}

		return subQuery;
	}

	@Override
	public String visitLetVarDef(XQueryParser.LetVarDefContext ctx) {
		String subQuery = ctx.getChild(0).getText() + " ";
		String varName = ctx.varList.get(0).getText();
		currentContext.add(varName);
		subQuery += varName + ctx.getChild(2).getText() + visit(ctx.queryList.get(0));
		for (int i = 1; i < ctx.varList.size(); i++) {
			varName = ctx.varList.get(i).getText();
			currentContext.add(varName);
			subQuery += ctx.getChild(4 * i).getText() + " " + varName + ctx.getChild(4 * i + 2).getText()
					+ visit(ctx.queryList.get(i));
		}
		return subQuery;
	}

	@Override
	public String visitWhereCondExpr(XQueryParser.WhereCondExprContext ctx) {
		String subQuery = ctx.getChild(0).getText() + " " + visit(ctx.condition);
		return subQuery;
	}

	@Override
	public String visitReturnQuery(XQueryParser.ReturnQueryContext ctx) {
		String subQuery = ctx.getChild(0).getText() + " " + visit(ctx.query);
		return subQuery;
	}

	@Override
	public String visitCondEmpty(XQueryParser.CondEmptyContext ctx) {
		String subQuery = ctx.getChild(0).getText() + ctx.getChild(1).getText() + visit(ctx.query) + ctx.getChild(3).getText();
		return subQuery;
	}

	@Override
	public String visitCondVarCheck(XQueryParser.CondVarCheckContext ctx) {
		if (ctx.varList.size() != ctx.queryList.size()) {
			throw new RuntimeException("Some Condition: Number of variables not equal to number of sub-queries.");
		}

		String subQuery = ctx.getChild(0) + " ";
		for (int i = 0; i < ctx.varList.size(); i++) {
			if (i > 0) {
				subQuery += ", ";
			}
			String variableName = ctx.varList.get(i).getText();
			String xquery = ctx.queryList.get(i).getText();
			variableTree.addNode(variableName, xquery);
			subQuery += variableName + " in " + xquery;
		}
		
		subQuery += " " + ctx.getChild(ctx.getChildCount() - 2) + " " + ctx.getChild(ctx.getChildCount() - 1);

		return subQuery;
	}

	@Override
	public String visitCondOrExpr(XQueryParser.CondOrExprContext ctx) {
		String subQuery = visit(ctx.leftCondition) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightCondition);
		return subQuery;
	}

	@Override
	public String visitCondParenExpr(XQueryParser.CondParenExprContext ctx) {
		String subQuery = ctx.getChild(0).getText() + visit(ctx.condition) + ctx.getChild(2).getText();
		return subQuery;
	}

	@Override
	public String visitCondEqualVal(XQueryParser.CondEqualValContext ctx) {
		String subQuery = visit(ctx.leftQuery) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightQuery);
		return subQuery;
	}

	@Override
	public String visitCondAndExpr(XQueryParser.CondAndExprContext ctx) {
		String subQuery = visit(ctx.leftCondition) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightCondition);
		return subQuery;
	}

	@Override
	public String visitCondEqualId(XQueryParser.CondEqualIdContext ctx) {
		String subQuery = visit(ctx.leftQuery) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightQuery);
		return subQuery;
	}

	@Override
	public String visitCondNotExpr(XQueryParser.CondNotExprContext ctx) {
		String subQuery = ctx.getChild(0).getText() + " " + visit(ctx.condition);
		return subQuery;
	}

	@Override
	public String visitJoinDef(XQueryParser.JoinDefContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {
		return ctx.getChild(0).getText() + ctx.docName.getText() + ctx.getChild(2).getText() + ctx.getChild(3).getText()
				+ visit(ctx.relpath);
	}

	@Override
	public String visitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx) {
		return ctx.getChild(0).getText() + ctx.docName.getText() + ctx.getChild(2).getText() + ctx.getChild(3).getText()
				+ visit(ctx.relpath);
	}

	@Override
	public String visitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx) {
		return visit(ctx.left) + ctx.getChild(1).getText() + visit(ctx.right);
	}

	@Override
	public String visitRpDot(XQueryParser.RpDotContext ctx) {
		return ctx.getChild(0).getText();
	}

	@Override
	public String visitRpText(XQueryParser.RpTextContext ctx) {
		return ctx.getChild(0).getText();
	}

	@Override
	public String visitRpConcatExpr(XQueryParser.RpConcatExprContext ctx) {
		return visit(ctx.left) + ctx.getChild(1).getText() + " " + visit(ctx.right);
	}

	@Override
	public String visitRpSlashExpr(XQueryParser.RpSlashExprContext ctx) {
		return visit(ctx.left) + ctx.getChild(1).getText() + visit(ctx.right);
	}

	@Override
	public String visitRpFilterExpr(XQueryParser.RpFilterExprContext ctx) {
		return visit(ctx.relpath) + ctx.getChild(1).getText() + visit(ctx.filter) + ctx.getChild(3).getText();
	}

	@Override
	public String visitRpTagName(XQueryParser.RpTagNameContext ctx) {
		return ctx.tagName.getText();
	}

	@Override
	public String visitRpDblDot(XQueryParser.RpDblDotContext ctx) {
		return ctx.getChild(0).getText();
	}

	@Override
	public String visitRpAttrName(XQueryParser.RpAttrNameContext ctx) {
		return ctx.getChild(0) + ctx.attrName.getText();
	}

	@Override
	public String visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
		return ctx.getChild(0).getText();
	}

	@Override
	public String visitRpParenExpr(XQueryParser.RpParenExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.relpath) + ctx.getChild(2).getText();
	}

	@Override
	public String visitFilterAndExpr(XQueryParser.FilterAndExprContext ctx) {
		return visit(ctx.leftf) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightf);
	}

	@Override
	public String visitFilterRp(XQueryParser.FilterRpContext ctx) {
		return visit(ctx.relPath);
	}

	@Override
	public String visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx) {
		return visit(ctx.left) + " " + ctx.getChild(1).getText() + " " + visit(ctx.right);
	}

	@Override
	public String visitFilterOrExpr(XQueryParser.FilterOrExprContext ctx) {
		return visit(ctx.leftf) + " " + ctx.getChild(1).getText() + " " + visit(ctx.rightf);
	}

	@Override
	public String visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.filter) + ctx.getChild(2).getText();
	}

	@Override
	public String visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		return ctx.getChild(0).getText() + " " + visit(ctx.filter);
	}

	@Override
	public String visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx) {
		return visit(ctx.left) + " " + ctx.getChild(1).getText() + " " + visit(ctx.right);
	}

}
