package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
	private String name;
	private Date dob;
	private SimpleDateFormat sdf;
	
	public Person(String name, String dob) throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.name = name;
		this.dob = sdf.parse(dob);
	}

	@Override
	public int compareTo(Person o) {
		return dob.compareTo(o.dob);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
