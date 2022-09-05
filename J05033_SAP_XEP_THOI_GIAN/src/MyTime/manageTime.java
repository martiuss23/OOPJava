package MyTime;

import java.util.ArrayList;
import java.util.Collections;

public class manageTime {
	private ArrayList<myTime> ls;
	
	public manageTime() {
		ls = new ArrayList<>();
	}
	
	public void addTime(myTime time) {
		ls.add(time);
	}
	
	public void sort() {
		Collections.sort(ls);
	}
	
	public void show() {
		ls.forEach((time)->System.out.println(time.toString()));
	}
}
