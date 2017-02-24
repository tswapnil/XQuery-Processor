package edu.ucsd.cse.xprocessor.parser.context;

import java.util.HashMap;

import edu.ucsd.cse.xprocessor.result.XQueryResult;

/**
 * 
 * @author Dhruv Sharma (dhsharma@cs.ucsd.edu)
 *
 */
public class XQueryContext implements Cloneable {

	/*
	 * Map of variable Name and Value
	 */
	private HashMap<String, XQueryResult> contextMap;

	public XQueryContext() {
		this.contextMap = new HashMap<String, XQueryResult>();
	}

	private XQueryContext(XQueryContext context) {
		this.contextMap = new HashMap<String, XQueryResult>();
		if (context != null) {
			for (String key : context.contextMap.keySet()) {
				this.contextMap.put(key, context.contextMap.get(key));
			}
		}
	}

	public XQueryResult getVariableValue(String name) {
		return contextMap.get(name);
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
		newContext.setVariableValue(name, value);
		return newContext;
	}

}
