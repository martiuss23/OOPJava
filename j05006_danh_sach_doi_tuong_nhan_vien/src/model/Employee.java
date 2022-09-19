package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private Date dob;
	private String address;
	private String taxCode;
	private Date contractSigningDate;
	private static int counter = 1;
	private static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Employee(String name, String gender, String dob, String address, String taxCode, String contractSigningDate) {
		this.id = counter;
		this.name = name;
		this.gender = gender;
		try {
			this.dob = formatDate.parse(dob);
		} catch (ParseException e) {
		}
		this.address = address;
		this.taxCode = taxCode;
		try {
			this.contractSigningDate = formatDate.parse(contractSigningDate);
		} catch (ParseException e) {
		}
		counter++;
	}
	
	@Override
	public String toString() {
		return String.format("%05d", id) + " " + name + " " + gender + " " + formatDate.format(dob) + " " + address + " " + taxCode + " " + formatDate.format(contractSigningDate);
	}
	
	
}
