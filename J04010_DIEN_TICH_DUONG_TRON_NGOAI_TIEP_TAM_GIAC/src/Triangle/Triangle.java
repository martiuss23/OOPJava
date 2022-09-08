package Triangle;

import java.math.BigDecimal;

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
	
	public double area() {
		return Math.sqrt((edg1 + edg2 + edg3)*(edg1 + edg2 - edg3)*(edg1 -edg2 + edg3 ) *(-edg1 + edg2 + edg3))/4;
	}
	
	public double areaOfCircumcircle() {
		double R = (edg1 * edg2 * edg3/(4*this.area()));
		return Math.PI * R * R;
	}
}
