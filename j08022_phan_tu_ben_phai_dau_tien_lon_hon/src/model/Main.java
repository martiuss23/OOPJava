package model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void firstGreaterRight(Stack<Integer> ip) {
		Stack<Integer> stk = new Stack<>();
		Stack<Integer> result = new Stack<>();
		while(!ip.isEmpty()) {
			int nb = ip.pop();
			while(!stk.isEmpty() && stk.peek() <= nb ) stk.pop();
			if(stk.isEmpty()) result.push(-1);
			else {
				result.push(stk.peek());			
			}
			stk.push(nb);
		}
		while(!result.isEmpty()) {
			System.out.print(result.pop() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			Stack<Integer>  stk = new Stack<>();
			int size = scn.nextInt();
			for(int i = 0; i < size; i++) {
				stk.push(scn.nextInt());
			}
			firstGreaterRight(stk);
		}
	}
}
