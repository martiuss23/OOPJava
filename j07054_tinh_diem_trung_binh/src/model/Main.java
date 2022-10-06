package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student> list = new ArrayList<>();
		Scanner scn = new Scanner(new File("BANGDIEM.in"));
		int amount = scn.nextInt();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			list.add(new Student(String.format("%02d", i), scn.nextLine(), scn.nextInt(), scn.nextInt(), scn.nextInt()));
		}
		Collections.sort(list);
		int rank = 1;
		double gpa = list.get(0).getAverage();
		for(int i = 1; i <= amount; i++ ) {
			if(list.get(i-1).getAverage() < gpa) {
				rank = i;
				gpa = list.get(i-1).getAverage();
			}
			System.out.println(list.get(i-1) + " " + rank);
		}
	}
}
