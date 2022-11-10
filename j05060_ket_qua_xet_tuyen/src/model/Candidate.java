package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Candidate {
	private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static int cid = 1;
	
	private String id;
	private String name;
	private Date birthDay;
	private double theoryScore;
	private double practiceScore;
	
	public Candidate(String name, String birthDay, double theoryScore, double practiceScore) throws ParseException {
		id = "PH" + String.format("%02d", cid++);
		this.name = name;
		this.birthDay = DATE_FORMAT.parse(birthDay);
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}
	
	
	private int getAge() {
		return LocalDate.now().getYear() - (birthDay.getYear() + 1900 + 1);
	}
	
	private double getBonusScore() {
		if(theoryScore >= 8 && practiceScore >= 8) return 1;
		if(theoryScore >= 7.5 && practiceScore >= 7.5) return 0.5;
		return 0;
	}
	
	private int getRatingScore() {
		return Math.min(10,(int)Math.round((theoryScore + practiceScore)/2 + getBonusScore()));
	}
	
	private String getRank() {
		int totalScore = getRatingScore();
		if(totalScore >= 9) return "Xuat sac";
		if(totalScore == 8) return "Gioi";
		if(totalScore == 7) return "Kha";
		if(totalScore >= 5) return "Trung binh";
		return "Truot";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getAge() + " " + getRatingScore() + " " + getRank();
	}
	
}
