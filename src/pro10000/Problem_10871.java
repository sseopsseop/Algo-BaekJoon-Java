package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_10871 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nvals = br.readLine().split(" ");
		int n = Integer.parseInt(nvals[0]);
		int val = Integer.parseInt(nvals[1]);
		
		
		String[] nums = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n; ++i) {
			if(val > Integer.parseInt(nums[i]))
				sb.append(Integer.parseInt(nums[i])+ " ");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
