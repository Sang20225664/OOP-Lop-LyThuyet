package slide3;

import java.util.Scanner;

public class Vector {
	private double x, y, z;
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y; 
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public Vector add(Vector v) {
		return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	public Vector subtract(Vector v) {
		return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	public Vector mul(double s) {
		return new Vector(this.x*s, this.y*s, this.z *s);
	}
	public double dot(Vector v) {
		return this.x *v.x + this.y * v.y + this.z * v.x;
	}
	public String toString() {
		return  "(" + x + ", " + y + ", " + z + ")";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vector thu nhat: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		Vector v1 = new Vector (x, y, z);
		
		System.out.print("Vector thu hai: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Vector v2 = new Vector(a, b, c);
		
		System.out.println("Vector v1: " + v1);
		System.out.println("Vector v2: " + v2);
		
		Vector sum = v1.add(v2);
		System.out.println("v1 + v2 = " + sum);
		
		Vector sub = v1.subtract(v2);
		System.out.println("v1 - v2 = " + sub);
	
		System.out.println("v1 . v2 = " + v1.dot(v2));
		
		System.out.print("Nhap thừa số muốn nhân với vector v1: ");
		double s = sc.nextDouble();
		System.out.println("v1 * " + s + " = " + v1.mul(s));
	}
}
