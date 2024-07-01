package pro1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder[] dic = new StringBuilder[n];
		StringBuilder[] sortDic = new StringBuilder[n];
		
		for(int i = 0 ; i < n; ++i) {
			dic[i] = new StringBuilder();
			dic[i].append(br.readLine());
		}
		
		mergeSort(dic, 0, n-1, sortDic);
		
		StringBuilder res = new StringBuilder();
		
		String checkStr = "";
		for(int i = 0 ; i < n; ++i) {
			if(!checkStr.equals(dic[i].toString())) {
				checkStr = dic[i].toString();
				res.append(dic[i]+"\n");
				continue;
			}
		}
		
		System.out.println(res);	
		br.close();
	}
	
	public static void merge(StringBuilder[] src, int left, int mid, int right, StringBuilder[] sort) {
		int leftIdx = left;
		int midIdx = mid+1;
		int idx = left;
		
		while(leftIdx <= mid && midIdx <= right) {
			if(src[leftIdx].length() < src[midIdx].length()) sort[idx++] = src[leftIdx++];
			else if(src[leftIdx].length() > src[midIdx].length()) sort[idx++] = src[midIdx++];
			else {
				if(src[leftIdx].compareTo(src[midIdx]) <= 0) sort[idx++] = src[leftIdx++];
				else sort[idx++] = src[midIdx++];
			}
			
		
		}
		
		if(midIdx <= right) {
			for(int i = midIdx; i <= right; ++i) {
				sort[idx++] = src[i];
			}
		}else {
			for(int i = leftIdx; i <= mid; ++i) {
				sort[idx++] = src[i];
			}
		}
		
		
		for(int i = left; i <= right; ++i) {
			src[i] = sort[i];
		}
		
	}
	
	public static void mergeSort(StringBuilder[] src, int left, int right, StringBuilder[] sort) {
		int mid = 0;
		
		if(left < right){
			mid = (left + right) / 2;
			mergeSort(src, left, mid, sort);
			mergeSort(src, mid+1, right, sort);
			merge(src, left, mid, right, sort);
		}
		
	}
}
