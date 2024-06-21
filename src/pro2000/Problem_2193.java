package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2193 {
	public static void main(String[] args) throws IOException {
		final int MAX_LENGTH = 90;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] pinaryNumbers = new long[MAX_LENGTH +1];
		
		pinaryNumbers[1] = 1;
		for(int i = 2; i <= MAX_LENGTH; ++i) {
			pinaryNumbers[i] = pinaryNumbers[i-2] + pinaryNumbers[i-1];
		}
		
		System.out.println(pinaryNumbers[n]);
		
		br.close();
	}
}
