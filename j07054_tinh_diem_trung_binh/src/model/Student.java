package model;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int oop;
	private int cpp;
	private int cLanguage;
	
	public Student(String id, String name, int oop, int cpp, int cLanguage) {
		this.id = "SV" + id;
		this.name = standardName(name);
		this.oop = oop;
		this.cpp = cpp;
		this.cLanguage = cLanguage;
	}
	
	private static String standardName(String name) {
		Scanner scn = new Scanner(name);
		StringBuilder sbd = new StringBuilder();
		while(scn.hasNext()) {
			String token = scn.next();
			sbd.append(Character.toUpperCase(token.charAt(0)) + token.substring(1).toLowerCase());
			sbd.append(" ");
		}
		return sbd.toString().trim();
	}
	
	public double getAverage() {
		return Math.round(((double)(oop*3 + cpp*3 + cLanguage*2)/8)*100)*0.01;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + String.format("%.2f", getAverage()) ;
	}

	@Override
	public int compareTo(Student o) {
		if(getAverage() > o.getAverage()) return -1;
		if(getAverage() < o.getAverage()) return 1;
		return 0;
	}
	
}


