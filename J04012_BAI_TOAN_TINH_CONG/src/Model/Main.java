package Model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name, position;
		int basicSalary, workingDay;
		
		name = scn.nextLine();
		basicSalary = scn.nextInt();
		workingDay = scn.nextInt();
		position = scn.next();
		
		Employee emp = new Employee(name, basicSalary, workingDay, position);
		System.out.println(emp);
	}
}
