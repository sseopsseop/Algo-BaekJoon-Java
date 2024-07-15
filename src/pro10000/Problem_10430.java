package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] rawValues = br.readLine().split(" ");
		
		int a = Integer.parseInt(rawValues[0]);
		int b = Integer.parseInt(rawValues[1]);
		int c = Integer.parseInt(rawValues[2]);
		
		System.out.println((a+b) % c);
		System.out.println(((a%c) + (b%c)) % c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		br.close();
	}
	
	
}
