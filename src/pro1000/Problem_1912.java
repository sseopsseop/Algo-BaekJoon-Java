package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		// 입력 초기화
		final int N = Integer.parseInt(br.readLine());
		int[] intVals = new int[N+1];
		int[] maxSums = new int[N+1];

		String[] strIntegers = br.readLine().split(" ");
		for(int i = 1; i <= N; ++i) {
			intVals[i] = Integer.parseInt(strIntegers[i-1]);
		}
		
		maxSums[N] = intVals[N];
		
		// 풀이
		int max = maxSums[N];
		for(int i = N-1; i >= 1; --i) {
			maxSums[i] = Math.max(intVals[i], intVals[i] + maxSums[i+1]);
			
			if(max < maxSums[i]) max = maxSums[i];
		}
		
		System.out.println(max);
	}
}
