package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
	private String id;
	private String name;
	private String roomID;
	private Date checkInDate;
	private Date checkOutDate;
	private int daysOfStay;
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

		
	public Customer(String id, String name, String roomID, String checkInDate, String checkOutDate) throws ParseException {
		this.id = "KH" + id;
		this.name = name;
		this.roomID = roomID;
		this.checkInDate = DATE_FORMAT.parse(checkInDate);
		this.checkOutDate = DATE_FORMAT.parse(checkOutDate);
		daysOfStay =  (int)((this.checkOutDate.getTime()- this.checkInDate.getTime())/(24 * 60 * 60 *1000));
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + roomID + " " + daysOfStay;
	}

	@Override
	public int compareTo(Customer o) {
		if(daysOfStay > o.daysOfStay) return -1;
		if(daysOfStay < o.daysOfStay) return 1;
		return 0;
	}
	
	
	
}
