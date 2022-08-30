package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			String s1 = scn.next();
			String s2 = scn.next();
			BigInteger num1 = new BigInteger(s1);
			BigInteger num2 = new BigInteger(s2);
			System.out.println(num1.add(num2));
		}
	}
}
