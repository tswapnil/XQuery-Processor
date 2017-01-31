package edu.ucsd.cse.xprocessor.parser;

import org.antlr.v4.runtime.misc.NotNull;

public class EvalListener extends XQueryBaseListener{

	@Override
	public void enterFilterAndExpr(XQueryParser.FilterAndExprContext ctx) {
		
		ctx.f();
	}
}
