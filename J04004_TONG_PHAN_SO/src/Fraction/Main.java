package Fraction;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num1, num2, den1, den2;
		num1 =scanner.nextLong();
		den1 = scanner.nextLong();
		num2 = scanner.nextLong();
		den2 = scanner.nextLong();
		Fraction result = Fraction.sum(new Fraction(num1, den1), new Fraction(num2, den2));
		System.out.println(result.getNumerartor() + "/" + result.getDenominator());
	}
}
