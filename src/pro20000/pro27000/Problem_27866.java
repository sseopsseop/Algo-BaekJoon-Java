package pro20000.pro27000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		StringBuilder res = new StringBuilder();
		
		res.append(text.charAt(i-1));
		
		System.out.println(res.toString());
	}

}
