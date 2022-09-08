package Triangle;

public class MyPoint {
	private double x;
	private double y;
	 
	
	public MyPoint() {
		// TODO Auto-generated constructor stub
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
	
	public double distance(MyPoint secondPoint) {
		return Math.sqrt((this.getX() - secondPoint.getX())*(this.getX() - secondPoint.getX()) + (this.getY() - secondPoint.getY())*(this.getY()-secondPoint.getY()));
	}
	
	public static double distance(MyPoint p1, MyPoint p2) {
		return p1.distance(p2);
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}
}
