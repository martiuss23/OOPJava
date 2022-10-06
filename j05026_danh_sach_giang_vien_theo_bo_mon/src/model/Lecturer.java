package model;

import java.util.StringTokenizer;

public class Lecturer  {
	private String id;
	private String name;
	private String fields;
	
	public Lecturer(int id, String name, String fields) {
		this.id = "GV" + String.format("%02d", id);
		this.name = name;
		this.fields = fields;
	}

	public String getFields() {
		return fields;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + fields;
	}
	
}
