package pro9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		String[] strArr = new String[t];
		boolean[] checkedVpsArr = new boolean[t];
		
		// 값 초기화
		for(int i = 0 ; i < t; ++i) {
			strArr[i] = br.readLine();
		}
		
		for(int i = 0; i < t; ++i) {
			Deque<Character> stack = new ArrayDeque<>();
			boolean isNotVps = false;
			
			for(int j = 0; j < t; ++j) {
				if(checkedVpsArr[j] && strArr[i].contains(strArr[j])) {
					strArr[i].replace(strArr[j], "");
				}
			}
			
			for(int j = 0; j < strArr[i].length(); ++j) {
				char ch = strArr[i].charAt(j);
				if(ch == ')' && !stack.isEmpty()) {
					char popCh = stack.pop();
					if(popCh == ')') {
						isNotVps = true;
						break;
					}
				}
				else stack.add(ch);
				
				if(isNotVps) break;
			} 
			if(!stack.isEmpty()) isNotVps = true;
			if(!isNotVps) checkedVpsArr[i] = true;
		}
		
		for(int i = 0 ; i < t; ++i) {
			if(checkedVpsArr[i]) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
