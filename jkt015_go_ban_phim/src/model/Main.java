package model;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void typeKeyBoard(String line) {
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '<') {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			}
			else if(line.charAt(i) == '>') {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			}
			else if(line.charAt(i) == '-') {
				if(!left.isEmpty()) {
					left.pop();
				}
			}
			else left.push(line.charAt(i) +"");
		}
		while(!right.isEmpty()) {
			left.push(right.pop());
		}
		StringBuilder sbd = new StringBuilder();
		while(!left.isEmpty()) {
			sbd.append(left.pop());
		}
		System.out.println(sbd.reverse().toString());
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		typeKeyBoard(scn.nextLine().trim());
	}
}
