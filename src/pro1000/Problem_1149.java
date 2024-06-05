package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 값 초기화
		final int N = Integer.parseInt(br.readLine());
		int[][] rgb = new int[N+1][N+1];
		
		for(int i = 1; i <= N; ++i) {
			String[] lineRgbValues = br.readLine().split(" ");
			for(int j = 1; j <= 3; ++j) {
				rgb[i][j] = Integer.parseInt(lineRgbValues[j-1]);
			}
		}
		
		// 로직 수행
		int[][] rgbMin = new int[N+1][N+1];
		rgbMin[1][1] = rgb[1][1];
		rgbMin[1][2] = rgb[1][2];
		rgbMin[1][3] = rgb[1][3];
		
		for(int i = 2; i <= N; ++i) {
			rgbMin[i][1] = Math.min(rgbMin[i-1][2], rgbMin[i-1][3]) + rgb[i][1];
			rgbMin[i][2] = Math.min(rgbMin[i-1][1], rgbMin[i-1][3]) + rgb[i][2];
			rgbMin[i][3] = Math.min(rgbMin[i-1][1], rgbMin[i-1][2]) + rgb[i][3];
		}
		
		System.out.println(Math.min(Math.min(rgbMin[N][1], rgbMin[N][2]), rgbMin[N][3]));
			
		br.close();
	}
}
