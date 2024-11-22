import java.util.*;

class Employee{
	String name;
	int birthYear;
	int workYears;
	long salary;
	
	public Employee(String name, int birthYear, int workYears) {
		this.name = name;
		this.birthYear = birthYear;
		this.workYears = workYears;
	}
	
	public void CalculateSalary(long base, int startSalary, int incre, long maxSalary) {
		
		int heso = startSalary + (workYears / 5) * incre;
        salary = base * heso;
		if(salary > maxSalary) {
			salary = maxSalary;
		}
	}
	
	public String toString() {
		return name + " " + birthYear + " " + workYears + " " + salary;

	}
	
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long maxSalary = sc.nextLong();
		long base = sc.nextLong();
		int startSalary = sc.nextInt();
		int incre = sc.nextInt();
		
		Employee[] e = new Employee[n];
		long totalSalary = 0;
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int birthYear = sc.nextInt();
			int workYears = sc.nextInt();
			
			e[i] = new Employee(name, birthYear, workYears);
			e[i].CalculateSalary(base, startSalary, incre, maxSalary);
			
			totalSalary += e[i].salary;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(e[i] + " ");
			
		}
		
		System.out.println(totalSalary);
		sc.close();
		
	}
}