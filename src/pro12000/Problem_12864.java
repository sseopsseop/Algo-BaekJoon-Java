package pro12000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem_12864 {
	public static void main(String[] args) throws IOException {
		final int N = 100;
		final int K = 100000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 값 초기화
		String[] nk = br.readLine().split(" ");
		int n = Integer.valueOf(nk[0]);
		int k = Integer.valueOf(nk[1]);
		
		int[] ws = new int[n+1];
		int[] vs = new int[n+1];
		
		for(int i = 1; i <= n; ++i) {
			String[] wv = br.readLine().split(" ");
			ws[i] = Integer.valueOf(wv[0]);
			vs[i] = Integer.valueOf(wv[1]);
		}
		
		int[][] dp = new int[N+1][K+1];
	
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= k; ++j) {
				if(ws[i] > j) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-ws[i]] + vs[i]); 
			}
		}
		
		System.out.println(dp[n][k]);
		
		br.close();
	}
}
