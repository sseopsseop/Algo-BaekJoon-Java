package pro2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		값 초기화
		int n = Integer.parseInt(br.readLine());
		
		int[] sortArr = new int[n];
		int[] resArr = new int[n];
		
		for(int i = 0; i < n; ++i) {
			resArr[i] = Integer.parseInt(br.readLine());
		}
		
//		병합정렬
		mergeSort(resArr, 0, resArr.length - 1, sortArr);
		
//		출력
		StringBuilder printSb = new StringBuilder();
		for(int i = 0; i < n; ++i) {
			printSb.append(resArr[i]+"\n");
		}
		
		System.out.println(printSb);
		br.close();
	}
	
	public static void merge(int[] resArr, int left, int mid, int right, int[] sortArr) {
		int i = left;
		int j = mid+1;
		int k = left;
		
		while(i<= mid && j<=right) {
			if(resArr[i] < resArr[j]) {
				sortArr[k++] = resArr[i++];
			}else {
				sortArr[k++] = resArr[j++];
			}
		}
		
		if(i > mid) {
			while(j <= right) {
				sortArr[k++] = resArr[j++];
			}
		}else {
			while(i <= mid) {
				sortArr[k++] = resArr[i++];
			}
		}
		
//		copy
		for(int l = left; l <= right; ++l) {
			resArr[l] = sortArr[l];
		}
	}
	
//	매개변수 : source -> res 배열, 좌배열 처음 인덱스, 우배열 처음 인덱스, sort 용 배열
	public static void mergeSort(int[] resArr, int left, int right, int[] sortArr) {
		int mid = 0;
		
		if(left < right) {
//			분할
			mid = (left + right) / 2;
//			정복
			mergeSort(resArr, left, mid, sortArr);
			mergeSort(resArr, mid + 1, right, sortArr);
//			병합
			merge(resArr, left, mid, right, sortArr);
		}
	}
}
