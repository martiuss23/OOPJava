package vn.edu.ptit;

public class Subject {
	private String id;
	private String name;
	private int credits;
	
	public Subject(String id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	}
	
	String getName() {
		return name;
	}
	
	int getCredits(){
		return credits;
	}
	
}
