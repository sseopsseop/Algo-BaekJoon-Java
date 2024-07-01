package pro11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		List<int[]> src = new ArrayList<>();
		List<int[]> sort = new ArrayList<>();
		
		for(int i = 0; i < size; ++i) {
			String[] vals = br.readLine().split(" ");
			int[] tmp = {Integer.parseInt(vals[0]),Integer.parseInt(vals[1])};
			src.add(tmp);
			sort.add(tmp);
		}
		
		mergeSort(src, 0, size - 1, sort);
		
		StringBuilder resBuilder = new StringBuilder();
		for(int i = 0; i < size; ++i) {
			resBuilder.append(src.get(i)[0] + " " + src.get(i)[1] + "\n");
		}
		
		System.out.println(resBuilder.toString());
		br.close();
	}
	
	public static void merge(List<int[]> src, int left, int mid, int right, List<int[]> sort) {
		int leftIdx = left;
		int midIdx = mid+1;
		int startIdx = left;
		
		while(leftIdx <= mid && midIdx <= right) {
			if(src.get(leftIdx)[0] == src.get(midIdx)[0]) {
				if(src.get(leftIdx)[1] >= src.get(midIdx)[1]) {
					sort.set(startIdx++, src.get(midIdx++));
				}
				else
					sort.set(startIdx++, src.get(leftIdx++));
				continue;
			}
			
			if(src.get(leftIdx)[0] > src.get(midIdx)[0])
				sort.set(startIdx++, src.get(midIdx++));
			else sort.set(startIdx++, src.get(leftIdx++));
		}
		
		while(leftIdx <= mid) {
			sort.set(startIdx++, src.get(leftIdx++));
		}
		
		while(midIdx <= right) {
			sort.set(startIdx++, src.get(midIdx++));
		}
		
		for(int i = left; i <= right; ++i) {
			src.set(i, sort.get(i));
		}
		
	}
	
	public static void mergeSort(List<int[]> src, int left, int right, List<int[]> sort) {
		int mid = 0;
		
		if(left < right) {
			mid = (left + right) / 2;
			mergeSort(src, left, mid, sort);
			mergeSort(src, mid+1, right, sort);
			merge(src, left, mid, right, sort);
		}
	}
}
