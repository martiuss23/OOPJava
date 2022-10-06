package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("SINHVIEN.in"));
		int amount = fileIn.nextInt();
		fileIn.nextLine();
		ArrayList<Student> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			String id = fileIn.nextLine();
			Scanner stk = new Scanner(fileIn.nextLine());
			String classs = fileIn.nextLine();
			String email = fileIn.nextLine();
			StringBuilder sbd = new StringBuilder();
			while(stk.hasNext()) {
				String token = stk.next();
				sbd.append(Character.toUpperCase(token.charAt(0)) + token.substring(1).toLowerCase());
				sbd.append(" ");
			}
			list.add(new Student(id, sbd.toString().trim(), classs, email));
		}
		Collections.sort(list);
		list.forEach((student)->System.out.println(student));
	}
}
//E:\OOPJava\j07033_danh_sach_sinh_vien_trong_file_1\src\model
