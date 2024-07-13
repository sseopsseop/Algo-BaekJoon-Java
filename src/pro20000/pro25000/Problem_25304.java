package pro20000.pro25000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int moneyTotal = Integer.parseInt(br.readLine());
		int receiptCnt = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < receiptCnt; ++i) {
			String[] caseN = br.readLine().split(" ");
			sum += Integer.parseInt(caseN[0]) * Integer.parseInt(caseN[1]);
		}
		
		if(moneyTotal == sum) System.out.println("Yes");
		else System.out.println("No");
		
		br.close();
	}
}
