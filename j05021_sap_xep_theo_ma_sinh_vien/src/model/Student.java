package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
	private String ID;
	private String name;
	private String classs;
	private String email;
	
	public Student(String iD, String name, String classs, String email) {
		ID = iD;
		this.name = name;
		this.classs = classs;
		this.email = email;
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + classs + " " + email;
	}

	@Override
	public int compareTo(Student o) {
		return ID.compareTo(o.ID);
	}
	
}
