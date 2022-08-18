package Model;

import java.util.Scanner;

public class Triangle {
	private int height;
	private int n;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	
	public Triangle(int n, int height) {
		this.height = height;
		this.n = n;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	public void divideTriangle() {
		int n = this.getN();
		int height = this.getHeight();
		for(int i = 1; i <= n - 1; i++) {
			System.out.printf("%.6f", (double)height*Math.sqrt((double)i/n));
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int testCase, n, height;
		Scanner scanner = new Scanner(System.in);
		testCase = scanner.nextInt();
		Triangle triangle = new Triangle();
		while(testCase > 0) {
			n = scanner.nextInt();
			height = scanner.nextInt();
			triangle.setN(n);
			triangle.setHeight(height);
			triangle.divideTriangle();
			testCase--;
		}
	}
}
