package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Gamer implements Comparable<Gamer>{
	private String id;
	private String name;
	private Date timeIn;
	private Date timeOut;
	private long playingTime;
	public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm"); 
	
	public Gamer(String id, String name, String timeIn, String timeOut) throws ParseException {
		this.id = id;
		this.name = name;
		this.timeIn = TIME_FORMAT.parse(timeIn);
		this.timeOut = TIME_FORMAT.parse(timeOut);
		playingTime = this.timeOut.getTime() - this.timeIn.getTime();
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + String.format("%d gio %d phut", TimeUnit.MILLISECONDS.toHours(playingTime), TimeUnit.MILLISECONDS.toMinutes(playingTime) - TimeUnit.MILLISECONDS.toHours(playingTime) * 60 );
	}

	@Override
	public int compareTo(Gamer o) {
		if(playingTime > o.playingTime) return -1;
		if(playingTime < o.playingTime) return 1;
		return 0;
	}
	
	
	
}
