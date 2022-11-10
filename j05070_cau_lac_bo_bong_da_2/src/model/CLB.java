package model;

import java.util.HashMap;

public class CLB {
	private static HashMap<String, CLB> clbs = new HashMap<>();
	
	private String id;
	private String name;
	private int fare;
	
	public CLB(String id, String name, int fare) {
		this.id = id;
		this.name = name;
		this.fare = fare;
		clbs.put(id, this);
	}
	
	static CLB getCLB(String id) {
		if(clbs.containsKey(id)) return clbs.get(id);
		return null;
	}
	
	String getName() {
		return name;
	}
	
	int getFare() {
		return fare;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
