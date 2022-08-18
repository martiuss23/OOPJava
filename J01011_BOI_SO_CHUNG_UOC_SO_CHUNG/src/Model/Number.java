package Model;

import java.util.Scanner;

public class Number {
	
	public static void euclid(long num1, long num2) {
		long greatestDivisor = Number.calcGreatestDivisor(num1, num2);
		System.out.println((num1/greatestDivisor)*num2 + " " + greatestDivisor);
	}
	
	private static long calcGreatestDivisor(long num1, long num2) {
		Long tmp;
		while(num1 > 0 && num2 > 0) {
			if(num1 < num2) {
				num2 %= num1;
			}
			else
			num1 %= num2;			
		}
		return Math.max(num1, num2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		long num1, num2;
		while(test > 0) {
			num1 = scanner.nextLong();
			num2 = scanner.nextLong();
			Number.euclid(num1, num2);
			test--;
		}
	}
}
