package edu.ucsd.cse.xprocessor.result;

import java.util.ArrayList;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class NodeListImpl extends ArrayList<Node> implements NodeList {

	@Override
	public int getLength() {
		return size();
	}

	@Override
	public Node item(int index) {
		try {
			return get(index);
		} catch (IndexOutOfBoundsException ex) {
			return null;
		}
	}

}
