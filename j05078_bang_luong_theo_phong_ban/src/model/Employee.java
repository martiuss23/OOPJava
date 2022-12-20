package model;

import java.util.ArrayList;

public class Employee {
	 
	
	
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
	
	Employee(Employee employee) {
		this.id = employee.id;
		this.name = employee.name;
		this.basicSalary = employee.basicSalary;
		this.workingdays = employee.workingdays;
	}
	
	void setDepartment(Department department){
		if(id.endsWith(department.getID()))
			this.department = department;
	}
	
	String getID() {
		return id;
	}
	
//	private int getCoefficient() {
//		return coefficientBoard[id.charAt(0) - 'A'][getTypeExp()];
//	}
	
	String getDepartmentID() {
		return id.substring(3);
	}
	
	public int getSalary() {
		return SalaryManager.getCoefficient(this) * basicSalary * workingdays * 1000;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getSalary();
	}
}
