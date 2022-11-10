package model;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	public static void BFS(int number) {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("9");
		while(!queue.isEmpty()) {
			String nb = queue.poll();
			if(Long.parseLong(nb) % number == 0) {
				System.out.println(nb);
				return;
			}
			queue.add(nb + "0");
			queue.add(nb + "9");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int number = scn.nextInt();
			BFS(number);
		}
	}
}
