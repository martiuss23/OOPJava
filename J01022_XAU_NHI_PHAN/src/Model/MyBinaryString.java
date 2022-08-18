package Model;

import java.util.Scanner;

public class MyBinaryString {
	private long[] fibo;
	
	public MyBinaryString() {
		fibo = new long[93];
		fibo[0] = 1;
		fibo[1] = 1;
		for(int i = 2; i < 93; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
	}
	
	public char charAt(int n, long k) {
		if(n == 0) return '0';
		else if(n == 1) return '1';
		
		if(k <= fibo[n-2]) {
			return charAt(n - 2, k);
		}
		return charAt(n-1, k - fibo[n-2]);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyBinaryString myBinaryString = new MyBinaryString();
		int n;
		long k;
		while(test-->0) {
			n = scanner.nextInt();
			k = scanner.nextLong();
			System.out.println(myBinaryString.charAt(n, k));
		}
	}
}
