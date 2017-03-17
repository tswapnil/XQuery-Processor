// Generated from XQuery.g4 by ANTLR 4.6

package edu.ucsd.cse.xprocessor.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(XQueryParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqJoinExpr(XQueryParser.XqJoinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqConcatExpr(XQueryParser.XqConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqParenExpr(XQueryParser.XqParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLetExpr(XQueryParser.XqLetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqForExpr(XQueryParser.XqForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqTagClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqTagClause(XQueryParser.XqTagClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlashExpr(XQueryParser.XqSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagClauseImpl}
	 * labeled alternative in {@link XQueryParser#tagClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClauseImpl(XQueryParser.TagClauseImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarIter(XQueryParser.ForVarIterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetVarDef(XQueryParser.LetVarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondExpr(XQueryParser.WhereCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnQuery(XQueryParser.ReturnQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondVarCheck(XQueryParser.CondVarCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOrExpr(XQueryParser.CondOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParenExpr(XQueryParser.CondParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqualVal(XQueryParser.CondEqualValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAndExpr(XQueryParser.CondAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqualId(XQueryParser.CondEqualIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNotExpr(XQueryParser.CondNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDef(XQueryParser.JoinDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApSlashFile(XQueryParser.ApSlashFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpConcatExpr(XQueryParser.RpConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpSlashExpr(XQueryParser.RpSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilterExpr(XQueryParser.RpFilterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTagName(XQueryParser.RpTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDblDot(XQueryParser.RpDblDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAttrName(XQueryParser.RpAttrNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpWildcard(XQueryParser.RpWildcardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParenExpr(XQueryParser.RpParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAndExpr(XQueryParser.FilterAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOrExpr(XQueryParser.FilterOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx);
}