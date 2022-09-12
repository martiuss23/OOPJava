package Model;

import java.util.Scanner;

public class Point{
	private float x;
	private float y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public static Point nextPoint(Scanner scn) {
		return new Point(scn.nextFloat(), scn.nextFloat());
	}
	
	public float distance(Point point2) {
		float px = this.x - point2.x;
		float py = this.y - point2.y;
		return (float) Math.sqrt(px*px + py*py);
	}

	
	
}
