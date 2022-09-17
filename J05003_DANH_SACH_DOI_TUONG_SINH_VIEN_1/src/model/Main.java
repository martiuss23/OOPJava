package model;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		StudentManagement manager = new StudentManagement();
		for(int i = 1; i <= size; i++) {
			scn.nextLine();
			manager.add(new Student(scn.nextLine(),scn.nextLine(), scn.nextLine(),  scn.nextDouble()));
		}
		System.out.println(manager);
	}
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3,19