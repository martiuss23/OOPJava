package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		HashMap<String, Customer> customerMap = new HashMap<>();
		HashMap<String, Product> productMap = new HashMap<>();
		List<Invoice> invoices = new ArrayList<>();
		
		int nbOfCus = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfCus; i++) {
			Customer cus = new Customer(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
			customerMap.put(cus.getID(), cus);
		}
		
		int nbOfProducts = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfProducts; i++) {
			Product product = new Product(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine()));
			productMap.put(product.getID(), product);
		}
		
		int nbOfInvoices = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfInvoices; i++) {
			invoices.add(new Invoice(customerMap.get(scn.next()), productMap.get(scn.next()), Integer.parseInt(scn.nextLine().trim())));
		}
		
		Collections.sort(invoices, new Comparator<Invoice>() {

			@Override
			public int compare(Invoice o1, Invoice o2) {
				if(o1.getProfit() > o2.getProfit()) return -1;
				return 1;
			}
		});
		
		for(Invoice invoice: invoices)
			System.out.println(invoice);
	}
}

//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4
