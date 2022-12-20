package model;

public class Subject {
	private String id;
	private String name;
	private int credits;
	
	Subject(String id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}
	
	String getName() {
		return name;
	}
	
	String getID() {
		return id;
	}
	
}
