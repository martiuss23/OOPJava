package Triangle;

public class Triangle {
	private double edg1, edg2, edg3;
	
	public Triangle( double edg1, double edg2, double edg3) {
		this.edg1 = edg1;
		this.edg2 = edg2;
		this.edg3 = edg3;
	}
	
	public double perimeter() {
		return edg1 + edg2 + edg3;
	}
	
}
