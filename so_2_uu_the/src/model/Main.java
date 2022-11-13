package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		MyQueue q = new MyQueue();
		while(test-->0) {
			int n = scn.nextInt();
			q.show(n);
			System.out.println();
		}
	}
}
