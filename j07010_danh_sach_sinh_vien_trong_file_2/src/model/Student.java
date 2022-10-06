package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String id;
	private String name;
	private Date dob;
	private String classs;
	private double gpa;
	
	public Student(String id, String name, String classs, String dob, double gpa) throws ParseException {
		this.id = "B20DCCN" + id;
		this.name = name;
		this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		this.classs = classs;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " "+ classs + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa) ;
	}
	
}
