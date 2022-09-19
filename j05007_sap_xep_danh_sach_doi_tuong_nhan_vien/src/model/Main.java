package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numOfEmp = scn.nextInt();
		EmployeeList ls = new EmployeeList();
		scn.nextLine();
		for(int i = 1; i <= numOfEmp; i++) {
			ls.add(new Employee(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		ls.sortByAge();
		System.out.println(ls);
	}
}

//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011