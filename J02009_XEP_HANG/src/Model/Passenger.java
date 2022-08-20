package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Passenger implements Comparable<Passenger>{
	private int arriveTime;
	private int checkInTime;
	
	
	
	public Passenger() {
		
	}
	
	public Passenger(int arriveTime, int checkInTime) {
		this.arriveTime = arriveTime;
		this.checkInTime = checkInTime;
	}

	public int getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}
	public int getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(int checkInTime) {
		this.checkInTime = checkInTime;
	}
	
	public static int calcEndTime(ArrayList<Passenger> list) {
		Collections.sort(list);
		int endTime = 0;
		for(Passenger ps : list) {
			if(ps.getArriveTime() <= endTime) {
				endTime += ps.getCheckInTime();
			}
			else {
				endTime = ps.getArriveTime() + ps.getCheckInTime();
			}
		}
		return endTime;
	}
	
	@Override
	public int compareTo(Passenger o) {
		// TODO Auto-generated method stub
		if(this.getArriveTime() < o.getArriveTime()) return - 1;
		else if(this.getArriveTime() == o.getArriveTime())
			return 0;
		return 1;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Passenger> list = new ArrayList<>();
		int size = scanner.nextInt();
		for(int i = 0; i < size; i++) {
			int arriveTime = scanner.nextInt();
			int checkInTime = scanner.nextInt();
			list.add(new Passenger(arriveTime, checkInTime));
		}
		System.out.println(Passenger.calcEndTime(list));
	}
}
