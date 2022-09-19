package model;

import java.util.ArrayList;

public class EmployeeList {
	private ArrayList<Employee> list;
	
	public EmployeeList() {
		list = new ArrayList<>();
	}
	
	public void add(Employee emp) {
		list.add(emp);
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
