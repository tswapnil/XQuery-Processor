package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;

public class HyperGraph {

	private ArrayList<HyperGraphNode> nodes;
	private HyperCluster cluster;

	public HyperGraph() {
		this.nodes = new ArrayList<HyperGraphNode>();
		this.cluster = new HyperCluster();
	}

	public void initHyperGraphNodes(ArrayList<VariableTreeNode> disjointVariableGroups) {
		for (VariableTreeNode treeNode : disjointVariableGroups) {
			HyperGraphNode graphNode = new HyperGraphNode();
			graphNode.initHyperGraphNode(treeNode);
			nodes.add(graphNode);
		}
	}

	public void initHyperGraphEdges(ArrayList<String> whereConditions) {
		for (String whereCondition : whereConditions) {
			String[] operands = whereCondition.trim().split("(eq|=)");
			String firstOperand = operands[0].trim();
			String secondOperand = operands[1].trim();

			HyperGraphNode firstOperandNode = null;
			HyperGraphNode secondOperandNode = null;
			for (HyperGraphNode node : nodes) {
				if (node.hasVariable(firstOperand)) {
					firstOperandNode = node;
				}
				if (node.hasVariable(secondOperand)) {
					secondOperandNode = node;
				}
			}

			if (firstOperandNode != null && secondOperandNode != null) {
				// create an edge and add to both nodes
				HyperGraphEdge edge = new HyperGraphEdge(firstOperandNode, secondOperandNode);
				edge.addJoinCondition(firstOperand, secondOperand);
				firstOperandNode.addHyperGraphEdge(edge);
				secondOperandNode.addHyperGraphEdge(edge);
			} else if (firstOperandNode != null && secondOperandNode == null) {
				// add condition to first node as local
				firstOperandNode.addLocalCondition(whereCondition);
			} else if (firstOperandNode == null && secondOperandNode != null) {
				// add condition as local to second node
				secondOperandNode.addLocalCondition(whereCondition);
			} else {
				// condition is either always true or always false as it doesn't
				// depend on iterated variables; so adding as local to any node
				// would result in correct result
				nodes.get(0).addLocalCondition(whereCondition);
			}

		}
	}

	/*
	 * This function implements modified Prim's algorithm to compute join order
	 * (spanning tree of joins)
	 */
	public void computeJoinOrder() {
		cluster.addHyperGraphNode(nodes.get(0));
		while (cluster.size() < nodes.size()) {
			ArrayList<HyperGraphEdge> neighborEdges = cluster.getNeighborEdges();
			if (neighborEdges.size() > 0) {
				// find a non-member neighbor node and add it to the cluster
				HyperGraphNode neighborNode = null;
				for (HyperGraphEdge edge : neighborEdges) {
					if (cluster.hasHyperGraphNode(edge.getFirstHyperGraphNode())
							&& !cluster.hasHyperGraphNode(edge.getSecondHyperGraphNode())) {
						neighborNode = edge.getSecondHyperGraphNode();
					} else if (!cluster.hasHyperGraphNode(edge.getFirstHyperGraphNode())
							&& cluster.hasHyperGraphNode(edge.getSecondHyperGraphNode())) {
						neighborNode = edge.getFirstHyperGraphNode();
					} else {
						throw new RuntimeException("Oops, Something went wrong! Invalid neighbor edge.");
					}
				}
				
				cluster.addHyperGraphNode(neighborNode);
			} else {
				// if there are no neighbors, a join with no condition
				// (cartesian product) will result
				// find any non-member node and add it to the cluster
				for (HyperGraphNode node : nodes) {
					if (!cluster.hasHyperGraphNode(node)) {
						cluster.addHyperGraphNode(node);
						break;
					}
				}
			}
		}
	}

	public String getJoinString() {
		return cluster.toString();
	}
	
	public ArrayList<String> getVariableNames() {
		ArrayList<String> variableNames = new ArrayList<String>();
		for (HyperGraphNode node : nodes) {
			variableNames.addAll(node.getVariableNames());
		}
		
		return variableNames;
	}

}
