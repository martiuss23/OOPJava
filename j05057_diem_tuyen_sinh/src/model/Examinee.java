package model;

import java.util.Scanner;

public class Examinee implements Comparable<Examinee> {
	private static int counter = 1;
	private String id;
	private String name;
	private double score;
	private String ethnic;
	private int area;
	
	public Examinee(String name, double score, String ethnic, int area) {
		id = "TS" + String.format("%02d", counter++);
		this.name = standardName(name);
		this.score = score;
		this.ethnic = ethnic;
		this.area = area;
	}
	
	private static String standardName(String name) {
		Scanner scn = new Scanner(name);
		StringBuilder sbd = new StringBuilder();
		while(scn.hasNext()) {
			String token = scn.next();
			sbd.append(token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase());
			sbd.append(" ");
		}
		return sbd.toString().trim();
	}
	
	public double getAreaScore() {
		if(area == 1) return 1.5;
		if(area == 2) return 1;
		return 0;
	}
	
	public double getPriorScore() {
		if(ethnic.equals("Kinh")) {
			return getAreaScore();
		}
		return getAreaScore() + 1.5;
	}
	
	public double getTotalScore() {
		return score + getPriorScore();
	}
	
	public String getStatus() {
		if(getTotalScore() < 20.5) return "Truot";
		return "Do";
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + String.format("%.1f", getTotalScore()) + " " + getStatus();
	}

	@Override
	public int compareTo(Examinee o) {
		if(getTotalScore() > o.getTotalScore()) return -1;
		else if(getTotalScore() < o.getTotalScore()) return 1;
		return id.compareTo(o.id);
	}
	
}
