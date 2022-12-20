package model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Subject {
	private String sID;
	private String name;
	
	
	Subject(String sID, String name) {
		this.sID = sID;
		this.name = name;
	}
	
	public String getID() {
		return sID;
	}
	
	
}
