package Model;

import java.util.Scanner;

public class Number {
	private long value;
	
	public Number() {
		
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public void greatestPrimeDivisor() {
		long primeDivisor = 0;
		long number = this.getValue();
		while(number%2 == 0) {
			primeDivisor = 2;
			number/=2;
		}
		for(int i = 3; i <= Math.sqrt(number); i+= 2) {
			while(number % i == 0) {
				number /= i;
				primeDivisor = Math.max(i, primeDivisor);
			}
		}
		primeDivisor = Math.max(primeDivisor, number);
		System.out.println(primeDivisor);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		long num;
		Number number = new Number();
		while(test-->0) {
			num = scanner.nextLong();
			number.setValue(num);
			number.greatestPrimeDivisor();
		}
	}
}
