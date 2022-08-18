package Model;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(int[] arr) {
		int sz = arr.length;
		for(int i = 0; i < sz/2; i++) {
			if(arr[i] != arr[sz - i - 1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int sz;
		while(test-->0) {
			sz = scanner.nextInt();
			int[] arr = new int[sz];
			for(int i = 0; i < sz; i++)
				arr[i] = scanner.nextInt();
			System.out.println(Palindrome.isPalindrome(arr)?"YES":"NO");
		}
	}
	
}
