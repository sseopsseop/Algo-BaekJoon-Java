package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2748 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int MAX_N = 90;
		int n = Integer.parseInt(br.readLine());
		
		long[] fn = new long[MAX_N + 1];
		
		fn[1] = 1;
		for(int i = 2; i <= MAX_N; ++i) {
			fn[i] = fn[i-1] + fn[i-2];
		}
		
		System.out.println(fn[n]);
		
		br.close();
	}
}
