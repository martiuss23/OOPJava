package Model;

import java.util.Scanner;

public class CellPhone {
	public final static int[] table ={2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9 ,9};

	public static boolean isPalindrome(String str) {
		int len = str.length();
		for(int i = 0; i < len/2; i++) {
			if(table[(int)(Character.toUpperCase(str.charAt(i)) -'A')] != 
					table[(int)(Character.toUpperCase(str.charAt(len - 1- i)) -'A')]) 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			String str = scanner.next();
			System.out.println(CellPhone.isPalindrome(str)?"YES":"NO");
		}
	}
}
