package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11727 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int N = Integer.parseInt(br.readLine());
		int[] fn = new int[N+1];
		
		fn[1] = 1;
		if(N >= 2) fn[2] = 3;
		
		for(int i= 3; i <= N; ++i) {
			fn[i] = (fn[i-1] + fn[i-2] *2) % 10007;
		}
		
		System.out.println(fn[N]);
		br.close();
	}
}
