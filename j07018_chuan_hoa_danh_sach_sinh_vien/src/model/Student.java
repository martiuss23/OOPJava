package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private static int counter = 1;
	private String id;
	private String name;
	private String classs;
	private Date birthDay;
	private float gpa;
	Student(String name, String classs, String birthDay, float gpa) throws ParseException {
		id = String.format("B20DCCN%03d", counter++);
		this.name = name;
		this.classs = classs;
		this.birthDay = new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs + " " + new SimpleDateFormat("dd/MM/yyyy").format(birthDay) + " " + String.format("%.2f", gpa);
	}
	
}
