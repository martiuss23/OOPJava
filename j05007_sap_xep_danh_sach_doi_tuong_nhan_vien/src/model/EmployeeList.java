package model;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	private ArrayList<Employee> list;
	
	public EmployeeList() {
		list = new ArrayList<>();
	}
	
	public void add(Employee emp) {
		list.add(emp);
	}
	
	public void sortByAge() {
		Collections.sort(list);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Employee emp : list) {
			str.append(emp + "\n");
		}
		return str.toString();
	}
}
