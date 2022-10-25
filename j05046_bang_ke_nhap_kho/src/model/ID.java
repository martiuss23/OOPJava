package model;

import java.util.HashMap;

public class ID {
	private static HashMap<String, Integer> tableID = new HashMap<>();
	private String id;

	public ID(String name) {
		this.id = generateID(name);
	}
	
	private String generateID(String name) {
		String[] tokens = name.split("\\s+");
		String suff = ""+ Character.toUpperCase(tokens[0].charAt(0)) + Character.toUpperCase(tokens[1].charAt(0));
		
		if(tableID.containsKey(suff)) {
			tableID.put(suff, tableID.get(suff) + 1);
		}
		else tableID.put(suff, 1);
		return suff + String.format("%02d", tableID.get(suff));
	}
	
	@Override
	public String toString() {
		return id;
	}
}
