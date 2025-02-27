package Shape;

abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		return "shape with color: " + color + ", " + (filled? "filled" : "not filled");
	}
}
