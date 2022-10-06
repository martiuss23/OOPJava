package model;

public class Student implements Comparable<Student> {
	private String id;
	private Name name;
	private String phone;
	private String email;
	
	public Student(String id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = new Name(name);
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + phone + " " + email;
	}

	@Override
	public int compareTo(Student o) {
		if(name.compareTo(o.name) == 0) {
			return id.compareTo(o.id);
		}
		return name.compareTo(o.name);
	}
	
}
