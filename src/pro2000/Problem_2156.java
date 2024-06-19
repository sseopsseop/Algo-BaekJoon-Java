package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2156 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int MAX_SIZE = 10000;
		
		int[][] wineMax = new int[MAX_SIZE +1][2];
		
		int n = Integer.parseInt(br.readLine());
		
		int[] wineVal = new int[n+1];
		
		for(int i = 1; i <= n; ++i) {
			wineVal[i] = Integer.parseInt(br.readLine());
		}
		
		wineMax[1][0] = wineVal[1];
		int max = wineMax[1][0];
		if(n >= 2) {
			wineMax[2][0] = wineVal[2];
			wineMax[2][1] = wineMax[1][0] + wineVal[2];
			
			max = Math.max(max, Math.max(wineMax[2][0], wineMax[2][1]));
			
			for(int i = 3; i <= n; ++i) {
				wineMax[i][0] = Math.max(Math.max(wineMax[i-2][0], wineMax[i-2][1]),
						Math.max(wineMax[i-3][0], wineMax[i-3][1])) + wineVal[i];
				wineMax[i][1] = wineMax[i-1][0] + wineVal[i];
				
				max = Math.max(max, Math.max(wineMax[i][0], wineMax[i][1]));
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
