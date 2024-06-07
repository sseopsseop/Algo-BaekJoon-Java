package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1932 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 값 초기화
		final int N = Integer.parseInt(br.readLine());
		int[][] triInt = new int[N+1][N+1];
		
		for(int i = 1; i <= N; ++i) {
			String[] valSet = br.readLine().split(" ");
			for(int j = 0 ; j < valSet.length; ++j) {
				triInt[i][j+1] = Integer.parseInt(valSet[j]);
			}
		}
		
		// 구현
		int[][] sums = new int[N+1][N + 1];
		for(int i = 1;  i <= N; ++i) {
			for(int j = 1; j <= i; ++j) {
				sums[i][j] = Math.max(sums[i-1][j-1] + triInt[i][j], sums[i-1][j] + triInt[i][j]);
			}
		}
		
		int max = sums[N][0];
		for(int j = 1; j <= N; ++j) {
			max = Math.max(max, sums[N][j]);
		}
		
		System.out.println(max);
	}
}
