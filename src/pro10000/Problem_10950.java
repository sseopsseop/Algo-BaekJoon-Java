package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ;i < n; ++i) {
			String[] str = br.readLine().split(" ");
			System.out.println(Integer.parseInt(str[0]) 
					+ Integer.parseInt(str[1]));
		}
		
		br.close();
	}
}
