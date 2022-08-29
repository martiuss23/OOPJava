package Fraction;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		long nume = scanner.nextLong();
		long denom = scanner.nextLong();
		Fraction frac = new Fraction(nume, denom);
		frac.shortenFraction();
		System.out.println(frac.getNumerartor() + "/" + frac.getDenominator());
	}
}
