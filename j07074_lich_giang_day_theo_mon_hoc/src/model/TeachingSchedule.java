package model;

public class TeachingSchedule implements Comparable<TeachingSchedule> {
	private static int counter = 1;
	private String id;
	private Subject subject;
	private int date;
	private int time;
	private String lecturerName;
	private String room;
	
	TeachingSchedule(Subject subject, int date, int time, String lecturerName, String room) {
		this.id = String.format("HP%03d", counter++);
		this.subject = subject;
		this.date = date;
		this.time = time;
		this.lecturerName = lecturerName;
		this.room = room;
	}
	
	Subject getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return id + " " + date + " " + time + " " + lecturerName + " " + room;
	}

	@Override
	public int compareTo(TeachingSchedule o) {
		if(this.date == o.date) {
			if(this.time == o.time)
				return this.lecturerName.compareTo(o.lecturerName);
			return time - o.time;
		}
		return date - o.date;
	}
	
	
}
