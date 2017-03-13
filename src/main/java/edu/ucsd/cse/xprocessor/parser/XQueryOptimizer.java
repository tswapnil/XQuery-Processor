package edu.ucsd.cse.xprocessor.parser;

public class XQueryOptimizer extends XQueryBaseVisitor<String> {

	@Override
	public String visitStart(XQueryParser.StartContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitXqAp(XQueryParser.XqApContext ctx) {
		return ctx.getChild(0).getText();
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
		return visit(ctx.leftQuery) + ctx.getChild(1).getText() + visit(ctx.rightQuery);
	}

	@Override
	public String visitXqParenExpr(XQueryParser.XqParenExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.query) + ctx.getChild(1).getText();
	}

	@Override
	public String visitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx) {
		return ctx.strConst.getText();
	}

	@Override
	public String visitXqLetExpr(XQueryParser.XqLetExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx) {
		return visit(ctx.query) + ctx.getChild(1).getText() + visit(ctx.relPath);
	}

	@Override
	public String visitXqForExpr(XQueryParser.XqForExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitXqSlashExpr(XQueryParser.XqSlashExprContext ctx) {
		return visit(ctx.query) + ctx.getChild(1).getText() + visit(ctx.relPath);
	}

	@Override
	public String visitForVarIter(XQueryParser.ForVarIterContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLetVarDef(XQueryParser.LetVarDefContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitWhereCondExpr(XQueryParser.WhereCondExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitReturnQuery(XQueryParser.ReturnQueryContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondEmpty(XQueryParser.CondEmptyContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondVarCheck(XQueryParser.CondVarCheckContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondOrExpr(XQueryParser.CondOrExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondParenExpr(XQueryParser.CondParenExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondEqualVal(XQueryParser.CondEqualValContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondAndExpr(XQueryParser.CondAndExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondEqualId(XQueryParser.CondEqualIdContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondNotExpr(XQueryParser.CondNotExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitJoinDef(XQueryParser.JoinDefContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {
		return ctx.getChild(0).getText() + ctx.docName.getText() + ctx.getChild(1).getText() + ctx.getChild(2).getText()
				+ visit(ctx.relpath);
	}

	@Override
	public String visitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx) {
		return ctx.getChild(0).getText() + ctx.docName.getText() + ctx.getChild(1).getText() + ctx.getChild(2).getText()
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
		return visit(ctx.left) + ctx.getChild(1).getText() + visit(ctx.right);
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
		return visit(ctx.leftf) + ctx.getChild(1).getText() + visit(ctx.rightf);
	}

	@Override
	public String visitFilterRp(XQueryParser.FilterRpContext ctx) {
		return visit(ctx.relPath);
	}

	@Override
	public String visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx) {
		return visit(ctx.left) + ctx.getChild(1).getText() + visit(ctx.right);
	}

	@Override
	public String visitFilterOrExpr(XQueryParser.FilterOrExprContext ctx) {
		return visit(ctx.leftf) + ctx.getChild(1).getText() + visit(ctx.rightf);
	}

	@Override
	public String visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.filter) + ctx.getChild(1).getText();
	}

	@Override
	public String visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		return ctx.getChild(0).getText() + visit(ctx.filter);
	}

	@Override
	public String visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx) {
		return visit(ctx.left) + ctx.getChild(1).getText() + visit(ctx.right);
	}

}
