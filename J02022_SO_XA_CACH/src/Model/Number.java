package Model;

import java.util.Scanner;

public class Number {
	
	public static void backTrack(char n, int[] check, StringBuffer str) {
		for(char j = '1'; j <= n; j++) {
			if(check[(int)(j - '0')] == 0) {
				if(str.length() != 0 && Math.abs((j - str.charAt(str.length() - 1))) == 1) continue;
				check[(int)(j - '0')] = 1;
				str.append(j);
				if(str.length() == (n - '0')) {
					System.out.println(str.toString());
				}
				else backTrack(n, check, str);
				check[(int)(j - '0')] = 0;
				str.deleteCharAt(str.length() - 1);
			}
		}
	}
	
	public static void showDisNumber(int n) {
		backTrack((char)(n + '0'), new int[n + 1] , new StringBuffer());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			int n = scanner.nextInt();
			Number.showDisNumber(n);
		}
	}
}
