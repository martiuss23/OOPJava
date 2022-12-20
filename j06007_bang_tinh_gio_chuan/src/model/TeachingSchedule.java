package model;

public class TeachingSchedule {
	private Lecturer lecturer;
	private Subject subject;
	private float teachingTime;
	
	public TeachingSchedule(Lecturer lecturer, Subject subject, float timeTeaching) {
		super();
		this.lecturer = lecturer;
		this.subject = subject;
		this.teachingTime = timeTeaching;
	}
	
	Lecturer getLecturer() {
		return lecturer;
	}
	
	float getTimeTeaching() {
		return teachingTime;
	}
	
}
