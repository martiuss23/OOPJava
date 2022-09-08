package Triangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-- > 0) {
			MyPoint p1, p2, p3;
			double x1, y1, x2, y2, x3, y3;
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
			x3 = scanner.nextDouble();
			y3 = scanner.nextDouble();
			p1 = new MyPoint(x1, y1);
			p2 = new MyPoint(x2, y2);
			p3 = new MyPoint(x3, y3); 
			double e1, e2, e3;
			e1 = MyPoint.distance(p1, p2);
			e2 = MyPoint.distance(p2, p3);
			e3 = MyPoint.distance(p1, p3);
			if(e1 + e2 > e3 && e1 + e3 > e2 && e2 + e3 > e1 ) {
				Triangle triangle = new Triangle(e1, e2, e3);
				System.out.printf("%.2f\n", triangle.area());
			}
			else {
				System.out.println("INVALID");
			}
		}
	}
}
