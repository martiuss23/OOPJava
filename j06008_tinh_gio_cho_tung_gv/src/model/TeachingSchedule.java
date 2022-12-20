package model;

public class TeachingSchedule {
	private Lecturer lecturer;
	private Subject subject;
	private float teachingTime;
	
	public TeachingSchedule(Lecturer lecturer, Subject subject, float timeTeaching) {
		this.lecturer = lecturer;
		this.subject = subject;
		this.teachingTime = timeTeaching;
	}
	
	Lecturer getLecturer() {
		return lecturer;
	}
	
	Subject getSubject() {
		return subject;
	}
	
	float getTimeTeaching() {
		return teachingTime;
	}

	
}
