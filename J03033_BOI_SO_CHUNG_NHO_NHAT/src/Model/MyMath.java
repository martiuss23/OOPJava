package Model;
import java.math.BigInteger;
import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			BigInteger num1 = scanner.nextBigInteger();
			BigInteger num2 = scanner.nextBigInteger();
			BigInteger res = num1.gcd(num2);
			res = num1.multiply(num2).divide(res);
			System.out.println(res);
		}
	}
	
	
	
}
