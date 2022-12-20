package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<String, Department> departments = new HashMap<>();
		int numberOfDepartments = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < numberOfDepartments; i++) {
			String dID = scn.next();
			String[] dName = scn.nextLine().split("\\s+");
			departments.put(dID, new Department(dID, dName));
		}
		
		int numberOfEmp = Integer.parseInt(scn.nextLine());
		List<Employee> employees = new ArrayList<>();
		for(int i = 0; i < numberOfEmp; i++) {
			employees.add(new Employee(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine())));
		}
		for(Employee emp: employees) {
			emp.setDepartment(departments.get(emp.getDepartmentID()));
			System.out.println(emp);
		}
	}
}

//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24