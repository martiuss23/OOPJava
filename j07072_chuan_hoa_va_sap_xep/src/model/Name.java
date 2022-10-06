package model;

import java.util.Scanner;

public class Name implements Comparable<Name> {
	private String firstName;
	private String middleName;
	private String lastName;
	
	
	public Name(String name) {
		firstName = "";
		middleName = "";
		lastName = "";
		Scanner scn = new Scanner(name);
		while(scn.hasNext()) {
			String token = scn.next();
			if(firstName.equals("")) {
				firstName = token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase();
 			}
			else if(!scn.hasNext()) {
				lastName = token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase();
			}
			else {
				middleName += token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase() + " ";
			}
		}

 	}
	
	@Override
	public String toString() {
		return ((firstName + " " + middleName).trim() + " " + lastName).trim();
	}

	@Override
	public int compareTo(Name o) {
		if(lastName.compareTo(o.lastName) == 0) {
			if(firstName.compareTo(o.firstName) == 0) 
				return middleName.compareTo(o.middleName);
			return firstName.compareTo(o.firstName);
		}
		return lastName.compareTo(o.lastName);
	}
	
	
}
