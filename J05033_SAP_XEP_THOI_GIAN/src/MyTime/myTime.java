package MyTime;

public class myTime implements Comparable<myTime> {
	private int hour, minute, seconds;

	
	public myTime(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	@Override
	public String toString() {
		return hour + " " + minute + " " +seconds;
	}

	@Override
	public int compareTo(myTime o) {
		if(this.hour > o.hour) return 1;
		if(this.hour == o.hour) {
			if(this.minute > o.minute) return 1;
			else if(this.minute == o.minute) {
				if(this.seconds > o.seconds) return 1;
				else if(this.seconds == o.seconds) return 0;
				return -1;
			}
		}
		return -1;
	}
	
}
