package model;

import java.util.TreeSet;

public class Student implements Comparable<Student>{
	private static int counter = 1;
	
	private String id;
	private String name;
	private double averageScore;
	private int rank;
	
	public Student(String name, double averageScore) {
		this.id = "HS" + String.format("%02d", counter++);
		this.name = name;
		this.averageScore = Math.round(averageScore *  10) * 0.1;
	}
	
	public String getLearningCapacity() {
		if(averageScore >= 9) return "Gioi";
		if(averageScore >= 7) return "Kha";
		if(averageScore >= 5) return "Trung Binh";
		return "Yeu";
		
	}
	
	void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getID() {
		return id;
	}
	
	
	public double getAverage() {
		return averageScore;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + String.format("%.1f", averageScore) + " " + getLearningCapacity() + " " + rank ;
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
}

