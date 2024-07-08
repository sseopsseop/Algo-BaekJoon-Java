package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2587 {
	public static void main(String[] args) throws IOException {
		final int SIZE = 5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[SIZE];
		
		for(int i = 0 ; i < SIZE; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
//		버블 정렬
		for(int i = SIZE - 1; i > 0; --i) {
			for(int j = 0; j < i; ++j) {
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
//		평균
		int sum = 0;
		for(int i = 0 ; i < SIZE; ++i) {
			sum += arr[i];
		}
		int avr = sum / SIZE;
//		중간값
		int mid = arr[SIZE / 2];

		System.out.println(avr);
		System.out.println(mid);
		br.close();
	}
}
