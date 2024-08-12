package pro20000.pro27000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_27433 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
		br.close();
	}
	
	public static long factorial(long n) {
		if(n == 0) return 1;
		
		return factorial(n-1) * n;
	}
}
