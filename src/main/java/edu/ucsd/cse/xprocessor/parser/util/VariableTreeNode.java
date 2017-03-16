package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;

public class VariableTreeNode {

	private String variableName;
	private String xquery;
	private VariableTreeNode parent;
	private ArrayList<VariableTreeNode> children;

	public VariableTreeNode(String variableName, String xquery) {
		this.variableName = variableName;
		this.xquery = xquery;
		this.parent = null;
		this.children = new ArrayList<VariableTreeNode>();
	}
	
	public String getVariableName() {
		return variableName;
	}
	
	public String getXQuery() {
		return xquery;
	}
	
	public VariableTreeNode getParentNode() {
		return parent;
	}

	public void setParentNode(VariableTreeNode parent) {
		this.parent = parent;
	}

	public void addChildNode(VariableTreeNode child) {
		child.setParentNode(this);
		if (!children.contains(child)) {
			this.children.add(child);
		}
	}
	
	public ArrayList<VariableTreeNode> getChildren() {
		return children;
	}

}
