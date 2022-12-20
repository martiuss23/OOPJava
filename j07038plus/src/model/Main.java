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
		HashMap<String, Student> students = new HashMap<>();
		HashMap<String, Manufacture> manufactures = new HashMap<>();
		HashMap<String, Intern> interns = new HashMap<>();
		
		int nbOfStudents = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfStudents; i++) {
			Student std = new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
			students.put(std.getID(), std);
		}
		
		scn = new Scanner(new File("DN.in"));
		int nbOfManu = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfManu; i++) {
			Manufacture manufacture = new Manufacture(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
			manufactures.put(manufacture.getID(), manufacture);
		}
		
		scn = new Scanner(new File("THUCTAP.in"));
		int nbOfInterns = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfInterns; i++) {
			String studentID = scn.next();
			String manID = scn.nextLine().trim();
			if(interns.containsKey(manID)) {
				interns.get(manID).addStudent(students.get(studentID));
			}
			else {
				interns.put(manID, new Intern(manufactures.get(manID)));
				interns.get(manID).addStudent(students.get(studentID));
			}
		}
		int q = Integer.parseInt(scn.nextLine());
		while(q-- > 0) {
			String manufactureID = scn.nextLine();
			Intern it = interns.get(manufactureID);
			System.out.println(it);
		}
	}
}
