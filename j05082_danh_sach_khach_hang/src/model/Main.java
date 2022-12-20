package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static String standardName(String name) {
		StringTokenizer token = new StringTokenizer(name.toLowerCase());
		String newName = "";
		while(token.hasMoreTokens()) {
			String tk = token.nextToken();
			newName += tk.substring(0, 1).toUpperCase() + tk.substring(1) + " ";
		}
		return newName.trim();
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		int nbCus = Integer.parseInt(scn.nextLine());
		List<Customer> customers = new ArrayList<>();
		for(int i = 0; i < nbCus; i++) {
			customers.add(new Customer(standardName(scn.nextLine()), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		Collections.sort(customers);
		for(Customer cus : customers)
			System.out.println(cus);
	}
}

