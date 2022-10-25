package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void backTrack(int i, int k, int n, int[] arr, Stack<Integer> res) {
		if(i == n) {
			if(res.size() == k) {
				res.forEach((nb)->System.out.print(nb + " "));
				System.out.println();
			}
			return;
		}
		if(res.isEmpty() || (arr[i] > res.peek() && res.size() < k)) {
			res.add(arr[i]);
			backTrack(i + 1 , k, n, arr, res );
			res.pop();
		}
		backTrack(i + 1, k, n,  arr, res);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int size = scn.nextInt();
			int k = scn.nextInt();
			int[] arr = new int[size];
			for(int i = 0; i < size; i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			ArrayList<Integer> ps = new ArrayList<>();
			backTrack(0,k,size, arr, new Stack<Integer>());
		}
	}
}
