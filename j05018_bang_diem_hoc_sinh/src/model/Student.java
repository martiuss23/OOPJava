package model;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private double[] score;
	
	public Student(String id, String name, double[] score) {
		this.id = "HS" + id;
		this.name = name;
		this.score = score;
	}

	public double getAverage() {
		double average = 0;
		for(int index = 0; index < 10; index++) {
			if(index <= 1) {
				average += 2 * score[index];
			}
			else average += score[index];
		}
		average/=12;
		return Math.round(average * 10.0)/10.0;
	}
	
	public String getRank() {
		double average = this.getAverage();
		if(average >= 9.0) return "XUAT SAC";
		if(average >= 8.0) return "GIOI";
		if(average >= 7.0) return "KHA";
		if(average >= 5.0) return "TB";
		return "YEU";
	}
	
	@Override
	public int compareTo(Student o) {
		if(getAverage() < o.getAverage()) return 1;
		else if(getAverage() > o.getAverage()) return -1;
		return id.compareTo(o.id);
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getAverage()+ " " + getRank();
	}
	
}
