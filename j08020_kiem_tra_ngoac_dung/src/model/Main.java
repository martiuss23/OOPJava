package model;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static boolean isOpenBracket(char c) {
		if(c == '[' || c == '(' || c == '{') return true;
		return false;
	}
	
	public static boolean isCoupleOfBracket(char pre, char end) {
		if(pre == '(' && end == ')') return true;
		if(pre == '[' && end == ']') return true;
		if(pre == '{' && end == '}') return true;
		return false;
	}
	
	public static boolean isCorrectBracket(String line) {
		Stack<Character> stk = new Stack<>();
		for(int i = 0; i < line.length(); i++) {
			if(isOpenBracket(line.charAt(i))) {
				stk.push(line.charAt(i));
			}
			else {
				if(stk.isEmpty() || !isCoupleOfBracket(stk.peek(), line.charAt(i))){
					return false;
				}
				stk.pop();
			}
		}
		if(!stk.isEmpty()) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test-- > 0) {
			System.out.println(isCorrectBracket(scn.nextLine())?"YES":"NO");
		}
	}
}
