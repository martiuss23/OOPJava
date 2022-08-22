package Model;

import java.util.Scanner;

public class MyNumber {
	private String val;


	public String getVal() {
		return val;
	}


	public void setVal(String val) {
		this.val = val;
	}
	
	public String isAdvNumber() {
		int ev = 0, odd = 0;
		for(char chr : val.toCharArray()) {
			if(Character.isDigit(chr)) {
				if((chr - '0') % 2 == 0)
					ev++;
				else
					odd++;
			}
			else return "INVALID";
		}
		if(val.length() % 2 == 0) {
			return (ev > odd)?"YES":"NO";
		}
		return (odd > ev)?"YES":"NO";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyNumber myNumber = new MyNumber();
		while(test-- > 0) {
			String s = scanner.next();
			myNumber.setVal(s);
			System.out.println(myNumber.isAdvNumber());
		}
	}
}
