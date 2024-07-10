package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2562 {
	public static void main(String[] args) throws IOException {
		final int MAX_LENGTH = 9;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[MAX_LENGTH];
		
		for(int i = 0; i < MAX_LENGTH; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int maxIdx = 0;
		
		for(int i = 1 ; i < MAX_LENGTH; ++i) {
			if(arr[i] > arr[maxIdx]) maxIdx = i;
		}
		
		System.out.println(arr[maxIdx]);
		System.out.println(maxIdx + 1);
		
		br.close();
	}
}
