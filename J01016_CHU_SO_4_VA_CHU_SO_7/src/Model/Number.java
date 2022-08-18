package Model;

import java.util.Scanner;

public class Number {
	private long val;
	
	public Number() {
		
	}

	public long getVal() {
		return val;
	}

	public void setVal(long val) {
		this.val = val;
	}
	
	public boolean checkFourOrSeven() {
		long num = this.getVal();
		int cnt = 0;
		while(num > 0) {
			int divisor = (int) (num % 10);
			num/=10;
			if(divisor == 4 || divisor == 7) {
				cnt ++;
			}
		}
		return (cnt == 4 || cnt == 7);
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		Number number = new Number();
		number.setVal(num);
		System.out.println(number.checkFourOrSeven()?"YES":"NO");
	}
}
