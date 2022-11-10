package model;

import java.util.Collections;
import java.util.Comparator;

public class RectangleBoard {
	private static int row = 2, column = 3;
	private int[][] grid;
	private int step;
	
	
	public RectangleBoard(int[][] grid, int step) {
		this.grid = grid;
		this.step = step;
	}
	
	int getStep() {
		return step;
	}
	
	private int[][] rollGrid(int index){
		int[][] newGrid = copyGrid();
		int tmp = newGrid[0][index];
		newGrid[0][index] = newGrid[0][index + 1];
		newGrid[0][index + 1] = tmp;
		
		tmp = newGrid[0][index];
		newGrid[0][index] = newGrid[1][index + 1];
		newGrid[1][index + 1] = tmp;
		
		tmp = newGrid[0][index];
		newGrid[0][index] = newGrid[1][index];
		newGrid[1][index] = tmp;
		
		return newGrid;
	}
	
	private int[][] copyGrid(){
		int[][] newGrid = new int[2][3];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				newGrid[i][j] = grid[i][j];
			}
		}
		return newGrid;
	}
	
	RectangleBoard getRoll(int index) {
		return new RectangleBoard(rollGrid(index), step+1);
	}
	
	@Override
	public boolean equals(Object obj) {
		RectangleBoard o = (RectangleBoard)obj;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(this.grid[i][j] != o.grid[i][j]) return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sbd.append(grid[i][j] + " ");
			}
			sbd.append("\n");
		}
		return sbd.toString();
	}

	
	
}
