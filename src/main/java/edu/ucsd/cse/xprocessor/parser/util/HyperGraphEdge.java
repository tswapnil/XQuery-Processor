package edu.ucsd.cse.xprocessor.parser.util;

import java.util.ArrayList;

public class HyperGraphEdge {
	
	private HyperGraphNode firstNode;
	private ArrayList<String> firstNodeVariables;
	private HyperGraphNode secondNode;
	private ArrayList<String> secondNodeVariables;
	
	public HyperGraphEdge(HyperGraphNode firstNode, HyperGraphNode secondNode) {
		this.firstNode = firstNode;
		this.firstNodeVariables = new ArrayList<String>();
		this.secondNode = secondNode;
		this.secondNodeVariables = new ArrayList<String>();
	}
	
	public void addJoinCondition(String firstVariable, String secondVariable) {
		firstNodeVariables.add(firstVariable);
		secondNodeVariables.add(secondVariable);
	}
	
	public HyperGraphNode getFirstHyperGraphNode() {
		return firstNode;
	}
	
	public HyperGraphNode getSecondHyperGraphNode() {
		return secondNode;
	}
	
	public boolean isEndpoint(HyperGraphNode node) {
		if(firstNode.equals(node) || secondNode.equals(node)) {
			return true;
		}
		
		return false;
	}
	
	public HyperGraphNode getOtherEndpoint(HyperGraphNode node) {
		if(isEndpoint(node)) {
			if(firstNode.equals(node)) {
				return secondNode;
			}
			
			if(secondNode.equals(node)) {
				return firstNode;
			}
		}
		
		return null;
	}
	
	public ArrayList<String> getOtherEndJoinVariables(HyperGraphNode node) {
		if(isEndpoint(node)) {
			if(firstNode.equals(node)) {
				return secondNodeVariables;
			}
			
			if(secondNode.equals(node)) {
				return firstNodeVariables;
			}
		}
		
		return null;
	}
	
	public ArrayList<String> getSameEndJoinVariables(HyperGraphNode node) {
		if(isEndpoint(node)) {
			if(firstNode.equals(node)) {
				return firstNodeVariables;
			}
			
			if(secondNode.equals(node)) {
				return secondNodeVariables;
			}
		}
		
		return null;
	}

}
