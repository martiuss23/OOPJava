package Model;

import java.util.Scanner;

public class Rectangle {
	private int height;
	private int weight;
	private int perimeter;
	private int area;
	
	public Rectangle() {
		height = 0;
		weight = 0;
		perimeter = 0;
		area = 0;
	}
	
	public Rectangle(int height, int weight) {
		this.height = height;
		this.weight = weight;
		perimeter = 0;
		area = 0;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	
	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void perimeterCal() {
		perimeter = 2 * (height + weight);
	}
	
	public void areaCal() {
		area = height * weight;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height, weight;
		height = scanner.nextInt();
		weight = scanner.nextInt();
		if(height > 0 && weight > 0) {
			Rectangle rectangle = new Rectangle(height, weight);
			rectangle.perimeterCal();
			rectangle.areaCal();
			System.out.println(rectangle.getPerimeter() + " " + rectangle.getArea());
		}
		else System.out.println("0");
	}
	
}
