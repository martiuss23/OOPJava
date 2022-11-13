package model;

public class Subject implements Comparable<Subject> {
	private String id;
	private String name;
	private String type;
	public Subject(String id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + type; 
	}

	@Override
	public int compareTo(Subject o) {
		return id.compareTo(o.id);
	}
}
