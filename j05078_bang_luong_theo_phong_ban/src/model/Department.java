package model;

import java.util.Arrays;

public class Department {
	private String id;
	private String[] name;
	
	Department(String id, String[] name) {
		this.id = id;
		this.name = Arrays.copyOf(name, name.length);
	}
	
	String getID() {
		return id;
	}
	
	@Override
	public String toString() {
		String nName = "";
		for(String part: this.name) {
			nName += part + " ";
		}
		return nName.trim();
	}
}
