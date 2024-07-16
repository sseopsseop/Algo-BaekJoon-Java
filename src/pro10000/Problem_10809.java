package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int alphabetSize = 26;
		
		int[] alphabetPos = new int[alphabetSize];
		Arrays.fill(alphabetPos, -1);
		
		String str = br.readLine();
		
	
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if(alphabetPos[str.charAt(i) - 97] == -1) alphabetPos[str.charAt(i) - 97] = i;
			}
		}
		
		for(int i = 0; i < alphabetSize; ++i) {
			System.out.print(alphabetPos[i] + " ");
		}
		
		br.close();
	}
}
