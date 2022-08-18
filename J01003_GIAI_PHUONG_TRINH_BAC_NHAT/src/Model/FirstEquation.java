package Model;

import java.util.Scanner;

public class FirstEquation {
	private float a;
	private float b;
	private float result;
	
	public FirstEquation() {
		a = 0;
		b = 0;
		result = 0;
	}
	
	public FirstEquation(float a, float b) {
		this.a = a;
		this.b = b;
		result = 0;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	public void solve() {
		if(a == 0) {
			if(b == 0) {
				System.out.println("VSN");
			}
			else {
				System.out.println("VN");
			}
		}
		else {
			result = -b/a;
			System.out.printf("%.2f", result);
		}
	}
	
	public static void main(String[] args) {
		float a, b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		new FirstEquation(a, b).solve();
	}
	
}
