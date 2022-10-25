package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		List<Student> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			list.add(new Student(scn.nextLine(), scn.nextInt(), scn.nextInt()));
		}
		Collections.sort(list);
		list.forEach((std)->System.out.println(std));
	}
	
}
//2
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600