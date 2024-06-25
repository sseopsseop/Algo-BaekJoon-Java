package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1904 {
	public static void main(String[] args) throws IOException{
		final int N = 1000000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		
		dp[1] = 1;
		if(n >= 2) dp[2] = 2;
		for(int i = 3; i <= n; ++i) {
			dp[i] = (dp[i-1] + dp[i-2]) % 15746;
		}
		
		System.out.println(dp[n]);
		
		br.close();
	}
}	
