package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TeacherList teacherList  = new TeacherList();
		int amountOfTeacher = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= amountOfTeacher; i++) {
			teacherList.addTeacher(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
		}
		System.out.println(teacherList);
	}
}

//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000