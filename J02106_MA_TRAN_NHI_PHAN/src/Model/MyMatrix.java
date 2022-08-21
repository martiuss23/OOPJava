package Model;

import java.util.Scanner;

public class MyMatrix {
	private int[][] matrix;
	private int size;
	
	public MyMatrix(int[][] grid, int size) {
		matrix = grid;
		this.size = size;
	}
	
	public MyMatrix(int size) {
		matrix = new int[size][3];
		this.size = size;
	}
	
	public void add(int row, int colum, int val) {
		matrix[row][colum] = val;
	}
	
	public void countRow() {
		int numOfRow = 0;
		for(int i = 0; i < size; i++) {
			int cnt = 0;
			for(int j = 0; j < 3; j++) {
				cnt+= matrix[i][j];
			}
			if(cnt >= 2) numOfRow++;
		}
		System.out.println(numOfRow);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		MyMatrix matrix = new MyMatrix(size);
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < 3; j++) {
				int item = scanner.nextInt();
				matrix.add(i, j, item);
			}
		}
		matrix.countRow();
	}
}
