package j03019_xau_con_lon_nhat;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Stack<Character> stk = new Stack<>();
		String line = scn.nextLine();
		for(int i = 0; i < line.length(); i++) {
			while(!stk.isEmpty() && line.charAt(i) > stk.peek()) {
				stk.pop();
			}
			stk.push(line.charAt(i));
		}
		stk.forEach((chr)->{System.out.print(chr);});
	}
}
