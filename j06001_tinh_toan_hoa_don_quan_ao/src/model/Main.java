package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Table tb = new Table();
		Scanner scn = new Scanner(System.in);
		int totalOfProduct = scn.nextInt();
		for(int i = 1; i <= totalOfProduct; i++) {
			scn.nextLine();
			tb.addProduct(new Product(scn.nextLine(), scn.nextLine(), scn.nextInt(), scn.nextInt() ));
		}
		int totalOfReceipt = scn.nextInt();
		scn.nextLine();
		for(int i = 1; i <= totalOfReceipt; i++) {
			Scanner ip = new Scanner(scn.nextLine());
			tb.addReceipt(ip.next() + String.format("-%03d", i), ip.nextInt());
		}
		System.out.println(tb);
	}
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105