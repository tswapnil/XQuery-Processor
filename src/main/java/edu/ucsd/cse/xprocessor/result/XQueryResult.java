/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 */
package edu.ucsd.cse.xprocessor.result;

import java.util.ArrayList;

/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class XQueryResult {
	
	private XQueryResultType type;
	private boolean bool;
	private NodeListImpl nodes;
	
	public XQueryResult(XQueryResultType type) {
		this.type = type;
		this.bool = false;
		this.nodes = null;
	}

	public boolean isTrue() {
		return bool;
	}

	public void setTruth(boolean bool) {
		this.bool = bool;
	}

	public NodeListImpl getNodes() {
		return nodes;
	}

	public void setNodes(NodeListImpl nodes) {
		this.nodes = nodes;
	}

	public XQueryResultType getType() {
		return type;
	}

}
