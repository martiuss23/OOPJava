package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-- > 0) {
			double x1, y1, x2, y2;
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
			System.out.printf("%.4f", MyPoint.distance(new MyPoint(x1, y1), new MyPoint(x2, y2)));
			System.out.println();
		}
	}
}
