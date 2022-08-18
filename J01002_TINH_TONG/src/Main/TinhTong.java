package Main;

import java.util.Scanner;

public class TinhTong {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test;
		int value;
		test = scanner.nextInt();
		while(test > 0) {
			value = scanner.nextInt();
			System.out.println((long) value * (value + 1) / 2);
			test--;
		}
		
	}
}
