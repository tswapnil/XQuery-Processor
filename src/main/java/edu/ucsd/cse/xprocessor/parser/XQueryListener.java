// Generated from XQuery.g4 by ANTLR 4.4

package edu.ucsd.cse.xprocessor.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDef(@NotNull XQueryParser.JoinDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDef(@NotNull XQueryParser.JoinDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOrExpr(@NotNull XQueryParser.CondOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOrExpr(@NotNull XQueryParser.CondOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqParenExpr(@NotNull XQueryParser.XqParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqParenExpr(@NotNull XQueryParser.XqParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqualVal(@NotNull XQueryParser.FilterEqualValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqualVal(@NotNull XQueryParser.FilterEqualValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqStrConstDef(@NotNull XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqStrConstDef(@NotNull XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSlashExpr(@NotNull XQueryParser.RpSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSlashExpr(@NotNull XQueryParser.RpSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilterExpr(@NotNull XQueryParser.RpFilterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilterExpr(@NotNull XQueryParser.RpFilterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqTagClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqTagClause(@NotNull XQueryParser.XqTagClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqTagClause}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqTagClause(@NotNull XQueryParser.XqTagClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqualId(@NotNull XQueryParser.CondEqualIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqualId(@NotNull XQueryParser.CondEqualIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetVarDef(@NotNull XQueryParser.LetVarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetVarDef(@NotNull XQueryParser.LetVarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApDblSlashFile(@NotNull XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApDblSlashFile(@NotNull XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqualId(@NotNull XQueryParser.FilterEqualIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqualId(@NotNull XQueryParser.FilterEqualIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDot(@NotNull XQueryParser.RpDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDot(@NotNull XQueryParser.RpDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpText(@NotNull XQueryParser.RpTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpText(@NotNull XQueryParser.RpTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondVarCheck(@NotNull XQueryParser.CondVarCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondVarCheck(@NotNull XQueryParser.CondVarCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(@NotNull XQueryParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(@NotNull XQueryParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLetExpr(@NotNull XQueryParser.XqLetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLetExpr(@NotNull XQueryParser.XqLetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAndExpr(@NotNull XQueryParser.CondAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAndExpr(@NotNull XQueryParser.CondAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqDblSlashExpr(@NotNull XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqDblSlashExpr(@NotNull XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqForExpr(@NotNull XQueryParser.XqForExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqForExpr(@NotNull XQueryParser.XqForExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterParenExpr(@NotNull XQueryParser.FilterParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterParenExpr(@NotNull XQueryParser.FilterParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnQuery(@NotNull XQueryParser.ReturnQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnQuery(@NotNull XQueryParser.ReturnQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNotExpr(@NotNull XQueryParser.CondNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNotExpr(@NotNull XQueryParser.CondNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(@NotNull XQueryParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(@NotNull XQueryParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVar(@NotNull XQueryParser.XqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVar(@NotNull XQueryParser.XqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondExpr(@NotNull XQueryParser.WhereCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondExpr(@NotNull XQueryParser.WhereCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpConcatExpr(@NotNull XQueryParser.RpConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpConcatExpr(@NotNull XQueryParser.RpConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApSlashFile(@NotNull XQueryParser.ApSlashFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApSlashFile(@NotNull XQueryParser.ApSlashFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull XQueryParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull XQueryParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqualVal(@NotNull XQueryParser.CondEqualValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqualVal(@NotNull XQueryParser.CondEqualValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForVarIter(@NotNull XQueryParser.ForVarIterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForVarIter(@NotNull XQueryParser.ForVarIterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpWildcard(@NotNull XQueryParser.RpWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpWildcard(@NotNull XQueryParser.RpWildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagClauseImpl}
	 * labeled alternative in {@link XQueryParser#tagClause}.
	 * @param ctx the parse tree
	 */
	void enterTagClauseImpl(@NotNull XQueryParser.TagClauseImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagClauseImpl}
	 * labeled alternative in {@link XQueryParser#tagClause}.
	 * @param ctx the parse tree
	 */
	void exitTagClauseImpl(@NotNull XQueryParser.TagClauseImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(@NotNull XQueryParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(@NotNull XQueryParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqJoinExpr(@NotNull XQueryParser.XqJoinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqJoinExpr(@NotNull XQueryParser.XqJoinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDblSlashExpr(@NotNull XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDblSlashExpr(@NotNull XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqContTagExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqContTagExpr(@NotNull XQueryParser.XqContTagExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqContTagExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqContTagExpr(@NotNull XQueryParser.XqContTagExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterAndExpr(@NotNull XQueryParser.FilterAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterAndExpr(@NotNull XQueryParser.FilterAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqConcatExpr(@NotNull XQueryParser.XqConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqConcatExpr(@NotNull XQueryParser.XqConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParenExpr(@NotNull XQueryParser.CondParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParenExpr(@NotNull XQueryParser.CondParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterOrExpr(@NotNull XQueryParser.FilterOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterOrExpr(@NotNull XQueryParser.FilterOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpTagName(@NotNull XQueryParser.RpTagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpTagName(@NotNull XQueryParser.RpTagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDblDot(@NotNull XQueryParser.RpDblDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDblDot(@NotNull XQueryParser.RpDblDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqSlashExpr(@NotNull XQueryParser.XqSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqSlashExpr(@NotNull XQueryParser.XqSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAttrName(@NotNull XQueryParser.RpAttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAttrName(@NotNull XQueryParser.RpAttrNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParenExpr(@NotNull XQueryParser.RpParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParenExpr(@NotNull XQueryParser.RpParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterNotExpr(@NotNull XQueryParser.FilterNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterNotExpr(@NotNull XQueryParser.FilterNotExprContext ctx);
}