package edu.ucsd.cse.xprocessor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import edu.ucsd.cse.xprocessor.parser.EvalVisitor;
import edu.ucsd.cse.xprocessor.parser.XQueryLexer;
import edu.ucsd.cse.xprocessor.parser.XQueryParser;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class App {
	public static void main(String[] args) {
		String query = "doc(\"abc.txt\")/title//asd[.==..]";

		ANTLRInputStream input = new ANTLRInputStream(query);
		XQueryLexer lexer = new XQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XQueryParser parser = new XQueryParser(tokens);
		parser.removeErrorListeners();

		ParseTree tree = parser.start();
		Object visitor = new EvalVisitor<Object>().visit(tree);
		
	}
}