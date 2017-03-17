package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;
import java.util.Stack;

public class VariableTree {

	private VariableTreeNode root;

	public VariableTree() {
		this.root = new VariableTreeNode("$tuple", null);
	}

	public VariableTreeNode getRootNode() {
		return root;
	}

	public VariableTreeNode findNode(String variableName) {
		Stack<VariableTreeNode> nodeStack = new Stack<VariableTreeNode>();
		nodeStack.push(root);
		while (!nodeStack.isEmpty()) {
			VariableTreeNode node = nodeStack.pop();
			if (node.getVariableName().equals(variableName)) {
				return node;
			}

			ArrayList<VariableTreeNode> children = node.getChildren();
			for (int i = children.size() - 1; i >= 0; i--) {
				nodeStack.push(children.get(i));
			}
		}

		return null;
	}

	public boolean hasNode(String variableName) {
		VariableTreeNode node = findNode(variableName);
		return (node != null);
	}

	public void addNode(String variableName, String xquery) {
		if (!hasNode(variableName)) {
			// we can assume it is either absolute-path, relative-path or
			// variable as nested for loop are not allowed for this milestone

			// get first segment of the xquery that has indicators of path type
			String firstSegment = xquery.split("/")[0].split("//")[0];

			if (firstSegment.charAt(0) == '$') {
				// variable dependent path
				String parentName = firstSegment;
				VariableTreeNode parentNode = findNode(parentName);
				parentNode.addChildNode(new VariableTreeNode(variableName, xquery));
			} else if (firstSegment.startsWith("doc")) {
				// independent absolute path
				root.addChildNode(new VariableTreeNode(variableName, xquery));
			}
		}
	}

	public String getPath(String variableName) {
		String path = null;
		VariableTreeNode node = findNode(variableName);
		if (node != null) {
			path = "";
			ArrayList<String> reversePathSegments = new ArrayList<String>();
			while (node != null) {
				reversePathSegments.add(node.getVariableName().substring(1));
				node = node.getParentNode();
			}

			for (int i = reversePathSegments.size() - 1; i >= 0; i--) {
				if (i < reversePathSegments.size() - 1) {
					path += "/";
				}
				path += reversePathSegments.get(i);
			}
		}

		return path;
	}

}
