package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;


public class Graph {
	private HashMap<Integer, HashSet<Integer>> adj;
	public Graph(){
		adj = new HashMap<>();
	}
	
	public void add(Integer u, Integer v) {
		if(adj.containsKey(u)) {
			HashSet<Integer> verticals = adj.get(u);
			verticals.add(v);
		}
		else {
			HashSet<Integer> verticals = new HashSet<>();
			verticals.add(v);
			adj.put(u, verticals);
		}
	}
	
	public boolean isStarGraph() {
		for(Entry<Integer, HashSet<Integer>> vertical : adj.entrySet()) {
			if(adj.size() == vertical.getValue().size() + 1) return true;
		}
		return false;
	}
	
	
}
