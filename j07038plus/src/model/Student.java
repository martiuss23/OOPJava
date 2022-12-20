package model;

import java.util.Scanner;

public class Student implements Comparable<Student>{
	private String id;
	private String name;
	private String classs;
	private String email;
	
	Student(String id, String name, String classs, String email) {
		super();
		this.id = id;
		this.name = standardName(name);
		this.classs = classs;
		this.email = email;
	}
	
	private static String standardName(String oldName) {
		Scanner tokenize = new Scanner(oldName);
		String newName = "";
		while(tokenize.hasNext()) {
			String token = tokenize.next();
			newName += token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase() + " ";
		}
		return newName.trim();
	}
	
	String getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs;
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}
	
}
