package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int firstNumerator, secondNumerator;
			int firstDenominator, secondDenominator;
			firstNumerator= scn.nextInt();
			firstDenominator = scn.nextInt();
			secondNumerator = scn.nextInt();
			secondDenominator = scn.nextInt();
			Fraction firstFrac = new Fraction(firstNumerator, firstDenominator);
			Fraction secondFrac = new Fraction(secondNumerator, secondDenominator);
			Fraction firstResult = Fraction.squareOfSum(firstFrac, secondFrac);
			firstResult.reduce();
			Fraction secondResult = Fraction.mulOf(firstFrac, secondFrac, firstResult);
			secondResult.reduce();
			System.out.println(firstResult + " " + secondResult);
			
		}
	}
}
