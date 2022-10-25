package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = Integer.parseInt(scn.nextLine());
		List<Product> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Product(scn.nextLine(), scn.nextLine(), Long.parseLong(scn.nextLine()), Integer.parseInt(scn.nextLine())));
		}
		Collections.sort(list);
		list.forEach((product)->System.out.println(product));
	}
}
//3
//Kaki 2
//K1252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12