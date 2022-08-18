package Model;

import java.util.Scanner;

public class PrimeNumber {
	private int val;

	
	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}


	public PrimeNumber(int val) {
		this.val = val;
	}


	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}
	
	public boolean checkPrimes() {
		int number = this.getVal();
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase, number;
		testCase = scanner.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		while(testCase > 0) {
			number = scanner.nextInt();
			primeNumber.setVal(number);
			System.out.println(primeNumber.checkPrimes()?"YES":"NO");
			testCase--;
		}
	}
}
