package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int T = Integer.parseInt(br.readLine());
		
		final int N = 30;
		final int M = 30;
		long[][] bridges = new long[N+1][M+1];
		
		// 값 초기화
		for(int i = 1; i <= N; ++i) {
			bridges[i][i] = 1;
			bridges[1][i] = i;
		}
		
		// 로직
		for(int i = 2; i <= N; ++i) {
			for(int j = i; j <= M; ++j) {
				bridges[i][j] = bridges[i-1][j-1] + bridges[i][j-1];
			}
		}
		
		// 테스트케이스
		for(int i = 1; i <= T; ++i) {
			String[] testCase = br.readLine().split(" ");
			System.out.println(bridges[Integer.parseInt(testCase[0])][Integer.parseInt(testCase[1])]);
		}
	}
}
