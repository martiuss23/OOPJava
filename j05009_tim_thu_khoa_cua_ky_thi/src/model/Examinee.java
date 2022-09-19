package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Examinee implements Comparable<Examinee>{
	private int id;
	private String name;
	private String dob;
	private double firstScore;
	private double secondScore;
	private double thirdScore;
	private double total;
	
	private static int counter = 0;
	
	
	public Examinee(String name, String dob, double firstScore, double secondScore, double thirdScore) {
		counter++;
		this.id = counter;
		this.name = name;
		this.dob = dob;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
		this.totalScore();
	}
	
	private void totalScore() {
		this.total = firstScore + secondScore + thirdScore;
	}
	
	public double getTotalScore() {
		return total;
	}
	
	@Override
	public int compareTo(Examinee o) {
		if(this.total > o.total) return -1;
		if(this.total < o.total) return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + dob + " " + total;
	}
	
}
