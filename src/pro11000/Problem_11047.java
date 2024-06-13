package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstLine = br.readLine().split(" ");
		final int N = Integer.parseInt(firstLine[0]);
		final int K = Integer.parseInt(firstLine[1]);
		
		int[] moneyCnt = new int[N+1];
		int[] moneys = new int[N+1];
		
		for(int i = 1; i <= N; ++i) {
			moneys[i] = Integer.parseInt(br.readLine());
		}
		
		int remainMoney = K;
		int cnts = 0;
		for(int i = N; i>= 1; --i) {
			moneyCnt[i] = remainMoney/moneys[i];
			remainMoney %= moneys[i];
			cnts += moneyCnt[i];
		}
		
		System.out.println(cnts);
		br.close();
	}
}
