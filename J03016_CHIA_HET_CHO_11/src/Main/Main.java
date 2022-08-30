package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			String s1 = scn.next();
			BigInteger num1 = new BigInteger(s1);
			if(num1.mod(new BigInteger("11")).equals(new BigInteger("0"))){
				System.out.println(1);
			}
			else System.out.println(0);
		}
	}
}
