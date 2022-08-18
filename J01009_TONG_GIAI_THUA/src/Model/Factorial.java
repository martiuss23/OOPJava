package Model;

import java.util.Scanner;

public class Factorial {
	private int n;
	private long result;
	

	public Factorial() {
		// TODO Auto-generated constructor stub
		n = 0;
		result = 0;
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


	public void sum() {
		long factorial_n = 1;
		for(int i = 1; i <= n; i++) {
			factorial_n *= i;
			result += factorial_n;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factorial fac = new Factorial();
		fac.setN(scanner.nextInt());
		fac.sum();
		System.out.println(fac.getResult());
	}

}


