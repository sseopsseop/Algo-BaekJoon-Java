package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] divisors = new int[n];
		
		String[] strDivisors = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			divisors[i] = Integer.parseInt(strDivisors[i]);
		}
		
		Arrays.sort(divisors);
		
		System.out.println(divisors[0] * divisors[n-1]);
		
		br.close();
	}
}
