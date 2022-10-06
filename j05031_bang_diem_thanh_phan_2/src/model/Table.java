package model;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
	private ArrayList<Student> list;
	
	public Table() {
		list = new ArrayList<>();
	}
	
	public void add(Student std) {
		list.add(std);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(int i = 1; i <= list.size(); i++) {
			sbd.append(i + " " + list.get(i - 1) + '\n');
		}
		return sbd.toString();
	}
}
