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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] grid = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				grid[i][j] = scanner.nextInt();
			}
		}
		new AdjMatrix(grid).toEdgeList();
	}
}
