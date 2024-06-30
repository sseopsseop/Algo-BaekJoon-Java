package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem_10817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nums = br.readLine().split(" ");
		
		int[] intNums = {Integer.parseInt(nums[0]),
				Integer.parseInt(nums[1]),
				Integer.parseInt(nums[2])};
		
		Arrays.sort(intNums);
		
		System.out.println(intNums[1]);
		
		br.close();
	}
}
