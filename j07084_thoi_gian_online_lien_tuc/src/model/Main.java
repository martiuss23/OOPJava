package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner fileInput = new Scanner(new File("ONLINE.in"));
		int amount =  Integer.parseInt(fileInput.nextLine());
		List<Student> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Student(fileInput.nextLine(), fileInput.nextLine(), fileInput.nextLine()));
		}
		Collections.sort(list);
		list.forEach((student)->System.out.println(student));
	}
}
