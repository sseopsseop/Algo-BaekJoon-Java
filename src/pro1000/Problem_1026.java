package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		
		String[] strNums = br.readLine().split(" ");
		
		for(int i = 0; i < arrA.length; ++i) {
			arrA[i] = Integer.parseInt(strNums[i]);
		}
		

		strNums = br.readLine().split(" ");
	
		for(int i = 0; i < arrB.length; ++i) {
			arrB[i] = Integer.parseInt(strNums[i]);
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		int s = 0;
		for(int i = 0; i < n; ++i) {
			s += arrA[n - i - 1] * arrB[i]; 
		}
		
		System.out.println(s);
		br.close();
	}
}
