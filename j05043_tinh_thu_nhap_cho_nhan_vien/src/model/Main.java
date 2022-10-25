package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = Integer.parseInt(input.nextLine());
		List<Staff> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Staff(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine()), Integer.parseInt(input.nextLine())));
		}
		list.forEach((staff)->System.out.println(staff));
	}
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28