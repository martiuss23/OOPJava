package model;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private String classs;
	private String email;
	
	public Student(String id, String name, String classs, String email) {
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs + " " + email;
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
	
	
	
}
