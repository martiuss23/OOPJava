package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test -- > 0) {
			int sz = Integer.parseInt(scn.nextLine());
			String op = scn.nextLine();
			Calculator cl = new Calculator(op);
			System.out.println(cl.calculate());
		}
	}
}
//3
//7
//2 3 1 * + 9 –
//7
//8 7 5 * + 9 –
//3
//-10 -4 +
