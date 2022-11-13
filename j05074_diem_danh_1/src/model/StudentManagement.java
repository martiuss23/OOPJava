package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class StudentManagement {
	private LinkedHashMap<String, Student> tableStudent;
	
	public StudentManagement() {
		tableStudent = new LinkedHashMap<>();
	}
	
	public void addStudent(Student student) {
		Student putStudent = new Student(student);
		//them truc tiep student thi the hien student o main co the thay doi truc tiep
		tableStudent.put(putStudent.getID(), putStudent);
	}
	
	void addAttendanceScore(String id, String dateStatus) {
		Student student = tableStudent.get(id);
		student.setAttendanceScore(StudentManagement.getAttendanceScore(dateStatus));
	}
	
	private static int getAttendanceScore(String dateStatus) {
		int score = 10;
		for(int i = 0; i < dateStatus.length(); i++) {
			if(dateStatus.charAt(i) == 'v') {
				score -= 2;
			}
			else if(dateStatus.charAt(i) == 'm') {
				score -= 1;
			}
		}
		return Math.max(score, 0);
	}
	
	List<Student> getAllStudent(){
		List<Student> students = new ArrayList<>();
		tableStudent.forEach((id, student)->{
			students.add(new Student(student));
		});
		return students;
	}
	
	
}
