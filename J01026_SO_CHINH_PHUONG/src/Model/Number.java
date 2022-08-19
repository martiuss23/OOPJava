package Model;

import java.util.Scanner;

public class Number {
	
	
	public static boolean isPefectSquare(int nb) {
		int sqr = (int) Math.sqrt(nb);
		return (sqr * sqr == nb);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int num;
		while(test-->0) {
			num = scanner.nextInt();
			System.out.println( Number.isPefectSquare(num)?"YES":"NO");
		}
	}
}
