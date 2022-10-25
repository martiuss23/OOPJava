package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int amount = Integer.parseInt(ip.nextLine());
		List<Product> pList = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			pList.add(new Product(ip.nextLine(), Long.parseLong(ip.nextLine()), Long.parseLong(ip.nextLine())));
		}
		Collections.sort(pList);;
		pList.forEach((product)->System.out.println(product));
	}
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//1000000000
//1240000