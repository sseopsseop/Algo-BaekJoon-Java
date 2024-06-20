package pro14000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_14501 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int MAX_N = 15;
		final int MAX_T_SIZE = 5;
		final int MAX_P_SIZE = 1000;
		
		int[] tArr = new int[MAX_P_SIZE + 1];
		int[] pArr = new int[MAX_P_SIZE + 1];
		
		int[] maxIncomes = new int[MAX_P_SIZE + 1];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; ++i) {
			String[] tp = br.readLine().split(" ");
			tArr[i] = Integer.parseInt(tp[0]);
			pArr[i] = Integer.parseInt(tp[1]);
			
		}
		
		// 값 초기화
		int max = 0;
		
		if(tArr[1] + 1 <= n + 1) {
			maxIncomes[1] = pArr[1];
			max = maxIncomes[1];
		}
		for(int i = 2; i <= n; ++i) {

			int tmpMax = 0;
			for(int j = 1; j < i; ++j) {
				if(tArr[j] + j <= i) tmpMax = maxIncomes[j];
				if(tmpMax > maxIncomes[i]) maxIncomes[i] = tmpMax;
			}
			if(tArr[i] + i <= n + 1) {
				maxIncomes[i] += pArr[i];
			}else continue;
			if(maxIncomes[i] > max) max = maxIncomes[i];
		}

		
		System.out.println(max);
		
		
		br.close();
	}
}
