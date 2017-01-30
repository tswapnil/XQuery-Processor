package edu.ucsd.cse.xprocessor;

import java.io.File;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import edu.ucsd.cse.xprocessor.parser.EvalVisitor;
import edu.ucsd.cse.xprocessor.parser.XQueryLexer;
import edu.ucsd.cse.xprocessor.parser.XQueryParser;
import edu.ucsd.cse.xprocessor.result.XQueryResult;
import edu.ucsd.cse.xprocessor.result.XQueryResultType;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class App {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		// String query = "doc(\"test.xml\")/title//actor[.==..]";
		String query = "doc(\"input.xml\")/supercars/carname";

		ANTLRInputStream input = new ANTLRInputStream(query);
		XQueryLexer lexer = new XQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		XQueryParser parser = new XQueryParser(tokens);
		parser.removeErrorListeners();

		ParseTree tree = parser.start();
		EvalVisitor visitor = new EvalVisitor();
		XQueryResult result = visitor.visit(tree);

		generateResultXMLFile(result);

	}

	public static void generateResultXMLFile(XQueryResult result)
			throws ParserConfigurationException, TransformerException {
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

			if (result.getType() == XQueryResultType.NODES) {
				for (Node node : result.getNodes()) {
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Node newNode = doc.importNode(node, true);
						nodes.appendChild(newNode);
					}
				}
			}
		}

		// Ignore all indentation from previous document
		removeEmptyText(doc.getDocumentElement());

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

		DOMSource source = new DOMSource(doc);
		StreamResult streamResult = new StreamResult(new File("result.xml"));
		transformer.transform(source, streamResult);

		// Output to console for testing
		StreamResult consoleResult = new StreamResult(System.out);
		transformer.transform(source, consoleResult);
		
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