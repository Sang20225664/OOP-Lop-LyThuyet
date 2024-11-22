import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // Loại bỏ ký tự xuống dòng thừa
		String input = sc.nextLine();
		char c = sc.next().charAt(0);
		char replace = sc.next().charAt(0);

		
		int cnt = 0;
		StringBuilder res = new StringBuilder(input);
		for(int i = 0; i < n; i++) {
			if(input.charAt(i) == c) {
				cnt++;
				res.setCharAt(i,  replace);
			}
		}
		System.out.println(cnt + " "+ res);
		sc.close();
	}
}
