package edu.ucsd.cse.xprocessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import edu.ucsd.cse.xprocessor.parser.EvalVisitor;
import edu.ucsd.cse.xprocessor.parser.XQueryLexer;
import edu.ucsd.cse.xprocessor.parser.Rewriter;
import edu.ucsd.cse.xprocessor.parser.XQueryParser;
import edu.ucsd.cse.xprocessor.result.XQueryResult;
import edu.ucsd.cse.xprocessor.result.XQueryResultType;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 * @author Swapnil Taneja
 *
 */
public class App {

	private static String queryFileName = "test_query.xqr";
	private static String outputFileName = "result.xml";
	private static String rewritedFileName = "rewritedQuery.xqr";
	private static String timeStats = "timeStats.txt";

	public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
		// String query = "doc(\"test.xml\")/title//actor[.==..]";
		// String query = "doc(\"input.xml\")/supercars/carname/";
		// String query =
		// "doc(\"j_caesar.xml\")//SPEECH/SPEAKER[not(./text()==./*/text())]/../../../../TITLE";
		String query = "";

		BufferedReader reader = new BufferedReader(new FileReader(new File(queryFileName)));
		while (reader.ready()) {
			query += reader.readLine() + "\n";
		}
		reader.close();

		ANTLRInputStream input = new ANTLRInputStream(query);
		XQueryLexer lexer = new XQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XQueryParser parser = new XQueryParser(tokens);
		parser.removeErrorListeners();

		ParseTree tree = parser.start();

		boolean rewriteQueries = true;
		if (rewriteQueries) {
			Rewriter rewriter = new Rewriter();
			query = rewriter.visit(tree);

			// reset ANTLR stream for re-written query
			input = new ANTLRInputStream(query);
			lexer = new XQueryLexer(input);
			tokens = new CommonTokenStream(lexer);
			parser = new XQueryParser(tokens);
			parser.removeErrorListeners();
			tree = parser.start();
		}
		
		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(rewritedFileName)));
		wr.write(query);
		wr.close();
		
		System.out.println(query);

		EvalVisitor visitor = new EvalVisitor();
		long startTime = System.currentTimeMillis();
		XQueryResult result = visitor.visit(tree);
		if (result == null) {
			System.out.println("Result is null");
		}
		long stopTime = System.currentTimeMillis();
		long timeElapsed = stopTime- startTime;
		System.out.println("Time for running the query is " + timeElapsed);
		wr = new BufferedWriter(new FileWriter(new File(timeStats)));
		wr.write("Time Elapsed for running query is "+timeElapsed);
		wr.close();
		// NodeListImpl nodes = result.getNodes();
		// HashMap<Node,Integer> map = new HashMap<Node,Integer>();
		//
		// if(nodes!=null){
		// for(int i=0;i<nodes.getLength();i++){
		// map.put(nodes.item(i), i);
		// }
		// NodeListImpl newNodes = new NodeListImpl();
		// Iterator it = map.entrySet().iterator();
		// while(it.hasNext()){
		// Map.Entry pair = (Map.Entry) it.next();
		// Node temp = (Node) pair.getKey();
		// newNodes.add(temp);
		// }
		// result.setNodes(newNodes);
		// }

		generateResultXMLFile(result);

	}

	public static void generateResultXMLFile(XQueryResult result)
			throws ParserConfigurationException, TransformerException, IOException {
		if (result == null) {
			System.out.println("Returned result is null");
			return;
		}
		if (result.getType() == XQueryResultType.NODES) {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			// root (result) element
			Element rootElement = doc.createElement("result");
			doc.appendChild(rootElement);

			// nodes element
			if (result.getNodes() != null && result.getNodes().getLength() > 0) {
				Element nodes = doc.createElement("nodes");
				rootElement.appendChild(nodes);

				for (Node node : result.getNodes()) {
					if (node == null) {
						// System.out.println("Node is null ");
						continue;
					}
					Node newNode = doc.importNode(node, true);
					nodes.appendChild(newNode);
				}
			}

			// Ignore all indentation from previous document
			removeEmptyText(doc.getDocumentElement());

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			DOMSource source = new DOMSource(doc);
			StreamResult streamResult = new StreamResult(new File(outputFileName));
			transformer.transform(source, streamResult);

			// Output to console for testing
			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);
		} else if (result.getType() == XQueryResultType.ATTR) {
			FileWriter writer = new FileWriter(new File(outputFileName));
			if (result.getNodes() != null) {
				for (Node node : result.getNodes()) {
					if (node == null) {
						continue;
					}
					String attrString = ((Attr) node).getValue();
					writer.write(attrString + "\n");
					System.out.println(attrString);
				}
			}
			writer.close();
		} else if (result.getType() == XQueryResultType.TEXT) {
			FileWriter writer = new FileWriter(new File(outputFileName));
			if (result.getNodes() != null) {
				for (Node node : result.getNodes()) {
					String attrString = ((Text) node).getTextContent();
					writer.write(attrString + "\n");
					System.out.println(attrString);
				}
			}
			writer.close();
		}
	}

	private static void removeEmptyText(Node node) {
		Node child = node.getFirstChild();
		while (child != null) {
			Node sibling = child.getNextSibling();
			if (child.getNodeType() == Node.TEXT_NODE) {
				if (child.getTextContent().trim().isEmpty())
					node.removeChild(child);
			} else
				removeEmptyText(child);
			child = sibling;
		}
	}

}