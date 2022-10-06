package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		while(scn.hasNextLine()) {
			list.add(new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
//			if(list.size() == 4) break;
		}
		Collections.sort(list);
		list.forEach((student)->System.out.println(student));
	}
}
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
//D15CQKT03-B
//sv4@stu.ptit.edu.vn