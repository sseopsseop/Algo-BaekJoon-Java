package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] res = br.readLine().trim().split(" ");
		
		System.out.println(res[0].equals("") ? 0 : res.length);
		
		br.close();
	}
}
