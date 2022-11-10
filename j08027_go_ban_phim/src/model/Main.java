package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String res = KeyBoard.decode(scn.nextLine());
		System.out.println(res);
	}
}
