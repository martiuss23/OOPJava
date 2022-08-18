package Model;

import java.util.Scanner;

public class Number {
	public static void countDivisor(int num) {
		int cnt = 0;
		int sqrt = (int)Math.sqrt(num);
		for(int i = 1; i <= sqrt; i++) {
			if(num%i == 0) {
				if(i%2 == 0) 
					cnt++;
				if((num/i) % 2 == 0)
					cnt++;
			}
		}
		if(sqrt * sqrt == num && cnt > 0) {
			cnt--;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt(), val;
		while(test > 0) {
			val = scanner.nextInt();
			Number.countDivisor(val);
			test--;
		}
	}
	
}
