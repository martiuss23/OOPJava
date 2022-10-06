package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("SINHVIEN.in"));
		int amount = Integer.parseInt(scn.nextLine());
		List<Student> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		Collections.sort(list);
		list.forEach((student)->System.out.println(student));
		
	}
}
