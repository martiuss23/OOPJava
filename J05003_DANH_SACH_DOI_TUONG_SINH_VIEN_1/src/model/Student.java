package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String id;
	private String name;
	private Date dob;
	private String classs;
	private double gpa;
	private static int counter = 1;
	private static final String STANDARD_ID = "B20DCCN";
	private static final String PATTERN = "dd/MM/yyyy";
	
	public Student() {
	}

	public Student(String name, String classs, String dob,  double gpa) {
		this.id = STANDARD_ID + String.format("%03d", counter);
		this.name = name;
		try {
			this.dob = new SimpleDateFormat(PATTERN).parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.classs = classs;
		this.gpa = gpa;
		counter++;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs + " " + new SimpleDateFormat(PATTERN).format(dob) + " " + String.format("%.2f", gpa);
	}
	
}
