package Model;

import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-- > 0) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			BigInteger num1 = new BigInteger(s1);
			BigInteger num2 = new BigInteger(s2);
			BigInteger zero = new BigInteger("0");
			System.out.println((num1.mod(num2).equals(zero)|| num2.mod(num1).equals(zero))?"YES":"NO");
		}
	}
	
}
