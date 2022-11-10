package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class Board {
	class Position{
		private int row;
		private int column;
		private int step;
		
		public Position(int row, int column, int step) {
			this.row = row;
			this.column = column;
			this.step = step;
		}
		
		public Position(int row, Character column, int step) {
			this.row = row;
			this.column = (column - 'a');
			this.step = step;
		}
		
		private Position getMove(Position extra) {
			return new Position(this.row + extra.row, this.column + extra.column, this.step + extra.step);
		}
		
		private boolean inBoard() {
			if(row >= 0 && row < 8 && column >= 0 && column < 8) {
				return true;
			}
			return false;
		}
		
		@Override
		public boolean equals(Object obj) {
			Position o = (Position) obj;
			if(this.row == o.row && this.column == o.column) {
				return true;
			}
			return false;
		}
		
	}
	
	private int[][] grid;
	private List<Position> optionMove;
	private Position startP;
	private Position endP;
	
	public Board() {
		grid = new int[8][8];
		optionMove = new ArrayList<>();
		optionMove.add(new Position(-1, -2, 1));
		optionMove.add(new Position(-2, -1, 1));
		optionMove.add(new Position(-2, 1, 1));
		optionMove.add(new Position(-1, 2, 1));
		optionMove.add(new Position(1, 2, 1));
		optionMove.add(new Position(2, 1, 1));
		optionMove.add(new Position(2, -1, 1));
		optionMove.add(new Position(1, -2, 1));
	}
	
	public void setPosition(String start, String end) {
		startP = new Position(start.charAt(1) - '0' - 1, start.charAt(0) - 'a', 0);
		endP = new Position(end.charAt(1) - '0' - 1, end.charAt(0) - 'a', 0);
	}
	
	public int countStep() {
		return BFS();
	}
	
	private int getStep(Position p) {
		return grid[p.row][p.column];
	}
	
	private void setStep(Position p) {
		grid[p.row][p.column] = p.step;
	}
	
	private void resetBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				grid[i][j] = Integer.MAX_VALUE;
			}
		}
	}
	
	private int BFS() {
		resetBoard();
		setStep(startP);
		ArrayDeque<Position> queue = new ArrayDeque<>();
		queue.addLast(startP);
		while(!queue.isEmpty()) {
			Position current = queue.pollFirst();
			for(Position option : optionMove) {
				Position nextPos = current.getMove(option);
				if(nextPos.inBoard() && nextPos.step < getStep(nextPos)) {
					setStep(nextPos);
					queue.add(nextPos);
				}
			}
			
		}
		return getStep(endP);
	}
	
	
	
	
}
