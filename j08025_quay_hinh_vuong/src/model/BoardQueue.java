package model;

import java.util.ArrayDeque;

public class BoardQueue {
	private ArrayDeque<RectangleBoard> queue;
	private RectangleBoard startBoard;
	private RectangleBoard endBoard;
	
	
	public BoardQueue(RectangleBoard startBoard, RectangleBoard endBoard) {
		this.startBoard = startBoard;
		this.endBoard = endBoard;
	}
	
	private int BFS() {
		queue = new ArrayDeque<>();
		queue.add(startBoard);
		while(!queue.isEmpty()) {
			RectangleBoard board = queue.pollFirst();
			if(board.equals(endBoard)) {
				return board.getStep();
			}
			queue.addLast(board.getRoll(0));
			queue.addLast(board.getRoll(1));
		}
		return -1;
	}
	
	public int getMinimumStep() {
		return BFS();
	}
	
}
