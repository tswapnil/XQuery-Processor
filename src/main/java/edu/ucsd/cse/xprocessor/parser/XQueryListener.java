package edu.ucsd.cse.xprocessor.parser;

//Generated from XQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
* This interface defines a complete listener for a parse tree produced by
* {@link XQueryParser}.
*/
public interface XQueryListener extends ParseTreeListener {
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