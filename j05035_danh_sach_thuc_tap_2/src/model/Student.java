package model;

public class Student implements Comparable<Student> {
	private int order;
	private String id;
	private String name;
	private String classs;
	private String email;
	private String enterprise;

	public Student(int order, String id, String name, String classs, String email, String enterprise) {
		this.order = order;
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.email = email;
		this.enterprise = enterprise;
	}
	
	public String getEnterprise() {
		return enterprise;
	}
	
	@Override
	public String toString() {
		return order + " " + id + " " + name + " " + classs + " " + email + " " + enterprise;
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
	
}
