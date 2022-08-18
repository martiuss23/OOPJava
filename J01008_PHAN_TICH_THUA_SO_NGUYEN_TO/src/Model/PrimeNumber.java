package Model;

import java.util.Scanner;

public class PrimeNumber {
	private int val;

	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public void analys() {
		int num = val;
		int cnt = 0;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			cnt = 0;
			while(num % i == 0) {
				num/=i;
				cnt++;
			}
			if(cnt > 0) {
				System.out.print(i + "(" + cnt + ") " );
			}
		}
		if(num > 1) {
			System.out.print(num + "(1) " );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test, num;
		test = scanner.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		for(int i = 1; i <= test; i++) {
			num = scanner.nextInt();
			primeNumber.setVal(num);
			System.out.print("Test " + i + ": ");
			primeNumber.analys();
		}
	}
	
}
