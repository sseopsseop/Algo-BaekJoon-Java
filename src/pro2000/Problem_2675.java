package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] repeat = new int[t];
		String[] str = new String[t];
		
		for(int i = 0; i < t; ++i) {
			String[] parse = br.readLine().split(" ");
			repeat[i] = Integer.parseInt(parse[0]);
			str[i] = parse[1];
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; ++i) {
			int length = str[i].length(); 
			for(int j = 0; j < length; ++j) {
				for(int k = 0 ; k < repeat[i]; ++k) {
					sb.append(str[i].charAt(j));
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		
		br.close();
	}
}
