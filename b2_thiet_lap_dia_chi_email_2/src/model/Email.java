package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Email {
	private static LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
	
	private String name;
	private String email;
	
	public Email(String name) {
		this.name = name;
		this.email = standardMail(name);
		
	}
	
	private static String standardMail(String name) {
		Scanner scn = new Scanner(name);
		String str = "";
		while(scn.hasNext()) {
			String s = scn.next();
			if(scn.hasNext()) {
				str += s.charAt(0);
			}
			else {
				str = s + str;
			}
		}
		scn.close();
		return str + Email.getStatus(str) + "@ptit.edu.vn";
	}
	
	
	
	private static String getStatus(String nameStan) {
		if(mp.containsKey(nameStan)) {
			mp.put(nameStan, mp.get(nameStan) + 1);
			return mp.get(nameStan) + "";
		}
		mp.put(nameStan, 1);
		return "";
	}
	
	@Override
	public String toString() {
		return email;
	}
	
}
