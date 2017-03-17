package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;
import java.util.Stack;

public class HyperGraphNode {

	private ArrayList<String> variableNames;
	private ArrayList<String> xqueries;
	private ArrayList<String> localConditions;
	private ArrayList<HyperGraphEdge> joinConditions;

	public HyperGraphNode() {
		super();
		this.variableNames = new ArrayList<String>();
		this.xqueries = new ArrayList<String>();
		this.localConditions = new ArrayList<String>();
		this.joinConditions = new ArrayList<HyperGraphEdge>();
	}

	public boolean hasVariable(String variableName) {
		return variableNames.contains(variableName);
	}

	public void initHyperGraphNode(VariableTreeNode node) {
		Stack<VariableTreeNode> nodeStack = new Stack<VariableTreeNode>();
		nodeStack.push(node);
		while (!nodeStack.isEmpty()) {
			VariableTreeNode temp = nodeStack.pop();
			variableNames.add(temp.getVariableName());
			xqueries.add(temp.getXQuery());

			ArrayList<VariableTreeNode> children = temp.getChildren();
			for (int i = children.size() - 1; i >= 0; i--) {
				nodeStack.push(children.get(i));
			}
		}
	}

	public void addLocalCondition(String conditionClause) {
		localConditions.add(conditionClause);
	}

	public void addHyperGraphEdge(HyperGraphEdge edge) {
		joinConditions.add(edge);
	}

	public ArrayList<String> getVariableNames() {
		return this.variableNames;
	}

	public ArrayList<HyperGraphEdge> getHyperGraphEdges() {
		return joinConditions;
	}

	@Override
	public String toString() {

		String queryString = "";

		String forClauseString = "for ";
		String returnClauseString = "return <tuple>{\n";
		for (int i = 0; i < variableNames.size(); i++) {
			forClauseString += variableNames.get(i) + " in " + xqueries.get(i);
			returnClauseString += "<" + variableNames.get(i).substring(1) + ">" + "{" + variableNames.get(i) + "}"
					+ "</" + variableNames.get(i).substring(1) + ">";
			if (i < variableNames.size() - 1) {
				forClauseString += ",";
				returnClauseString += ",";
			}
			forClauseString += "\n";
			returnClauseString += "\n";
		}
		returnClauseString += "}</tuple>";

		String whereClause = "";
		if (!localConditions.isEmpty()) {
			whereClause += "where";
			whereClause += localConditions.get(0);
			for (int i = 1; i < localConditions.size(); i++) {
				whereClause += " and " + localConditions.get(i);
			}
			whereClause += "\n";
		}

		queryString = forClauseString + whereClause + returnClauseString;

		return queryString;
	}
}
