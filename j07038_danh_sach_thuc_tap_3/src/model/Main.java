package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("SINHVIEN.in"));
		InternManager it = InternManager.getInstance();
		int nbOfStudents = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfStudents; i++) {
			Student std = new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
			it.addStudent(std);
		}
		
		scn = new Scanner(new File("DN.in"));
		int nbOfManu = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfManu; i++) {
			Manufacture manufacture = new Manufacture(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
			it.addManufacture(manufacture);
		}
		
		scn = new Scanner(new File("THUCTAP.in"));
		int nbOfInterns = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfInterns; i++) {
			it.addIntern(scn.next(), scn.nextLine().trim());
		}
		int q = Integer.parseInt(scn.nextLine());
		while(q-- > 0) {
			String manufactureID = scn.nextLine();
			System.out.println("DANH SACH THUC +"
					+ "TAP TAI " + it.getManufacture(manufactureID).getName() + ":");
			List<Student> interns = it.getInternInManufacture(manufactureID);
			if(interns!= null) {
				for(Student std : interns) {
					System.out.println(std);
				}
			}
		}
	}
}
