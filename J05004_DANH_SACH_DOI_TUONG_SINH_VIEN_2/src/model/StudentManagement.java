package model;

import java.util.ArrayList;

public class StudentManagement {
	private ArrayList<Student> list;
	public StudentManagement() {
		list = new ArrayList<>();
	}
	
	public void add(Student std) {
		list.add(std);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(Student std : list) {
			sbd.append(std+"\n");
		}
		return sbd.toString();
	}
}
