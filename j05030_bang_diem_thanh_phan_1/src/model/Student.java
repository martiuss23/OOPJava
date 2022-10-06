package model;

public class Student implements Comparable<Student>{
	private String id;
	private String name;
	private String classs;
	private double firstScore, secondScore, thirdScore;

	public Student(String id, String name, String classs, double firstScore, double secondScore, double thirdScore) {
		this.id = id;
		this.name = name;
		this.classs = classs;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs + " " + String.format("%.1f %.1f %.1f", firstScore, secondScore, thirdScore);
	}
	
}
