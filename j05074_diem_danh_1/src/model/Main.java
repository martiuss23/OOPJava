package model;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StudentManagement studentMng = new StudentManagement();
		int numberOfStudent = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < numberOfStudent; i++) {
			studentMng.addStudent(new Student(scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		
		for(int i = 0; i < numberOfStudent; i++) {
			studentMng.addAttendanceScore(scn.next(), scn.next());
		}
		
		List<Student> students = studentMng.getAllStudent();
		students.forEach((student)->{
			System.out.println(student);
		});
		
	}
}

//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm