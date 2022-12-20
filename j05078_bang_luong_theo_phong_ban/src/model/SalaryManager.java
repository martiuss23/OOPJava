package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SalaryManager {
	private static int[][] coefficientBoard = {{10, 12, 14, 20},
			{10, 11, 13, 16},
			{9, 10, 12, 14},
			{8, 9, 11, 13}};
	
	private static HashMap<String, Department> departments = new HashMap<>();
	private static List<Employee> employees = new ArrayList<>();
	
	private SalaryManager() {
		
	}
	
	private static int getTypeExp(String experience) {
		int exp = Integer.parseInt(experience);
		if(exp >= 16) return 3;
		if(exp >= 9) return 2;
		if(exp >= 4) return 1;
		return 0;
	}
	
	static int getCoefficient(Employee employee) {
		return coefficientBoard[employee.getID().charAt(0) - 'A'][getTypeExp(employee.getID().substring(1, 3))];
	}
	
	static void addDepartment(Department department) {
		departments.put(department.getID(), department);
	}
	
	static void addEmployee(Employee employee) {
		employee.setDepartment(departments.get(employee.getDepartmentID()));
		employees.add(employee);
	}
	
	static String getSalaryBoardByDepartment(String departmentID){
		StringBuilder salaryBoard = new StringBuilder("Bang luong phong " + departments.get(departmentID) + ":\n" );
		for(Employee employee : employees) {
			if(employee.getDepartmentID().equals(departmentID))
				salaryBoard.append(employee +"\n");
		}
		return salaryBoard.toString().trim();
	}
}
