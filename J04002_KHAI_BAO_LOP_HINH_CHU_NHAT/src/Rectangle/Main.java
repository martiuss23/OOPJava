package Rectangle;

import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height, width;
		String color;
		height = scanner.nextDouble();
		width = scanner.nextDouble();
		color = scanner.next();
		if(height > 0 && width > 0) {
			Rectangle rec = new Rectangle(width, height, color);
			System.out.printf("%.0f %.0f %s\n",(rec.findPerimeter()), rec.findArea(), rec.getColor());
			
		}
		else {
			System.out.println("INVALID");
		}
	}
}
