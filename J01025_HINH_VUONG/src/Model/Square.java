package Model;

import java.util.Scanner;

public class Square {
	private int x;

	public Square(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void area() {
		System.out.println(this.getX() * this.getX());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x11, y11, x12, y12;
		int x21, y21, x22, y22;
		x11 = scanner.nextInt();
		y11 = scanner.nextInt();
		x12 = scanner.nextInt();
		y12 = scanner.nextInt();
		x21 = scanner.nextInt();
		y21 = scanner.nextInt();
		x22 = scanner.nextInt();
		y22 = scanner.nextInt();
		int xMax = Math.max(x11, Math.max(x12, Math.max(x21, x22)));
		int xMin = Math.min(x11, Math.min(x12, Math.min(x21, x22)));
		int yMax = Math.max(y11, Math.max(y12, Math.max(y21, y22)));
		int yMin = Math.min(y11, Math.min(y12, Math.min(y21, y22)));
		new Square(Math.max(xMax - xMin, yMax - yMin)).area();
	}
	
	
}
