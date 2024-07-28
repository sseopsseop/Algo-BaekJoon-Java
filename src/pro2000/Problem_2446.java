package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2446 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n - 1; ++i) {
			for(int j = 0; j < i; ++j) {
				System.out.print(" ");
			}
			
			for(int j = 2*n - 1; j > 2*i; --j) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; ++i) {
			for(int j = i; j < n; ++j) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2*i - 1; ++j) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		br.close();
	}
}
