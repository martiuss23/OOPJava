package Model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			if(str1.equals(str2)) System.out.println(-1);
			else System.out.println(Math.max(str1.length(), str2.length()));
		}
	}
}
