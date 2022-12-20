package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Intern {
	private Manufacture manufacture;
	private List<Student> students;
	
	public Intern(Manufacture manufacture) {
		this.manufacture = manufacture;
		students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		if(students == null)
			students = new ArrayList<>();
		students.add(student);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder("DANH SACH THUC TAP TAI " + manufacture.getName() + ":\n");
		Collections.sort(students);
		for(int i = 0; i < Math.min(students.size(), manufacture.getNumberOfStudent()); i++)
			sbd.append(students.get(i) + "\n");
		return sbd.toString();
	}
	
}
