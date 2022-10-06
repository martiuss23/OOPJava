package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;


public class Candidate {
	private String id;
	private String name;
	private Date dob;
	private double theoryScore;
	private double practiceScore;
	
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	public Candidate(String id, String name, String dob, double theoryScore, double practiceScore) throws ParseException {
		this.id = "PH" + id;
		this.name = standardName(name);
		this.dob = DATE_FORMAT.parse(dob);
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
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
	
	public int getAge() {
		return (LocalDateTime.now().getYear() - dob.getYear() - 1901);
	}
	
	public double getRewardScore() {
		if(theoryScore >= 8 && practiceScore >= 8) return 1;
		if(theoryScore >= 7.5 && practiceScore >= 7.5 ) return 0.5;
		return 0;
	}
	
	public int getAverage() {
		return Math.min((int)(Math.round((theoryScore + practiceScore)/2 + getRewardScore())), 10);
	}
	
	public String getRank() {
		if(getAverage() >= 9) return "Xuat sac";
		if(getAverage() == 8) return "Gioi";
		if(getAverage() == 7) return "Kha";
		if(getAverage() >= 5) return "Trung binh";
		return "Truot";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getAge() + " " + getAverage() + " " + getRank();
	}
	
	
}
