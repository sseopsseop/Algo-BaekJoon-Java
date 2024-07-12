package pro9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_9656 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int remain = n;
		
		while(remain != 0) {
			remain = remain > 3 ? remain -3 : remain - 1;
			cnt++;
		}
		
		String res = "";
		if(cnt % 2 == 0) res = "SK";
		else res = "CY";
		
		System.out.println(res);
		
		br.close();
	}
}
