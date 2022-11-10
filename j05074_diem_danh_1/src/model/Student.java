package model;

import java.util.HashMap;

public class Student {	
	private String id;
	private String name;
	private String classs;
	
	public Student(String id, String name, String classs) {
		this.id = id;
		this.name = name;
		this.classs = classs;
	}
	
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + classs ;
	}
	
	
}
