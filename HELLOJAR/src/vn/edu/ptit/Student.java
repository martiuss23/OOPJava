package vn.edu.ptit;

public class Student {
	private String id;
	private String name;
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getCode() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
