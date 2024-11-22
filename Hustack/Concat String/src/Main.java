import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		int n2 = sc.nextInt();
		sc.nextLine();
		String s2 = sc.nextLine();
		
		int k = sc.nextInt();
		int t = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			System.out.print(s1);
		}
		for(int i = 0; i < t; i++) {
			System.out.print(s2);
		}
		sc.close();
	}
}
