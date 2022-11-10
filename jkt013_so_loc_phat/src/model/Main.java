package model;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void generate68(int size) {
		Stack<String> stk = new Stack<>();
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("6");
		queue.add("8");
		while(!queue.isEmpty()) {
			String nb = queue.poll();
			stk.push(nb);
			if(nb.length() < size) {
				queue.add(nb + '6');
				queue.add(nb + '8');
			}
		}
		System.out.println(stk.size());
		while(!stk.isEmpty()) {
			System.out.print(stk.pop() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			generate68(scn.nextInt());
		}
	}
}
