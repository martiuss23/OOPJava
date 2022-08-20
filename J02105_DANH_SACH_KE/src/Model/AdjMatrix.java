package Model;

import java.util.Scanner;

public class AdjMatrix {
	private int[][] adjMatrix;
	
	public AdjMatrix(int[][] grid) {
		adjMatrix = grid;
	}
	
	public void toEdgeList() {
		for(int i = 0; i < adjMatrix.length; i++) {
			for(int j = i; j < adjMatrix.length; j++) {
				if(adjMatrix[i][j]!= 0) {
					System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
				}
			}
		}
	}
	
	public void toAdjList() {
		for(int i = 0; i < adjMatrix.length; i++) {
			System.out.print("List(" + (i + 1) + ") = ");
			for(int j = 0; j < adjMatrix.length; j++) {
				if(adjMatrix[i][j]!= 0) {
					System.out.print((j + 1) + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();
			int[][] grid = new int[size][size];
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					grid[i][j] = scanner.nextInt();
				}
			}
			new AdjMatrix(grid).toAdjList();
		}
	}
}
