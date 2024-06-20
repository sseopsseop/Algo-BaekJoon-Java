package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem_1920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, Boolean> nMap = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		String[] aArr = br.readLine().split(" ");
		
		for(int i = 0; i < n; ++i) {
			nMap.put(Integer.valueOf(aArr[i]), false);
		}
		
		int m = Integer.parseInt(br.readLine());
		String[] mArr = br.readLine().split(" ");
		for(int i = 0 ; i < m; ++i) {
			if(nMap.containsKey(Integer.valueOf(mArr[i]))) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
		br.close();
	}
}
