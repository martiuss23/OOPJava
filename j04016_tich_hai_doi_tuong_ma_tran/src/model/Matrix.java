package model;

import java.util.Scanner;

public class Matrix {
	private int[][] matrix;
	private int row;
	private int column;
	
	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		matrix = new int[row][column];
	}
	
	public void nextMatrix(Scanner input) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
	}
	
	
	public Matrix mul(Matrix secondMT) {
		Matrix result = new Matrix(this.row, secondMT.column);
		for(int i = 0; i < this.row; i++) {
			for(int j = 0; j < secondMT.column; j++) {
				result.matrix[i][j] = 0;
				for(int k = 0; k < this.column; k++) {
					result.matrix[i][j] += this.matrix[i][k] * secondMT.matrix[k][j];
				}
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sbd.append(matrix[i][j] + "");
				if(j < column - 1)
					sbd.append(" ");
			}
			sbd.append("\n");
		}
		return sbd.toString();
	}
}
