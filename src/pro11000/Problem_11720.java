package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int N = Integer.parseInt(br.readLine());
		String textIntegers = br.readLine();
		int sum = 0;
		for(int i = 0; i < textIntegers.length(); ++i) {
			sum += textIntegers.charAt(i) - '0';
		}
		System.out.println(sum);
		
		br.close();
	}
}
