/**
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 */
package edu.ucsd.cse.xprocessor.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.w3c.dom.Node;

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
		HashMap<Node,Integer> map = new HashMap<Node,Integer>();
		
        if(nodes!=null){
       	for(int i=0;i<nodes.getLength();i++){
             map.put(nodes.item(i), i);		
       	}
       	NodeListImpl newNodes = new NodeListImpl();
        	Iterator it = map.entrySet().iterator();
      	while(it.hasNext()){
        		Map.Entry pair = (Map.Entry) it.next();
       	    Node temp = (Node) pair.getKey();
        	    newNodes.add(temp);
        	}
      	   this.nodes = newNodes;
        }
        else 
        	this.nodes = nodes;
		
	}

	public XQueryResultType getType() {
		return type;
	}

}
