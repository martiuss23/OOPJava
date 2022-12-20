package model;

import java.util.ArrayList;

public class Employee {
	private static int[][] coefficientBoard = {{10, 12, 14, 20},
			{10, 11, 13, 16},
			{9, 10, 12, 14},
			{8, 9, 11, 13}}; 
	
	
	private String id;
	private String name;
	private int basicSalary;
	private int workingdays;
	private Department department;
	
	
	Employee(String id, String name, int basicSalary, int workingdays) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.workingdays = workingdays;
	}
	
	void setDepartment(Department department){
		if(id.endsWith(department.getID()))
			this.department = department;
	}
	
	private int getTypeExp() {
		int exp = Integer.parseInt( "" +id.charAt(1) + id.charAt(2));
		if(exp >= 16) return 3;
		if(exp >= 9) return 2;
		if(exp >= 4) return 1;
		return 0;
	}
	
	private int getCoefficient() {
		return coefficientBoard[id.charAt(0) - 'A'][getTypeExp()];
	}
	
	String getDepartmentID() {
		return id.substring(3);
	}
	
	public int getSalary() {
		return getCoefficient() * basicSalary * workingdays * 1000;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + department + " " + getSalary();
	}
}
