package Model;

import java.util.Scanner;

public class Number {
	private String number;

	public Number() {
		number = "";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void divideTwo() {
		char[] val = this.getNumber().toCharArray();
		StringBuffer result = new StringBuffer();
		boolean zero = true;
		for(Character item : val) {
			if(item == '0' || (item >= '8' && item <= '9')) {
				if(zero == false) {
					result.append('0');
				}
			}
			else if( item == '1') {
				result.append(item);
				zero = false;
			}
			else {
				zero = true;
				break;
			}
		}
		if(zero) {
			System.out.println("INVALID");
		}
		else
		System.out.println(result.toString());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		scanner.nextLine();
		String str;
		Number num = new Number();
		while(test > 0) {
			str = scanner.nextLine();
			num.setNumber(str);
			num.divideTwo();
			test--;
		}
		
	}
}
