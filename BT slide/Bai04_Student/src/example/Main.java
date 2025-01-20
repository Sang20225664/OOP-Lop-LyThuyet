	package example;
	import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập số lượng sinh viên: ");
			int n = sc.nextInt();
			Student[] cls = new Student[n];
			System.out.println("Nhập thông tin sinh viên(tên và năm sinh): ");
			
			for(int i = 0; i < n; i++) {
				sc.nextLine();
				String name = sc.nextLine();
				
				int y = sc.nextInt();
				cls[i] = new Student(name, y);
			}
			int totalAge = 0;
			System.out.println("Danh sach sinh vien: ");
			for(int i = 0; i < n; i++) {
				System.out.println(cls[i].getName());
				totalAge += (2024-cls[i].getYear());
			}
			System.out.println("\nTổng số tuổi của tất cả sinh viên: " + totalAge);
			sc.close();
		}
	}
