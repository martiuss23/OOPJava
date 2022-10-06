package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("KHACHHANG.in"));
		ArrayList<ElectricBill> list = new ArrayList<>();
		int amount = scn.nextInt();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			list.add(new ElectricBill(String.format("%02d", i), scn.nextLine(), scn.next(), scn.nextInt(), scn.nextInt()));
		}
		Collections.sort(list);
		list.forEach((bill)->System.out.println(bill));
	}
}
