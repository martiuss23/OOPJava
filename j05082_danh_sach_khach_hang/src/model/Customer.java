package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Customer implements Comparable<Customer> {
	private static int counter = 1;
	private static HashSet<Date> birthDays = new HashSet<>();
	private String id;
	private String name;
	private String gender;
	private Date birthDay;
	private String address;
	
	Customer(String name, String gender, String birthDay, String address) throws ParseException {
		this.id = String.format("KH%03d", counter++);
		this.name = name;
		this.gender = gender;
		this.birthDay = new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + gender + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(birthDay) ;
	}

	@Override
	public int compareTo(Customer o) {
		return birthDay.compareTo(o.birthDay);
	}
	
	
}
