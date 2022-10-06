package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSchedule implements Comparable<TestSchedule> {
	private String id;
	private Date testDay;
	private Date start;
	private String testRoom;
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm");
	
	public TestSchedule(String id, String testDay, String start, String testRoom) throws ParseException {
		this.id =  "C" + id;
		this.testDay = DATE_FORMAT.parse(testDay);
		this.start = TIME_FORMAT.parse(start);
		this.testRoom = testRoom;
	}

	@Override
	public int compareTo(TestSchedule o) {
		if(start.getTime() + testDay.getTime() > o.start.getTime() + o.testDay.getTime()) return 1;
		if(start.getTime() + testDay.getTime() < o.start.getTime() + o.testDay.getTime()) return -1;
		return id.compareTo(o.id);
	}
	
	@Override
	public String toString() {
		return id + " " + DATE_FORMAT.format(testDay) + " " + TIME_FORMAT.format(start) + " " + testRoom;
	}
	
}
