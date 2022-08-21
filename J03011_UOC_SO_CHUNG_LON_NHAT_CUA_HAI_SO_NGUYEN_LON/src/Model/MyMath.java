package Model;

import java.util.Scanner;

public class MyMath {
	public static long GCD(long a, long b) {
		if(a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if(a == 0)
			return b;
		return GCD(b % a, a);
	}
	
	public static long GCD(long a, String b) {
		char[] arr = b.toCharArray();
		long mod = 0;
		for(Character chr : arr) {
			mod = (mod*10 + chr - '0') % a;
		}
		return GCD(a, mod);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			long a = scanner.nextLong();
			scanner.nextLine();
			String b = scanner.nextLine();
			System.out.println(MyMath.GCD(a, b));
		}
	}
}
