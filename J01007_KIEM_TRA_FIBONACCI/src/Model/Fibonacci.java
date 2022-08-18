package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Fibonacci {
	private HashSet<Long> fibos;
	
	public Fibonacci() {
		// TODO Auto-generated constructor stub
		fibos = new HashSet<Long>();
		long fn_1 = 0, fn = 1;
		long tmp;
		fibos.add((long) 0);
		for(int i = 2; i <= 92; i++) {
			tmp = fn;
			fn += fn_1;
			fn_1 = tmp;
			fibos.add(fn);
		}
		//fibos.forEach((item)->System.out.println(item));
	}
	
	public boolean isFibo(long num) {
		return fibos.contains(num);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test;
		long n;
		test = scanner.nextInt();
		Fibonacci fibonacci = new Fibonacci();
		while(test > 0) {
			n = scanner.nextLong();
			System.out.println(fibonacci.isFibo(n)?"YES":"NO");
			test--;
		}
	}
}
