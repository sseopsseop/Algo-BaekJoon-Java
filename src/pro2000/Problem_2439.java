package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2439 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; ++i) {
			for(int j = i; j < n - 1; ++j) {
				System.out.print(' ');
			}
			for(int j = n - i; j <= n; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		br.close();
	}
}
