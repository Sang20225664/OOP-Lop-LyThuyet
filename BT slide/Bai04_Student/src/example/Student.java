package example;

public class Student {
	private String name;
	private int year;
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		this.year = y;
	}
	
}
