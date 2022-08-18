package Model;

import java.util.Scanner;

public class MyMath {
	public static final int MOD = (int) (1e9+7);
	public static long pow(long a, long b) {
		if(b == 0 ) return 1;
		long rs = pow(a, b/2);
		if(b % 2 == 0) return ((rs % MOD)*rs)% MOD;
		return (((rs * a) % MOD)*rs)%MOD;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a, b;
		while(true) {
			a = scanner.nextLong();
			b = scanner.nextLong();
			if(a == 0 && b == 0) return;
			System.out.println(MyMath.pow(a, b));
		}
	}
}
