package model;

import java.util.Scanner;

public class Examinee implements Comparable<Examinee> {
	private String id;
	private String name;
	private double firstScore;
	private double secondScore;
	private double thirdScore;
	
	public Examinee(String id, String name, double firstScore, double secondScore, double thirdScore) {
		this.id = id;
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}
	
	public double getAreaScore() {
		if(id.charAt(2) == '1') return 0.5;
		if(id.charAt(2) == '2') return 1;
		return 2.5;
	}
	
	public double getTotalScore() {
		return firstScore*2 + secondScore + thirdScore;
	}
	
	public String getStatus() {
		if(getTotalScore() + getAreaScore() < 24) return "TRUOT";
		return "TRUNG TUYEN";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + ((getAreaScore() - (int)(getAreaScore()) != 0)?String.format("%.1f", getAreaScore()):(int)getAreaScore()) + " " + ((getTotalScore()  - (int)getTotalScore() !=0)?String.format("%.1f", getTotalScore()):(int)getTotalScore()) + " " + getStatus();
	}

	@Override
	public int compareTo(Examinee o) {
		if(getTotalScore() > o.getTotalScore()) return -1;
		else if(getTotalScore() < o.getTotalScore()) return 1;
		return id.compareTo(o.id);
	}
	
}
