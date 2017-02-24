package edu.ucsd.cse.xprocessor.parser.context;

import java.util.HashMap;
import java.util.Iterator;

import org.w3c.dom.Node;

import edu.ucsd.cse.xprocessor.result.NodeListImpl;
import edu.ucsd.cse.xprocessor.result.XQueryResult;
import edu.ucsd.cse.xprocessor.result.XQueryResultType;

/**
 * 
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class XQueryContext implements Cloneable {

	/*
	 * Map of variable Name and Value
	 */
	private HashMap<String, Object> varContextMap;
	private HashMap<String, NodeListImpl> listContextMap;
	private HashMap<String, Iterator<Node>> iterContextMap;

	public XQueryContext() {
		this.varContextMap = new HashMap<String, Object>();
		this.listContextMap = new HashMap<String, NodeListImpl>();
		this.iterContextMap = new HashMap<String, Iterator<Node>>();
	}

	private XQueryContext(XQueryContext context) {
		this.varContextMap = new HashMap<String, Object>();
		this.listContextMap = new HashMap<String, NodeListImpl>();
		this.iterContextMap = new HashMap<String, Iterator<Node>>();
		if (context != null) {
			for (String key : context.varContextMap.keySet()) {
				this.varContextMap.put(key, context.varContextMap.get(key));
			}
			
			for (String key : context.listContextMap.keySet()) {
				this.listContextMap.put(key, context.listContextMap.get(key));
			}
			
			for (String key : context.iterContextMap.keySet()) {
				this.iterContextMap.put(key, context.iterContextMap.get(key));
			}
		}
	}
	
	public boolean incrementVariableIterator(String name) {
		boolean hasNext = false;
		if(iterContextMap.containsKey(name)) {
			hasNext = iterContextMap.get(name).hasNext();
			if(hasNext){
				varContextMap.put(name, iterContextMap.get(name).next());
			}
		}
		
		return hasNext;
	}
	
	public void resetVariableIterator(String name) {
		if(listContextMap.containsKey(name)) {
			Iterator<Node> iterator = listContextMap.get(name).iterator();
			iterContextMap.put(name, iterator);
		}
	}

	public Object getVariableValue(String name) {
		return varContextMap.get(name);
	}

	/**
	 * The method creates a new context (deep copy) with the variable set to new value.
	 * 
	 * @param name
	 *            variable name
	 * @param value
	 *            variable value
	 * @return new context
	 */
	public XQueryContext setVariableValue(String name, XQueryResult value) {
		XQueryContext newContext = new XQueryContext(this);
		
		if(value != null) {
			if(value.getType() == XQueryResultType.BOOLEAN) {
				newContext.varContextMap.put(name, value.isTrue());
			} else {
				newContext.listContextMap.put(name, value.getNodes());
				newContext.iterContextMap.put(name, value.getNodes().iterator());
			}
		}
		
		return newContext;
	}

}
