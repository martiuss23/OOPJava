package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.next());
		while(test-->0) {
			String start = scn.next();
			String end = scn.next();
			board.setPosition(start, end);
			System.out.println(board.countStep());
		}
		
	}
}
