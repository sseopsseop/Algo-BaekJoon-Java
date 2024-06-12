package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int N = Integer.parseInt(br.readLine());
		String[] tempPi = br.readLine().split(" ");
		int[] valPi = new int[N+1];
		long[] sumValPi = new long[N+1];
		
		for(int i = 1; i <= N; ++i) {
			valPi[i] = Integer.parseInt(tempPi[i-1]);
		}
		
		// 로직
		Arrays.sort(valPi);
		
		sumValPi[1] = valPi[1];
		long totalSum = sumValPi[1];
		
		for(int i = 2; i <= N; ++i) {
			sumValPi[i] = sumValPi[i-1] + valPi[i];
			totalSum += sumValPi[i];
		}
		
		
		System.out.println(totalSum);
	}
}
