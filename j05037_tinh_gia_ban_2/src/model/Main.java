package model;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = Integer.parseInt(scn.nextLine());
		ArrayList<Product> ls = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			ls.add(new Product(scn.nextLine(), scn.nextLine(), Double.parseDouble(scn.nextLine()), Integer.parseInt(scn.nextLine())));
		}
		Collections.sort(ls);
		ls.forEach((product)->System.out.println(product));
		
	}
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430