package Main;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	private double distance(MyPoint secondPoint) {
		return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
	}
	
	public static double distance(MyPoint p1, MyPoint p2) {
		return p1.distance(p2);
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	
}
