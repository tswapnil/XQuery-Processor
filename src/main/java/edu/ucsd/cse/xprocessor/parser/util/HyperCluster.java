package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;
import java.util.HashSet;

public class HyperCluster {

	private ArrayList<HyperGraphNode> nodes;
	private ArrayList<HyperGraphEdge> neighborEdges;
	private HashSet<String> variableNames;
	private String queryString;

	public HyperCluster() {
		this.nodes = new ArrayList<HyperGraphNode>();
		this.neighborEdges = new ArrayList<HyperGraphEdge>();
		this.variableNames = new HashSet<String>();
		this.queryString = "";
	}

	public void addHyperGraphNode(HyperGraphNode node) {
		if (!nodes.isEmpty()) {

			nodes.add(node);

			queryString = "join" + "(\n" + queryString + ",\n" + node.toString() + ",\n";

			ArrayList<String> clusterJoinVariables = new ArrayList<String>();
			ArrayList<String> nodeJoinVariables = new ArrayList<String>();
			for (HyperGraphEdge edge : node.getHyperGraphEdges()) {
				if (neighborEdges.contains(edge)) {
					nodeJoinVariables.addAll(edge.getSameEndJoinVariables(node));
					clusterJoinVariables.addAll(edge.getOtherEndJoinVariables(node));
					// since node is part of cluster, any edge to it
					// from cluster is an internal edge i.e.
					// not a neighbor edge anymore.
					neighborEdges.remove(edge);
				} else {
					// all edges from the node to a non-member node
					// becomes a neighbor edge.
					neighborEdges.add(edge);
				}
			}

			if (clusterJoinVariables.size() != nodeJoinVariables.size()) {
				throw new RuntimeException("Oops, Something went wrong! Join Variable lists do not match.");
			}

			String clusterVariablesString = "[";
			String nodeVariablesString = "[";
			for (int i = 0; i < clusterJoinVariables.size(); i++) {
				if (i > 0) {
					clusterVariablesString += ", ";
					nodeVariablesString += ", ";
				}
				
				clusterVariablesString += clusterJoinVariables.get(i).substring(1);
				nodeVariablesString += nodeJoinVariables.get(i).substring(1);
			}
			clusterVariablesString += "]";
			nodeVariablesString += "]";
			
			queryString += clusterVariablesString + ", " + nodeVariablesString;
			
			queryString += "\n)";

			variableNames.addAll(node.getVariableNames());

		} else {
			nodes.add(node);
			neighborEdges.addAll(node.getHyperGraphEdges());
			variableNames.addAll(node.getVariableNames());
			queryString += node.toString();
		}
	}
	
	public boolean hasHyperGraphNode(HyperGraphNode node) {
		if(nodes.contains(node)) {
			return true;
		}
		
		return false;
	}

	public ArrayList<HyperGraphEdge> getNeighborEdges() {
		return this.neighborEdges;
	}
	
	public int size() {
		return nodes.size();
	}
	
	@Override
	public String toString() {
		return queryString;
	}

}
