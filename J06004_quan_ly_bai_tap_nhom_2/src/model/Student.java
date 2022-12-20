package model;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
	private static List<Student> students = new ArrayList<>();
	
	private String id;
	private String name;
	private String phone;
	private int gid;
	
	public Student(String id, String name, String phone, int gID) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gid = gID;
	}
	
	static void addStudent(Student student) {
		students.add(student);
	}
	
	static List<Student> getStudentsInGroup(int gid) {
		List<Student> list = new ArrayList<>();
		for(Student std : students) {
			if(std.gid == gid) {
				list.add(std);
			}
		}
		return list;
	}
	
	static List<Student> getAllStudents(){
		return new ArrayList<>(students);
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + phone + " " + Group.getGroupByID(gid);
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
}
