package model;

public class Student {
	private String id;
	private String name;
	private String classs;
	private int attendanceScore;
	
	public Student(String id, String name, String classs) {
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.attendanceScore = 10;
	}
	
	public Student(Student student) {
		this.id = student.id;
		this.name = student.name;
		this.classs = student.classs;
		this.attendanceScore = student.attendanceScore;
	}
	
	
	void setAttendanceScore(int attendanceScore) { //set once time
		if(attendanceScore >= 0 && this.attendanceScore == 10) {
			this.attendanceScore = attendanceScore;
		}
	}
	
	String getClasss() {
		return classs;
	}
	
	String getID() {
		return id;
	}
	
	private String getStatus() {
		if(attendanceScore == 0) return "KDDK";
		return "";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs + " " + attendanceScore + " " + getStatus();
	}
	
	
	
}
