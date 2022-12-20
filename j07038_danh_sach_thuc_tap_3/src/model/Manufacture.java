package model;

public class Manufacture {
	private String id;
	private String name;
	private int numberOfStudent;
	
	Manufacture(String id, String name, int numberOfStudent) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfStudent = numberOfStudent;
	}
	
	String getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getNumberOfStudent() {
		return numberOfStudent;
	}
}
