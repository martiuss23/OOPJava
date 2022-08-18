package Model;

import java.util.Scanner;

public class Ternary {
	private String val;
	
	
	
	public String getVal() {
		return val;
	}



	public void setVal(String val) {
		this.val = val;
	}



	public boolean  isTernary() {
		char[] charArray = this.getVal().toCharArray();
		for(Character item : charArray) {
			if(item != '0' && item != '1' && item != '2') return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ternary ternary = new Ternary();
		String str;
		int test = scanner.nextInt();
		scanner.nextLine();
		while(test-->0) {
			str = scanner.nextLine();
			ternary.setVal(str);
			System.out.println(ternary.isTernary()?"YES":"NO");
		}
	}
}
