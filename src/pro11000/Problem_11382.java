package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11382 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vals = br.readLine().split(" ");
		
		long res = Long.parseLong(vals[0]) + Long.parseLong(vals[1]) + Long.parseLong(vals[2]);
		
		System.out.println(res);
		br.close();
	}
}
