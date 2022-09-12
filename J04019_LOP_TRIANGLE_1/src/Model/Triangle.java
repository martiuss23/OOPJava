package Model;


public class Triangle {
	private Point firstPoint;
	private Point secondPoint;
	private Point thirdPoint;
	private float edg1;
	private float edg2;
	private float edg3;
	
	public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = thirdPoint;
		this.calcEdg();
	}
	
	private void calcEdg() {
		edg1 = this.firstPoint.distance(secondPoint);
		edg2 = this.firstPoint.distance(thirdPoint);
		edg3 = this.secondPoint.distance(thirdPoint);
	}
	
	public boolean valid() {
		if(edg1 + edg2 > edg3 && edg1 + edg3 > edg2 && edg2 + edg3 > edg1) {
			return true;
		}
		return false;
	}
	
	
	public String getPerimeter() {
		return String.format("%.3f", edg1 + edg2 + edg3);
	}
	
}
