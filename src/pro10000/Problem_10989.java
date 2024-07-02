package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10989 {
	public static void main(String[] args) throws IOException{
		final int MAX_VAL = 10000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		int[] src = new int[n+1];
		int[] res = new int[n+1];
		int[] count = new int[MAX_VAL + 1];
		for(int i =  1 ; i <= n ;++i) {
			src[i] = Integer.parseInt(br.readLine());
		}
		
		// 개수 증가
		for(int i = 1; i <= n; ++i) {
			count[src[i]]++;
		}
		
		// 누적합으로 갱신
		for(int i = 1 ; i <= MAX_VAL; ++i) {
			count[i] += count[i-1];
		}
		
		// 정렬
		for(int i = n; i >= 1; --i) {	
			res[count[src[i]]] = src[i];
			count[src[i]]--;
		}
		
		
		
		StringBuilder sbRes = new StringBuilder();
		for(int i = 1; i <= n; ++i) {
			sbRes.append(res[i] + "\n");
		}
		System.out.println(sbRes);
		
		br.close();
	}
	
	
}