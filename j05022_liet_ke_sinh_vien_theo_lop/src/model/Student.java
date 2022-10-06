package model;

public class Student {
	private String ID;
	private String name;
	private String classs;
	private String email;
	
	public Student(String iD, String name, String classs, String email) {
		ID = iD;
		this.name = name;
		this.classs = classs;
		this.email = email;
	}
	
	public String getClasss() {
		return classs;
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + classs + " " + email;
	}

	
}