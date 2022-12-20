package model;

public class Lecturer {
	private String id;
	private String name;
	
	
	
	public Lecturer(String id, String name) {
		this.id = id;
		this.name = name;
	}



	String getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
}
