package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("MONHOC.in"));
		List<Course> list = new ArrayList<>();
		int amount = Integer.parseInt(fileIn.nextLine());
		for(int i = 1; i <= amount; i++) {
			list.add(new Course(fileIn.nextLine(), fileIn.nextLine(), Integer.parseInt(fileIn.nextLine()), fileIn.nextLine(), fileIn.nextLine()));
		}
		Collections.sort(list);
		list.forEach((course)->{
			// have online practice form
			if(course.getPracticeForm() == 1) {
				System.out.println(course);
			}
		});
	}
}
