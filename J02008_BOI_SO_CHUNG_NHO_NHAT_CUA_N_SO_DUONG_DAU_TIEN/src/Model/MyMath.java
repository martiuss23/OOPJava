package Model;

import java.util.Scanner;

public class MyMath {
	public static long LCM(long num1, long num2) {
		long mul = num1 * num2;
		return mul/MyMath.GCD(num1, num2);
	}
	
	public static long GCD(long num1, long num2) {
		long tmp;
		while(num1 > 0 && num2 > 0) {
			if(num1 < num2) {
				tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			num1 %= num2;
		}
		return Math.max(num1, num2);
	}
	
	public static void LCM_Of_First_N_Numbers(int n) {
		 long lcm = 1;
		 for(int i = 2; i <= n; i++) {
			 lcm = MyMath.LCM(lcm, i);
		 }
		 System.out.println(lcm);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int n;
		while(test-->0) {
			n = scanner.nextInt();
			MyMath.LCM_Of_First_N_Numbers(n);
		}
	}
	
}
