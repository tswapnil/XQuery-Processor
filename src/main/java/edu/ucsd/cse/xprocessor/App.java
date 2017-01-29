package edu.ucsd.cse.xprocessor;

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.ucsd.cse.xprocessor.parser.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args )throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String queryInput = br.readLine();
    	ANTLRInputStream input = new ANTLRInputStream(queryInput);
    	xqueryLexer lexer = new xqueryLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	
    	xqueryParser parser = new xqueryParser(tokens);
    	parser.removeErrorListeners();
    	ParseTree tree = parser.ap();
    	ParseTreeWalker walker = new ParseTreeWalker();
    	//xqueryBuilder builder = new xqueryBuilder();
    	//walker.walk(builder, tree);
    }
}