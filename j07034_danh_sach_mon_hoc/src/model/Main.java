package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("MONHOC.in"));
		int amount = scn.nextInt();
		ArrayList<Subject> list = new ArrayList<>();
		for(int index = 1; index <= amount; index++) {
			scn.nextLine();
			list.add(new Subject(scn.nextLine(), scn.nextLine(), scn.nextInt()));
		}
		Collections.sort(list);
		list.forEach((subject)->System.out.println(subject));
	}
	
}
//E:\\OOPJava\\j07034_danh_sach_mon_hoc\\src\\model\\MONHOC.in
