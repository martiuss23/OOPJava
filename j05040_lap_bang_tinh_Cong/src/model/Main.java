package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = Integer.parseInt(scn.nextLine());
		List<Staff> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Staff(scn.nextLine(), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine()), scn.nextLine().trim()));
		}
		for(Staff staff : list) {
			System.out.println(staff);
		}
		
	}
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV