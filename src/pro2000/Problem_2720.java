package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int[] centArr = {25, 10, 5, 1};
		
		int T = Integer.parseInt(br.readLine());
		
		int[] moneyArr = new int[T];
		
		for(int i = 0; i < T; ++i) {
			moneyArr[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; ++i) {
			int r = moneyArr[i];
			
			for(int j = 0; j < centArr.length; ++j) {
				int cnt = r / centArr[j];
				if(cnt != 0) r = r % centArr[j];
				sb.append(cnt + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
