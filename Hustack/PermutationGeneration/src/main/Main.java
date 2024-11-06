package main;
import java.util.*;
public class Main {
	static final int MAX = 100;
	static int[] a = new int[MAX];
	static boolean[] bMark = new boolean[MAX];
	static int n;
	
	static void Try(int k) {
		for(int i = 1; i<= n; i++) {
			if(!bMark[i]) {
				a[k] = i;
				bMark[i] = true;
				if(k == n) {
					for(int j = 1; j<= n; j++) {
						System.out.print(a[j] +" ");
						
					}
					System.out.println();
				}
				else {
					Try(k+1);
				}
				bMark[i] = false;
			}
			
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Try(1);
		sc.close();	
	}
}
