package model;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner fileIn = new Scanner(new File("KHACHHANG.in"));
		List<Customer> customers = new ArrayList<>();
		int nbOfCus = Integer.parseInt(fileIn.nextLine());
		for(int i = 1; i <= nbOfCus; i++) {
			Scanner trim = new Scanner(fileIn.nextLine());
			String name = "";
			while(trim.hasNext()) {
				String token = trim.next();
				name += token.substring(0, 1).toUpperCase() + token.substring(1).toLowerCase() + " ";
			}
			customers.add(new Customer(name.trim(), fileIn.nextLine(), fileIn.nextLine(), fileIn.nextLine()));
		}
		Collections.sort(customers);
		for(Customer cus: customers)
			System.out.println(cus);
	}
}
