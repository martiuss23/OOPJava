package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileInput = new Scanner(new File("THISINH.in"));
		int amount = Integer.parseInt(fileInput.nextLine());
		List<Examinee> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Examinee(fileInput.nextLine(), Double.parseDouble(fileInput.nextLine()), fileInput.nextLine(), Integer.parseInt(fileInput.nextLine())));
		}
		Collections.sort(list);
		list.forEach((examinee)->System.out.println(examinee));
	}
}
