package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Deque<Integer> stack = new ArrayDeque<>();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < k; ++i) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				stack.pollLast();

				continue;
			}
			stack.addLast(n);
		}
		
		int sum = 0;
		for(int val : stack) {
			sum += val;
		}
		
		System.out.println(sum);
		
		
		br.close();
	}
}
