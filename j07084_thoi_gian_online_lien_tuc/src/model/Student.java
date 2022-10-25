package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Student implements Comparable<Student> {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private String name;
	private Date logInTime;
	private Date logOutTime;
	
	public Student(String name, String logInTime, String logOutTime) throws ParseException {
		super();
		this.name = standardName(name);
		this.logInTime = DATE_FORMAT.parse(logInTime);
		this.logOutTime = DATE_FORMAT.parse(logOutTime);
	}
	
	public long getOnlineTime() {
		return TimeUnit.MINUTES.convert(logOutTime.getTime(), TimeUnit.MILLISECONDS) - TimeUnit.MINUTES.convert(logInTime.getTime(), TimeUnit.MILLISECONDS);
	}

	private static String standardName(String name) {
		Scanner scn = new Scanner(name);
		StringBuilder sbd = new StringBuilder();
		while(scn.hasNext()) {
			String token = scn.next();
			sbd.append(token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase() + " ");
		}
		scn.close();
		return sbd.toString().trim();
	}
	
	@Override
	public int compareTo(Student o) {
		if(getOnlineTime() > o.getOnlineTime()) return -1;
		if(getOnlineTime() < o.getOnlineTime()) return 1;
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return name + " " + getOnlineTime();
	}
}
