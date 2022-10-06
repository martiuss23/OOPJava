package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner scn = new Scanner(new File("SV.in"));
		ArrayList<Student> list = new ArrayList<>();
		int amount = scn.nextInt();
		for(int id = 1; id <= amount; id++) {
			scn.nextLine();
			list.add(new Student(String.format("%03d", id), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextDouble()));
		}
		list.forEach((student)->System.out.println(student));
	}
}

//E:\\OOPJava\\j07010_danh_sach_sinh_vien_trong_file_2\\src\\model\\