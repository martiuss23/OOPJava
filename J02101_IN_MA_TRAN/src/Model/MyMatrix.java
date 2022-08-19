package Model;

import java.util.Scanner;

public class MyMatrix {
	private int size;
	private int[][] grid;
	
	public MyMatrix(int size) {
		this.size = size;
		grid = new int[size][size];
	}
	
	public void add(int row, int colum, int val) {
		grid[row][colum] = val;
	}
	
	public void printMatrix() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i % 2 == 0) {
					System.out.print(grid[i][j] + " ");
				}
				else
					System.out.print(grid[i][size - j - 1] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			int size = scanner.nextInt();
			MyMatrix matrix = new MyMatrix(size);
			int val;
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					val = scanner.nextInt();
					matrix.add(i, j, val);
				}
			}
			matrix.printMatrix();
		}
		
	}
}
