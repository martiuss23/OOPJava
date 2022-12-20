package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nbOfStudents = scn.nextInt();
		int nbOfGroups = Integer.parseInt(scn.nextLine().trim());
		for(int i = 1; i <= nbOfStudents; i++) {
			Student.addStudent(new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(),Integer.parseInt(scn.nextLine())));
		}
		for(int i = 1; i <= nbOfGroups; i++) {
			Group.addGroup(new Group(scn.nextLine()));
		}
		int q = scn.nextInt();
		while(q-- > 0) {
			int gid = scn.nextInt();
			Group group = Group.getGroupByID(gid);
			List<Student> students = Student.getStudentsInGroup(gid);
			System.out.println("DANH SACH NHOM " + gid +":");
			for(Student std : students) {
				System.out.println(std);
			}
			System.out.println("Bai tap dang ky: " + group);
		}
		scn.close();
		
	}
}

//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//1
//1