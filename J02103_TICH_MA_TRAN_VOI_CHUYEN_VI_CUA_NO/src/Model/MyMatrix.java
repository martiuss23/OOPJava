package Model;

import java.util.Scanner;

public class MyMatrix {
	private int matrix[][], tMatrix[][];
	private int row, colum;
	
	
	public MyMatrix(int row, int colum) {
		this.row = row;
		this.colum = colum;
		this.matrix = new int[row][colum];
		this.tMatrix = new int[colum][row];
	}
	
	public void add(int row, int colum, int val) {
		matrix[row][colum] = val;
		tMatrix[colum][row] = val;
	}
	
	public void mulTransposition() {
		int[][] res = new int[row][row];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				for(int k = 0; k < colum; k++)
					res[i][j] += matrix[i][k] * tMatrix[k][j];
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTest = scanner.nextInt();
		int row, colum;
		for(int test = 1; test <= numOfTest; test++){
			
			row = scanner.nextInt();
			colum = scanner.nextInt();
			MyMatrix myMatrix = new MyMatrix(row, colum);
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < colum; j++) {
					int val = scanner.nextInt();
					myMatrix.add(i, j, val);
				}
			}
			System.out.println("Test " + test + ":");
			myMatrix.mulTransposition();
		}
	}
}
