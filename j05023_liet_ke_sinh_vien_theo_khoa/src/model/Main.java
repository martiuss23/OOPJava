package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		scn.nextLine();
		StudentManagement mng = new StudentManagement();
		for(int i = 1; i <= amount; i++) {
			Student std = new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
			mng.add(std.getYearOfAdmission(), std);
		}
		int q = scn.nextInt();
		scn.nextLine();
		while(q-- > 0) {
			String year = scn.nextLine();
			System.out.println("DANH SACH SINH VIEN KHOA " + year +":");
			ArrayList<Student> list = mng.get(year);
			list.forEach((student)->System.out.println(student));
		}
	}
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015