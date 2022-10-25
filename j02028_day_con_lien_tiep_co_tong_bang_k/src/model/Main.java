package model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	
	public static boolean isGreateArr(int[] arr, int n, long k) {
		Deque<Integer> dq = new ArrayDeque<>();
		long sum = 0;
		for(int i = 0; i < n; i++) {
			dq.push(arr[i]);
			sum += arr[i];
			while(!dq.isEmpty()) {
				if(sum > k) {
					sum -= dq.pollLast();
				}
				else if(sum == k) return true;
				else break;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int n = scn.nextInt();
			long k = scn.nextLong();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			if(isGreateArr(arr, n, k)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
