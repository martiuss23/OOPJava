package Model;

import java.util.Scanner;

public class Number {
	private String val;
	
	public Number() {
		
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	private boolean checkMoreLessTwo() {
		char[] charArray = this.getVal().toCharArray();
		for(int i = 1; i < charArray.length; i++) {
			if(Math.abs(charArray[i] - charArray[i-1]) != 2 ) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkDivisible() {
		char[] charArray = this.getVal().toCharArray();
		int sum = 0;
		for(int i = 0; i < charArray.length; i++) {
			sum += (charArray[i] - '0');
		}
		return (sum%10==0);
	}
	
	public boolean checkBoth() {
		return (this.checkDivisible() && this.checkMoreLessTwo());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		Number number = new Number();
		String num;
		scanner.nextLine();
		while(test-->0) {
			num = scanner.nextLine();
			number.setVal(num);
			System.out.println(number.checkBoth()?"YES":"NO");
		}
	}
	
}
