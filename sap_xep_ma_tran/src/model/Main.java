package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("MATRIX.in"));
		int test = scn.nextInt();
		while(test-->0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int k = scn.nextInt();
			int[][] grid = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++ ) {
					grid[i][j] = scn.nextInt();
				}
			}
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = grid[i][k - 1];
			}
			Arrays.sort(arr);
			for(int i = 0; i < n; i++) {
				grid[i][k - 1] = arr[i];
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
