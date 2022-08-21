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
		if(charArray[0] != charArray[charArray.length - 1] || charArray[0] != '8') 
				return false;
		int sum = 16;
		for(int i = 1; i < charArray.length/2; i++) {
			if(charArray[i] != charArray[charArray.length - 1 - i]) 
					return false;
			sum += 2 *(charArray[i] - '0');
		}
		if(charArray.length % 2 != 0) {
			sum += (charArray[charArray.length/2] - '0');
		}
		return (sum % 10 == 0);
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
