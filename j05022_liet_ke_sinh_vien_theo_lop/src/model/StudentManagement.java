package model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagement {
	private HashMap<String, ArrayList<Student>> table;
	
	public StudentManagement() {
		table = new HashMap<>();
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
	
	public ArrayList<Student> get(String key){
		return table.get(key);
	}
	
}
