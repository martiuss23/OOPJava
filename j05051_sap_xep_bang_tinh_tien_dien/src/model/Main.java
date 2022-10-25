package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(System.in);
		ArrayList<ElectricBill> list = new ArrayList<>();
		int amount = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= amount; i++) {
			list.add(new ElectricBill(scn.nextLine().trim(), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine())));
		}
		Collections.sort(list);
		list.forEach((bill)->System.out.println(bill));
	}
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700