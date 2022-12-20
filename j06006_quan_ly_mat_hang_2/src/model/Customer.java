package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private static int counter = 1;
	private String id;
	private String name;
	private String gender;
	private Date birthDay;
	private String address;
	
	public Customer(String name, String gender, String birthDay, String address) throws ParseException {
		id = String.format("KH%03d", counter++);
		this.name = name;
		this.gender = gender;
		this.birthDay = new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
		this.address = address;
	}
	
	String getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return name + " " + address;
	}
}
