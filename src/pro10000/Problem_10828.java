package pro10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int N = Integer.parseInt(br.readLine());
		
		List<Integer> stack = new ArrayList<>();
		
		for(int i = 0; i < N; ++i) {
			String inputText = br.readLine();
			if(inputText.contains("push")) stack.add(Integer.parseInt(inputText.split(" ")[1]));
			else if(inputText.equals("pop")) {
				if (stack.size() > 0) {
					System.out.println(stack.get(stack.size() - 1));
					stack.remove(stack.size() -1);
					 
				}
				else System.out.println(-1);
			}
			else if(inputText.equals("size")) System.out.println(stack.size());
			else if(inputText.equals("empty")) {
				if(stack.size() == 0) System.out.println(1);
				else System.out.println(0);
			}
			else if(inputText.equals("top"))
				if(stack.size() == 0) System.out.println(-1);
				else System.out.println(stack.get(stack.size() -1));
			else;
		}
		
		
		br.close();
	}
}
