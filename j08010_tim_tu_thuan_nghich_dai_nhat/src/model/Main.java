package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PalindromeCounter counter = new PalindromeCounter();
		while(scn.hasNext()) {
			String word = scn.next();
			if(PalindromeCounter.isPalindrome(word)) {
				counter.add(word);
			}
		}
		System.out.print(counter.getPalindromesMaxLength());
	}
}
