package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt implements Comparable<Receipt>{
	private String id;
	private String cusName;
	private String room;
	private Date checkInDate;
	private Date checkOutDate;
	private int extraFee;
	private int numberOfDay;
	private int totalPayment;
	
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	public Receipt(String id, String cusName, String room, String checkInDate, String checkOutDate, int extraFee) throws ParseException {
		this.id = "KH" + id;
		this.cusName = cusName;
		this.room = room;
		this.checkInDate = DATE_FORMAT.parse(checkInDate);
		this.checkOutDate = DATE_FORMAT.parse(checkOutDate);
		this.extraFee = extraFee;
		numberOfDay = (int)((this.checkOutDate.getTime() - this.checkInDate.getTime())/(24*60*60*1000)) + 1;
		totalPayment = numberOfDay * getCostPerDay(room.charAt(0)) + extraFee;
	}
	
	private static int getCostPerDay(char floor) {
		if(floor == '1') return 25;
		if(floor == '2') return 34;
		if(floor == '3') return 50;
		return 80;
	}
	
	@Override
	public String toString() {
		return id + " " + cusName + " " + room + " " + numberOfDay + " " + totalPayment;
	}

	@Override
	public int compareTo(Receipt o) {
		if(totalPayment > o.totalPayment) return -1;
		if(totalPayment < o.totalPayment) return 1;
		return 0;
	}
	
	
}
