package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			MyQueue queue = new MyQueue();
			System.out.println(queue.getMinStep(scn.nextInt(), scn.nextInt()));
		}
	}
}
