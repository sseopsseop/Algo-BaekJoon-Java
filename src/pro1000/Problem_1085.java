package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] values = br.readLine().split(" ");
		int x = Integer.parseInt(values[0]);
		int y = Integer.parseInt(values[1]);
		int w = Integer.parseInt(values[2]);
		int h = Integer.parseInt(values[3]);
		
		int minX = (x < w - x ? x : w - x);
		int minY = (y < h - y ? y : h - y);
		
		int min = minX < minY ? minX : minY;
		
		
		System.out.println(min);
		br.close();
	}
}
