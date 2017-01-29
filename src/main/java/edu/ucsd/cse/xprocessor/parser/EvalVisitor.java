package edu.ucsd.cse.xprocessor.parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 * @param <T>
 *
 */
public class EvalVisitor<T> extends XQueryBaseVisitor<T> {

	private Document doc;

	public EvalVisitor() {
		super();
		this.doc = null;
	}

	@Override
	public T visitApSlashFile(XQueryParser.ApSlashFileContext ctx) {

		String xmlFileName = ctx.getChild(1).getText();
		File xmlFile = new File(xmlFileName);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = dbFactory.newDocumentBuilder();
			doc = docBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		T result = visitChildren(ctx);

		if (doc != null) {
			doc = null;
		}
		
		//TODO: parse XML nodes using stack as we dive in the expression 

		return result;
	}

	@Override
	public T visitApDblSlashFile(XQueryParser.ApDblSlashFileContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public T visitRpDblSlashExpr(XQueryParser.RpDblSlashExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpDot(XQueryParser.RpDotContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpText(XQueryParser.RpTextContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpConcatExpr(XQueryParser.RpConcatExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpSlashExpr(XQueryParser.RpSlashExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpFilterExpr(XQueryParser.RpFilterExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpTagName(XQueryParser.RpTagNameContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpDblDot(XQueryParser.RpDblDotContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpAttrName(XQueryParser.RpAttrNameContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpWildcard(XQueryParser.RpWildcardContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitRpParenExpr(XQueryParser.RpParenExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterAndExpr(XQueryParser.FilterAndExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterRp(XQueryParser.FilterRpContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterEqualVal(XQueryParser.FilterEqualValContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterOrExpr(XQueryParser.FilterOrExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterParenExpr(XQueryParser.FilterParenExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterNotExpr(XQueryParser.FilterNotExprContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

	@Override
	public T visitFilterEqualId(XQueryParser.FilterEqualIdContext ctx) {
		System.out.println(ctx.toString());
		return visitChildren(ctx);
	}

}
