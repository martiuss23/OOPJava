package model;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int practice;
	private int practiceOnline;
	private int finalTest;
	
	public Student(String id, String name, int practice, int practiceOnline, int finalTest) {
		this.id = "SV" + id;
		this.name = standardName(name);
		this.practice = practice;
		this.practiceOnline = practiceOnline;
		this.finalTest = finalTest;
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
		return Math.round(((double)(practice*0.25 + practiceOnline*0.35 + finalTest*0.4))*100)*0.01;
	}
	
	public String getRank() {
		double average = getAverage();
		if(average >= 8) return "GIOI";
		if(average >= 6.5) return "KHA";
		if(average >= 5) return "TRUNG BINH";
		return "KEM";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + String.format("%.2f", getAverage()) + " " + getRank() ;
	}

	@Override
	public int compareTo(Student o) {
		if(getAverage() > o.getAverage()) return -1;
		if(getAverage() < o.getAverage()) return 1;
		return 0;
	}
	
}


