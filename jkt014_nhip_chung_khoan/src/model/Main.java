package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void firstLeftGreater(List<Integer> numbers) {
		Stack<Integer> stk = new Stack<>();
		stk.push(-1);
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < numbers.size(); i++) {
			while(stk.size() > 1 && numbers.get(stk.peek()) <= numbers.get(i)) {
				stk.pop();
			}
			result.add(i - stk.peek());
			stk.push(i);
		}
		for(Integer nb : result) {
			System.out.print(nb + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int size = scn.nextInt();
			List<Integer> numbers = new ArrayList<>();
			for(int i = 0; i < size; i++) {
				numbers.add(scn.nextInt());
			}
			firstLeftGreater(numbers);
		}
	}
}
