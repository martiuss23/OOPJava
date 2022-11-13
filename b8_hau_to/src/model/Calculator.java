package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	private List<String> operation; 
	
	public Calculator(String cal) {
		this.operation = new ArrayList<>();
		Scanner sc = new Scanner(cal);
		while(sc.hasNext()) {
			operation.add(sc.next());
		}
		sc.close();
	}
	
//	private long getVal(long bf, long at, String opr) {
//		
//	}
	
	private long cal() {
		Stack<Long> stk = new Stack<>();
		for(String s : operation) {
			if(s.equals("+") ||s.equals("-")||s.equals("*")||s.equals("+") ) {
				long at = stk.pop();
				long bf = stk.pop();
				long res = 0;
				if(s.trim().equals("+")) res = bf + at;
				else if(s.trim().equals("-")) res =  bf - at;
				else if(s.trim().equals("*")) res = bf * at;
				else res = bf / at;
				stk.push(res);
			}
			else {
				long nb = Long.parseLong(s);
				stk.push(nb);
			}
				
		}
		return stk.peek();
	}
	
	public long calculate() {
		return cal();
	}
}
//3
//7
//2 3 1 * + 9 –
//7
//8 7 5 * + 9 –
//3
//-10 -4 +
