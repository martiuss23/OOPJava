package model;

import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement {
	private ArrayList<Student> list;
	public StudentManagement() {
		list = new ArrayList<>();
	}
	
	public void add(Student std) {
		list.add(std);
	}
	
	public void sort() {
		Collections.sort(list);
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
