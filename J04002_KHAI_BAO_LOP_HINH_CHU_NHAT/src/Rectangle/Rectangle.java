
package Rectangle;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
	}

	public Rectangle(double width, double height, String color) {
		if(width > 0 && height > 0) {
			this.width = width;
			this.height = height;
			this.color = "";
			for(int i = 0; i < color.length(); i++) {
				if(i == 0) {
					this.color += Character.toUpperCase(color.charAt(i));
				}
				else {
					this.color += Character.toLowerCase(color.charAt(i));
				}
			}
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double findArea() {
		return this.getHeight() * this.getWidth();
	}
	
	public double findPerimeter() {
		return (this.getWidth() + this.getHeight())*2;
	}
	
	
	
}
