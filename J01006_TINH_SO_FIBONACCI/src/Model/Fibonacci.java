package Model;

import java.util.Scanner;

public class Fibonacci {
	private int n;
	private long result;
	
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public Fibonacci(int n) {
		this.n = n;
		result = 1;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}

	public void calcFibo() {
		int num = this.getN();
		if(num == 1 || num == 2) {
			this.setResult(1);
		}
		else {
			long fn_1 = 0, fn = 1, tmp;
			for(int i = 2; i <= num; i++) {
				tmp = fn;
				fn += fn_1;
				fn_1 = tmp;
			}
			this.setResult(fn);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test, n;
		test = scanner.nextInt();
		Fibonacci fibonacci = new Fibonacci();
		while(test > 0) {
			n = scanner.nextInt();
			fibonacci.setN(n);
			fibonacci.calcFibo();
			System.out.println(fibonacci.getResult());
			test--;
		}
	}
}
