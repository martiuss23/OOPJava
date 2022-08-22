package Model;

import java.util.Scanner;

public class MyString {
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	public boolean checkOutCreativePalindrome() {
		int cnt = 0;
		int len = val.length();
		for(int i = 0; i < len/ 2; i++) {
			if(val.charAt(i) != val.charAt(len - 1- i)) {
				cnt++;
			}
			if(cnt > 1) return false;
		}
		if(len % 2 == 0 && cnt == 0) return false;
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyString myString = new MyString();
		while(test-- > 0) {
			String val = scanner.next();
			myString.setVal(val);
			System.out.println(myString.checkOutCreativePalindrome()?"YES":"NO");
		}
	}
	
}
