package Model;

import java.util.Scanner;

public class MyNumber {
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean isBeautyfulNumber() {
		char[] charArray = number.toCharArray();
		for(int i = 0; i < charArray.length/2; i++) {
			if((charArray[i] - '0') % 2 != 0 || charArray[i] != charArray[charArray.length - 1 - i]) 
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyNumber myNumber = new MyNumber();
		scanner.nextLine();
		while(test-->0) {
			String str = scanner.nextLine();
			myNumber.setNumber(str);
			System.out.println(myNumber.isBeautyfulNumber()?"YES":"NO");
		}
	}
}
