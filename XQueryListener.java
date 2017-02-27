// Generated from XQuery.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(XQueryParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(XQueryParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqJoinExpr(XQueryParser.XqJoinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqJoinExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqJoinExpr(XQueryParser.XqJoinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqVar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqVar(XQueryParser.XqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqContTagExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqContTagExpr(XQueryParser.XqContTagExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqContTagExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqContTagExpr(XQueryParser.XqContTagExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqConcatExpr(XQueryParser.XqConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqConcatExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqConcatExpr(XQueryParser.XqConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqParenExpr(XQueryParser.XqParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqParenExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqParenExpr(XQueryParser.XqParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqStrConstDef(XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqStrConstDef}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqStrConstDef(XQueryParser.XqStrConstDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLetExpr(XQueryParser.XqLetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqLetExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLetExpr(XQueryParser.XqLetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqDblSlashExpr(XQueryParser.XqDblSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqForExpr(XQueryParser.XqForExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqForExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqForExpr(XQueryParser.XqForExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqSlashExpr(XQueryParser.XqSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqSlashExpr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqSlashExpr(XQueryParser.XqSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForVarIter(XQueryParser.ForVarIterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forVarIter}
	 * labeled alternative in {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForVarIter(XQueryParser.ForVarIterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetVarDef(XQueryParser.LetVarDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letVarDef}
	 * labeled alternative in {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetVarDef(XQueryParser.LetVarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondExpr(XQueryParser.WhereCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whereCondExpr}
	 * labeled alternative in {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondExpr(XQueryParser.WhereCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnQuery(XQueryParser.ReturnQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnQuery}
	 * labeled alternative in {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnQuery(XQueryParser.ReturnQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(XQueryParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondVarCheck(XQueryParser.CondVarCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condVarCheck}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondVarCheck(XQueryParser.CondVarCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOrExpr(XQueryParser.CondOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOrExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOrExpr(XQueryParser.CondOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParenExpr(XQueryParser.CondParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condParenExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParenExpr(XQueryParser.CondParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqualVal(XQueryParser.CondEqualValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqualVal}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqualVal(XQueryParser.CondEqualValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAndExpr(XQueryParser.CondAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAndExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAndExpr(XQueryParser.CondAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqualId(XQueryParser.CondEqualIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEqualId}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqualId(XQueryParser.CondEqualIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNotExpr(XQueryParser.CondNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNotExpr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNotExpr(XQueryParser.CondNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinDef(XQueryParser.JoinDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinDef}
	 * labeled alternative in {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinDef(XQueryParser.JoinDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApSlashFile(XQueryParser.ApSlashFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApSlashFile(XQueryParser.ApSlashFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apDblSlashFile}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDblSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDot(XQueryParser.RpDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpText}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpText(XQueryParser.RpTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpConcatExpr(XQueryParser.RpConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpConcatExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpConcatExpr(XQueryParser.RpConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpSlashExpr(XQueryParser.RpSlashExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpSlashExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpSlashExpr(XQueryParser.RpSlashExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilterExpr(XQueryParser.RpFilterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpFilterExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilterExpr(XQueryParser.RpFilterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpTagName(XQueryParser.RpTagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpTagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpTagName(XQueryParser.RpTagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpDblDot(XQueryParser.RpDblDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpDblDot}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpDblDot(XQueryParser.RpDblDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAttrName(XQueryParser.RpAttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpAttrName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAttrName(XQueryParser.RpAttrNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpWildcard(XQueryParser.RpWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpWildcard}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpWildcard(XQueryParser.RpWildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpParenExpr(XQueryParser.RpParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpParenExpr}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpParenExpr(XQueryParser.RpParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterAndExpr(XQueryParser.FilterAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterAndExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterAndExpr(XQueryParser.FilterAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterRp}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqualVal(XQueryParser.FilterEqualValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterEqualVal}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqualVal(XQueryParser.FilterEqualValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterOrExpr(XQueryParser.FilterOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterOrExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterOrExpr(XQueryParser.FilterOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterParenExpr(XQueryParser.FilterParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterParenExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterParenExpr(XQueryParser.FilterParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterNotExpr(XQueryParser.FilterNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterNotExpr}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterNotExpr(XQueryParser.FilterNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqualId(XQueryParser.FilterEqualIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterEqualId}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqualId(XQueryParser.FilterEqualIdContext ctx);
}