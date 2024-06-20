package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10844 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		final int MAX_SIZE = 100;
		final int NUMBER_MAX_CNT = 10;
		
		long[][] stairs = new long[MAX_SIZE + 1][NUMBER_MAX_CNT];
		
		for(int i = 1; i < NUMBER_MAX_CNT; ++i) {
			stairs[1][i] = 1;
		}
		
		for(int i = 2; i <= MAX_SIZE; ++i) {
			stairs[i][0] = stairs[i-1][1] % 1000000000;
			stairs[i][9] = stairs[i-1][8] % 1000000000;
			for(int j = 1; j < NUMBER_MAX_CNT -1; ++j) {
				stairs[i][j] = (stairs[i-1][j-1] + stairs[i-1][j+1]) % 1000000000; 
			}
		}
		long sum = 0;
		for(int i = 0; i < NUMBER_MAX_CNT; ++i) {
			sum += stairs[n][i];
		}
		
		System.out.println(sum % 1000000000);
		
		br.close();
	}
}
