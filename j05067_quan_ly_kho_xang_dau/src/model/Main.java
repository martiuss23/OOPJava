package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		List<Bill> bills = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			bills.add(new Bill(scn.next(), scn.nextInt()));
		}
		for(Bill bill : bills) {
			System.out.println(bill);
		}
	}
}
//3
//N89TN 4500
//D00BP 3500
//X92SH 2600