package model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Subject implements Comparable<Subject>{
	private String sID;
	private String name;
	
	
	Subject(String sID, String name) {
		this.sID = sID;
		this.name = name;
	}
	
	public String getID() {
		return sID;
	}
	
	@Override
	public String toString() {
		return sID + " " + name;
	}

	@Override
	public int compareTo(Subject o) {
		return sID.compareTo(o.sID);
	}
}
