package model;

import java.util.ArrayList;
import java.util.List;

public class TeacherList {
	private Principle principle;
	private VicePrincipal vice1, vice2;
	private List<Teacher> teachers;
	
	public TeacherList() {
		teachers = new ArrayList<>();
	}
	
	private Teacher constructTeacher(String id, String name, int salary) {
		if(id.startsWith("HT")) {
			return new Principle(id, name, salary);
		}
		else if (id.startsWith("HP")) return new VicePrincipal(id, name, salary);
		return new Teacher(id, name, salary);
	}
	
	public void addTeacher(String id, String name, int salary) {
		Teacher teacher = constructTeacher(id, name, salary);
		if(teacher instanceof Principle) {
			if(principle != null) return;
			principle = (Principle) teacher;
		}
		else if(teacher instanceof VicePrincipal) {
			if(vice1 == null) vice1 = (VicePrincipal) teacher;
			else if(vice2 == null) vice2 = (VicePrincipal) teacher;
			else return;
		}
		teachers.add(teacher);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(Teacher teacher:teachers)
			sbd.append(teacher + "\n");
		return sbd.toString();
	}
	
	
}
