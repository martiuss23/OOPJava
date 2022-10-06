package model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagement {
	private HashMap<String, ArrayList<Student>> table;
	
	public StudentManagement() {
		table = new HashMap<>();
	}
	
	public static String toKey(String major) {
		if(major.equals("KE TOAN")) return "DCKT";
		if(major.equals("CONG NGHE THONG TIN")) return "DCCN";
		if(major.equals("AN TOAN THONG TIN")) return "DCAT";
		if(major.equals("VIEN THONG")) return "DCVT";
		if(major.equals("DIEN TU")) return "DCDT";
		return "";
	}
	
	public void add(String key, Student value) {
		if(table.containsKey(key)) {
			table.get(key).add(value);
		}
		else {
			ArrayList<Student> ls = new ArrayList<>();
			ls.add(value);
			table.put(key, ls);
		}
	}
	
	public boolean containsKey(String key) {
		return table.containsKey(key);
	}
	
	public ArrayList<Student> get(String key){
		return table.get(key);
	}
	
}
