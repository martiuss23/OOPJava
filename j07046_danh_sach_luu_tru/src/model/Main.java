package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner scn = new Scanner(new File("KHACH.in"));
		int amount = Integer.parseInt(scn.nextLine());
		ArrayList<Customer> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Customer(String.format("%02d", i), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		Collections.sort(list);
		list.forEach((customer)->System.out.println(customer));
	}
}
