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
		long total = 0;
		for(Staff staff : list) {
			System.out.println(staff);
			total += staff.getTotal();
		}
		System.out.println("Tong chi phi tien luong: " + total);
		
	}
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV