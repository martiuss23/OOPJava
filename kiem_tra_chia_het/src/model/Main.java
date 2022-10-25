package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("SONGUYEN.IN"));
		int test = Integer.parseInt(scn.nextLine());
		BigInteger num13 = new BigInteger("13");
		BigInteger num7 = new BigInteger("7");
		while(test-->0) {
			BigInteger num = new BigInteger(scn.nextLine());
			if(num.mod(num7).equals(new BigInteger("0")) ) {
				if(num.mod(num13).equals(new BigInteger("0"))) {
					System.out.println("Both");
				}
				else {
					System.out.println("Div 7");
				}
			}
			else if(num.mod(num13).equals(new BigInteger("0"))) {
				System.out.println("Div 13");
			}
			else System.out.println("None");
		}
	}
}
