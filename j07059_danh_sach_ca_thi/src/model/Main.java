package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner fileInput = new Scanner(new File("CATHI.in"));
		int amount = Integer.parseInt(fileInput.nextLine());
		ArrayList<TestSchedule> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new TestSchedule(String.format("%03d", i), fileInput.next(), fileInput.next(), fileInput.next()));
		}
		Collections.sort(list);
		list.forEach((ts)->System.out.println(ts));
	}
}
