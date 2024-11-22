import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		int n2 = sc.nextInt();
		sc.nextLine();
		String s2 = sc.nextLine();
		
		ArrayList<Integer> pos = new ArrayList<>();  //tuong ung vector ben C++
		
		for(int i = 0; i <= n1 - n2; i++) {
			if(s1.substring(i, i + n2).equals(s2)) {
				pos.add(i);
			}
		}
		for(int p : pos) {
			System.out.print(p + " ");
		}
		sc.close();
	}
}
