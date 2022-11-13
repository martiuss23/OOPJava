package model;

import java.util.List;
import java.util.Scanner;

import model.ProductManagement.InnerProduct;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ProductManagement productMng = new ProductManagement();
		int numberOfProduct = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= numberOfProduct; i++) {
			productMng.addProduct(new Product(scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		
		int numberOfBills = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= numberOfBills; i++) {
			productMng.addBill(scn.next(), scn.nextInt(), scn.nextInt(), scn.nextInt());
		}
		
		List<InnerProduct> listBills = productMng.getAllBills();
		listBills.forEach((bill)->{
			System.out.println(bill);
		});
	}
}
//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500