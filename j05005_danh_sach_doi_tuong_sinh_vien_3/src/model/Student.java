package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
	private String ID;
	private String name;
	private Date dob;
	private String classs;
	private double gpa;
	private static int counter = 1;
	
	public Student(String name,String classs, String dob, double gpa) {
		this.ID = Constant.ID + String.format("%03d", counter);
		this.name = name;
		try {
			this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
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
		return ID + " " + name + " " + classs + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
	}

	@Override
	public int compareTo(Student o) {
		if(this.gpa > o.gpa) return -1;
		if(this.gpa < o.gpa) return 1;
		return 0;
	}
	
}
