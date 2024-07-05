package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		
		int findNum = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 0 ; i < n; ++i) {
			if(findNum == Integer.parseInt(nums[i])) cnt++;
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}

