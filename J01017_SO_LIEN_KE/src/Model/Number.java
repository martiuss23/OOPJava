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
	
	public boolean checkMoreOrLessOne() {
		char[] charArray = this.getVal().toCharArray();
		for(int i = 1; i < charArray.length; i++) {
			if(Math.abs(charArray[i] - charArray[i-1]) !=1 ) {
				return false;
			}
		}
		return true;
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
			System.out.println(number.checkMoreOrLessOne()?"YES":"NO");
		}
	}
	
}
