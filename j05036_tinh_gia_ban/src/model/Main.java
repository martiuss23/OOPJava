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
		ls.forEach((product)->System.out.println(product));
		
	}
}
