import java.util.*;
public class main{
	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc. nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(computeC(k, n));
	}
	static int computeC(int k, int n) {
		if( k > n) return 0;
		int [][] dp = new int[k+1][n+1];
		for(int i = 0; i <= n; i++) {
			dp[0][i] = 1;
		}
		for(int i = 1; i <= k; i++) {
			for(int j = i; j <= n; j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i][j-1]) % MOD;
			}
		}
		return dp[k][n];
		
	}
}