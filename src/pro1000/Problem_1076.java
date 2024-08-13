package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem_1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int size = 10;
		Map<String, long[]> resistanceMap = new HashMap<>();
		
		String[] colors = {"black", "brown", "red", "orange", 
				"yellow", "green", "blue", "violet", "grey", "white"};
		
		long[][] vals = new long[size][2];
		
		for(int i = 0; i < size; ++i) {
			vals[i][0] = i;
			vals[i][1] = (long)Math.pow(10, i);
			
			resistanceMap.put(colors[i], vals[i]);	
		}
		
		long resistVal = 0;
		
		resistVal = (resistanceMap.get(br.readLine())[0] * 10 + 
				resistanceMap.get(br.readLine())[0] * 1) * resistanceMap.get(br.readLine())[1];
		
		System.out.println(resistVal);
		
		br.close();
	}
}
