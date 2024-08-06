package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2738 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] size = br.readLine().split(" ");
		
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		
		int[][] matrix = new int[n][m];
		
		for(int i = 0; i < n; ++i) {
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < m; ++j) {
				matrix[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i = 0; i < n; ++i) {
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < m; ++j) {
				matrix[i][j] += Integer.parseInt(line[j]);
			}
		}
		
		for(int i = 0; i < n ; ++i) {
			for(int j = 0 ; j < m; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		br.close();
	}
}
