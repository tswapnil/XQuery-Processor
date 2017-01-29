package edu.ucsd.cse.xprocessor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import edu.ucsd.cse.xprocessor.parser.EvalVisitor;
import edu.ucsd.cse.xprocessor.parser.XQueryLexer;
import edu.ucsd.cse.xprocessor.parser.XQueryParser;


/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class App {
	public static void main(String[] args) {
		String query = "doc(\"test.xml\")/title//actor[.==..]";

		ANTLRInputStream input = new ANTLRInputStream(query);
		XQueryLexer lexer = new XQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XQueryParser parser = new XQueryParser(tokens);
		parser.removeErrorListeners();

		ParseTree tree = parser.start();
		Node visitor = new EvalVisitor<Node>().visit(tree);
		
	}

}