package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			Complex firstComplex = new Complex(scn.nextInt(), scn.nextInt());
			Complex secondComplex = new Complex(scn.nextInt(), scn.nextInt());
			Complex sum = Complex.sum(firstComplex, secondComplex);
			System.out.println(Complex.mul(sum, firstComplex) + ", " + Complex.mul(sum, sum));
			
		}
	}
}
