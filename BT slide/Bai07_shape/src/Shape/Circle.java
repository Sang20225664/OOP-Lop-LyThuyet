package Shape;

public class Circle extends Shape{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	public Circle(double r, String color, boolean filled) {
		super();
		this.r = r;
	}
	
	public double getRadius() {
		return r;
	}
	public void setRadius(double r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;

	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2* Math.PI *r;
	}
	public String toString() {
		return "Circle with radius " + r + " subclass of " +super.toString();
	}
}
