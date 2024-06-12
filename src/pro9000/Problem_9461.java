package pro9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_9461 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int T = Integer.parseInt(br.readLine());
		final int MAX_SIZE = 100;
		long[] padovan = new long[MAX_SIZE+1];
		
		padovan[1] = 1;
		padovan[2] = 1;
		padovan[3] = 1;
		padovan[4] = 2;
		padovan[5] = 2;
		
		for(int i = 6; i <= MAX_SIZE; ++i) {
			padovan[i] = padovan[i-1] + padovan[i-5];
		}
		
		// 출력
		for(int i = 1; i <= T; ++i) {
			System.out.println();
			System.out.println();
		}
		
		br.close();
	}
}
