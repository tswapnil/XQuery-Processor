// Generated from XQuery.g4 by ANTLR 4.4

package edu.ucsd.cse.xprocessor.parser;

import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinDef(@NotNull XQueryParser.JoinDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOrExpr(@NotNull XQueryParser.CondOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqParenExpr(@NotNull XQueryParser.XqParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualVal(@NotNull XQueryParser.FilterEqualValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqStrConstDef(@NotNull XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpSlashExpr(@NotNull XQueryParser.RpSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilterExpr(@NotNull XQueryParser.RpFilterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqTagClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqTagClause(@NotNull XQueryParser.XqTagClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqualId(@NotNull XQueryParser.CondEqualIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetVarDef(@NotNull XQueryParser.LetVarDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApDblSlashFile(@NotNull XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqualId(@NotNull XQueryParser.FilterEqualIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDot(@NotNull XQueryParser.RpDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpText(@NotNull XQueryParser.RpTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondVarCheck(@NotNull XQueryParser.CondVarCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(@NotNull XQueryParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLetExpr(@NotNull XQueryParser.XqLetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAndExpr(@NotNull XQueryParser.CondAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqDblSlashExpr(@NotNull XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqForExpr(@NotNull XQueryParser.XqForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterParenExpr(@NotNull XQueryParser.FilterParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnQuery(@NotNull XQueryParser.ReturnQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNotExpr(@NotNull XQueryParser.CondNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmpty(@NotNull XQueryParser.CondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(@NotNull XQueryParser.XqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondExpr(@NotNull XQueryParser.WhereCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpConcatExpr(@NotNull XQueryParser.RpConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApSlashFile(@NotNull XQueryParser.ApSlashFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull XQueryParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqualVal(@NotNull XQueryParser.CondEqualValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarIter(@NotNull XQueryParser.ForVarIterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpWildcard(@NotNull XQueryParser.RpWildcardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagClauseImpl}
	 * labeled alternative in {@link XQueryParser#tagClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClauseImpl(@NotNull XQueryParser.TagClauseImplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(@NotNull XQueryParser.XqApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqJoinExpr(@NotNull XQueryParser.XqJoinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDblSlashExpr(@NotNull XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqContTagExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqContTagExpr(@NotNull XQueryParser.XqContTagExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAndExpr(@NotNull XQueryParser.FilterAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqConcatExpr(@NotNull XQueryParser.XqConcatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParenExpr(@NotNull XQueryParser.CondParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOrExpr(@NotNull XQueryParser.FilterOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpTagName(@NotNull XQueryParser.RpTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpDblDot(@NotNull XQueryParser.RpDblDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlashExpr(@NotNull XQueryParser.XqSlashExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAttrName(@NotNull XQueryParser.RpAttrNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpParenExpr(@NotNull XQueryParser.RpParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNotExpr(@NotNull XQueryParser.FilterNotExprContext ctx);
}