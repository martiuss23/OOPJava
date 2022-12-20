package vn.edu.ptit;

public class Rule {
	private String id;
	private String name;
	private int cost;
	
	public Rule(String id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public String getCode() {
		return id;
	}
	
	int getCost() {
		return cost;
	}
	
}
