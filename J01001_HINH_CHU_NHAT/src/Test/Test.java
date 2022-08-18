package Test;

import java.util.Scanner;

import Model.Rectangle;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height, weight;
		height = scanner.nextInt();
		weight = scanner.nextInt();
		Rectangle rectangle = new Rectangle(height, weight);
		rectangle.perimeterCal();
		rectangle.areaCal();
		System.out.println(rectangle.getPerimeter() + " " + rectangle.getArea());
	}
}
