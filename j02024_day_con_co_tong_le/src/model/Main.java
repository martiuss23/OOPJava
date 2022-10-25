package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void backTrack(int i, int sum, int[] arr, String res) {
		if(i == -1) {
			if(sum % 2 != 0) System.out.println(res.trim());
			return;
		}
		backTrack(i - 1, sum, arr, res);
		backTrack(i - 1 , sum + arr[i], arr, res + " " + arr[i]);
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int size = scn.nextInt();
			int[] arr = new int[size];
			for(int i = 0; i < size; i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			backTrack(size - 1, 0, arr, "");
		}
	}
}
