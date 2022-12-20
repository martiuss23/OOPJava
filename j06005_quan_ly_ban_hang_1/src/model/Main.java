package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		HashMap<String, Customer> customers = new HashMap<>();
		HashMap<String, Product> products = new HashMap<>();
		List<Bill> bills = new ArrayList<>();
		
		
		int nbOfCus = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < nbOfCus; i++) {
			Customer cus = new Customer(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
			customers.put(cus.getId(), cus);
		}
		int nbOfProduct = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < nbOfProduct; i++) {
			Product product = new Product(scn.nextLine(),scn.nextLine(), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine()));
			products.put(product.getId(), product);
		}
		
		int nbOfBills = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < nbOfBills; i++) {
			bills.add(new Bill(customers.get(scn.next()), products.get(scn.next()), Integer.parseInt(scn.next())));
		}
		for(Bill bill : bills)
			System.out.println(bill);
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
