package Model;

import java.util.Scanner;

public class MyMatrix {
	private int[][] matrix;
	private int size;
	
	public MyMatrix(int[][] grid, int size) {
		matrix = grid;
		this.size = size;
	}
	
	public void countRow() {
		int numOfRow = 0;
		for(int i = 0; i < size; i++) {
			int cnt = 0;
			for(int j = 0; j < size; j++) {
				cnt+= matrix[i][j];
			}
			if(cnt > size/2) numOfRow++;
		}
		System.out.println(numOfRow);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] grid = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				grid[i][j] = scanner.nextInt();
			}
		}
		new MyMatrix(grid, size).countRow();
	}
}
