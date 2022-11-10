package model;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static int[][] nextGrid(int row, int column, Scanner scn) {
		int[][] grid = new int[row][column];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				grid[i][j] = scn.nextInt();
			}
		}
		return grid;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-->0) {
			int[][] start = nextGrid(2, 3, scn);
			int[][] end = nextGrid(2, 3, scn);
			BoardQueue queue = new BoardQueue(new RectangleBoard(start, 0),new RectangleBoard(end, 0));
			System.out.println(queue.getMinimumStep());
		}
		
	}
}
