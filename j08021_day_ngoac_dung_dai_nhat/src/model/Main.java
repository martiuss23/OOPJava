package model;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static int countCorrectBracket(String line) {
		Stack<Integer> stk = new Stack<>();
		stk.push(-1);
		int maxCorrect = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '(') stk.push(i);
			else {
				if(stk.size() == 1 || line.charAt(stk.peek()) == ')') stk.push(i);
				else {
					stk.pop();
					maxCorrect = Math.max(i - stk.peek() , maxCorrect);
				}
			}
		}
		return maxCorrect;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test-- > 0) {
			System.out.println(countCorrectBracket(scn.nextLine()));
		}
	}
}
