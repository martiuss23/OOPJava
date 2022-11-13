package model;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	static boolean isAbracket(Character op, Character cl) {
		if(op == '(' && cl == ')') return true;
		if(op == '[' && cl == ']') return true;
		if(op == '{' && cl == '}') return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test-->0) {
			Stack<Character> stk = new Stack<>();
			String line = scn.nextLine();
			boolean ok = true;
			for(Character chr : line.toCharArray()) {
				if(chr == '[' || chr == '{' || chr == '(') {
					stk.push(chr);
				}
				else if(chr == ']' || chr == '}' || chr ==')') {
					if(stk.isEmpty()||!isAbracket(stk.pop(), chr)) {
						ok = false;
						break;
					}
					
				}
			}
			if(!stk.isEmpty()) ok = false;
			System.out.println(ok);
		}
	}
}
