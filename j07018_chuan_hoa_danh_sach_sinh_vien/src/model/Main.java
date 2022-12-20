package model;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException  {
		Scanner fileIn = new Scanner(new File("SINHVIEN.in"));
		List<Student> students = new ArrayList<>();
		int nbOfStudents = Integer.parseInt(fileIn.nextLine());
		for(int i = 0; i < nbOfStudents; i++) {
			Scanner trim = new Scanner(fileIn.nextLine());
			String name = "";
			while(trim.hasNext()) {
				String token = trim.next();
				name += token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase() + " ";
			}
				
			students.add(new Student(name.trim(), fileIn.nextLine(), fileIn.nextLine(), Float.parseFloat(fileIn.nextLine())));
		}
		for(Student std : students)
				System.out.println(std);
	}
}
