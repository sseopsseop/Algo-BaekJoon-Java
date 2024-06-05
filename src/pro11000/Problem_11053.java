package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 값 초기화
		final int N = Integer.parseInt(br.readLine());
		
		String[] tmpValues = br.readLine().split(" ");
		int[] arr = new int[N+1];
		for(int i = 1; i <= N; ++i) {
			arr[i] = Integer.parseInt(tmpValues[i-1]);
		}
		
		// 가장 긴 증가수열 회수 저장
		int[] maxSequence = new int[N+1];
		for(int i = 1; i <= N; ++i) {
			maxSequence[i] = 1;
		}
		maxSequence[1] = 1;
		
		for(int i = 1; i <= N-1; ++i) {
			for(int j = i+1; j <= N; ++j) {
				if(arr[i] > arr[j]) continue;
				else if(arr[i] == arr[j]) maxSequence[j] = maxSequence[i];
				else {
					maxSequence[j] = Math.max(maxSequence[j], maxSequence[i] + 1);
				}
			}
		}
		int max = maxSequence[1];
		for(int i = 1; i <= N; ++i) {
			if(max < maxSequence[i]) max = maxSequence[i];
		}
		
		System.out.println(max);
	}
}
