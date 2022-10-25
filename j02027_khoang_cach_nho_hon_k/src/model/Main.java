package model;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int lowerBound(int[] arr, int start, int end,  int key ) {
		if(start < end) {
			int mid = (end + start + 1)/2;
			if(arr[mid] >= key) return lowerBound(arr, start, mid - 1, key);
			return lowerBound(arr, mid, end, key);
		}
		if(arr[start] < key) return start;
		return start - 1;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-->0) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			long counter = 0;
			for(int i = 0; i < n - 1; i++) {
				counter += lowerBound(arr, i + 1, n-1,arr[i] +  k) - i;
			}
			System.out.println(counter);
		}
	}
}
