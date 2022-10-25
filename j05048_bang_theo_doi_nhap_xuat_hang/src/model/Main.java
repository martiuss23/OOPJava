package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Goods> list = new ArrayList<>();
		int amount = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= amount; i++) {
			list.add(new Goods(scn.nextLine(), Integer.parseInt(scn.nextLine())));
		}
		list.forEach((goods)->System.out.println(goods));
	}
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582