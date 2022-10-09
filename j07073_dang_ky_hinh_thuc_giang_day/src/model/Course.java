package model;

public class Course implements Comparable<Course>{
	private String id;
	private String name;
	private int courseCredit;
	private String theory;
	private String practice;
	
	public Course(String id, String name, int courseCredit, String theory, String practice) {
		this.id = id;
		this.name = name;
		this.courseCredit = courseCredit;
		this.theory = theory;
		this.practice = practice;
	}

	public int getPracticeForm() {
		// online 1 offline 0
		if(practice.equals("Truc tuyen") || practice.endsWith(".ptit.edu.vn")) {
			return 1;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + courseCredit + " " + theory + " " + practice;
	}

	@Override
	public int compareTo(Course o) {
		return id.compareTo(o.id);
	}
	
}
