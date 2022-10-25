package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Athlete {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	private static final String VDV = "VDV";
	private static int counter = 1;
	
	private String id;
	private String name;
	private Date birthDay;
	private Date departureTime;
	private Date finishTime;
	private int rank;
	
	public Athlete(String name, String birthDay, String departureTime, String finishTime) throws ParseException {
		this.id = VDV + String.format("%02d", counter++);
		this.name = name;
		this.birthDay = DATE_FORMAT.parse(birthDay);
		this.departureTime = TIME_FORMAT.parse(departureTime);
		this.finishTime = TIME_FORMAT.parse(finishTime);
	}
	
	String getID() {
		return id;
	}
	
	void setRank(int rank){
		this.rank = rank;
	}
	
	public int getAge() {
		int age =  (LocalDateTime.now().getYear() - (birthDay.getYear() + 1900 + 1));
		return age;
	}
	
	private Date getReducedSecond() throws ParseException {
		if(getAge() >= 32) return TIME_FORMAT.parse("00:00:03");
		if(getAge() >= 25) return TIME_FORMAT.parse("00:00:02");
		if(getAge() >= 18) return TIME_FORMAT.parse("00:00:01");
		return TIME_FORMAT.parse("00:00:00");
	}
	
	public Date getActualAchivement() throws ParseException {
		long diff = finishTime.getTime()/1000 - departureTime.getTime()/1000;
		long hour = TimeUnit.SECONDS.toHours(diff);
		long minute = TimeUnit.SECONDS.toMinutes(diff - hour*60*60);
		long second = diff- hour*60*60 - minute*60;
		return TIME_FORMAT.parse(String.format("%02d:%02d:%02d", hour, minute, second));
	}
	
	public Date getFinalResult() throws ParseException {
		long diff = getActualAchivement().getTime()/1000 - getReducedSecond().getTime()/1000;
		long hour = TimeUnit.SECONDS.toHours(diff);
		long minute = TimeUnit.SECONDS.toMinutes(diff - hour*60*60);
		long second = diff- hour*60*60 - minute*60;
		return TIME_FORMAT.parse(String.format("%02d:%02d:%02d", hour, minute, second));
	}
	
	@Override
	public String toString() {
		try {
			return id + " " + name  + " " + TIME_FORMAT.format(getActualAchivement()) + " " + TIME_FORMAT.format(getReducedSecond()) + " " + TIME_FORMAT.format(getFinalResult()) + " " + rank;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		
		}
		return "";
	}
	
	
	
}
