package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] sortArr = new int[n];
		
		for(int i = 0; i < n; ++i) {
			sortArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				if(sortArr[i] > sortArr[j]) {
					int tmp = sortArr[i];
					sortArr[i] = sortArr[j];
					sortArr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < n; ++i) {
			System.out.println(sortArr[i]);
		}
		
		br.close();
	}
}
