package model;

public class Student implements Comparable<Student> {
	private String name;
	private int correctSubmit;
	private int totalSubmit;
	
	public Student(String name, int correctSubmit, int totalSubmit) {
		this.name = name;
		this.correctSubmit = correctSubmit;
		this.totalSubmit = totalSubmit;
	}

	@Override
	public int compareTo(Student o) {
		if(this.correctSubmit == o.correctSubmit) {
			if(this.totalSubmit == o.totalSubmit) return name.compareTo(o.name);
			else if(totalSubmit > o.totalSubmit) return 1;
			else return -1;
		}
		else if(correctSubmit < o.correctSubmit) return 1;
		return -1;
	}
	
	@Override
	public String toString() {
		return name + " " + correctSubmit + " " + totalSubmit;
	}
}
