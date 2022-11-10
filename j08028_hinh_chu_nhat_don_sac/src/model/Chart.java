package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Chart {
	private List<Integer> chart;
	
	public Chart(List<Integer> chart) {
		this.chart = chart;
	}
	
	private int getTopStack(Stack<Integer> stk, int index) {
		while(!stk.isEmpty() && chart.get(stk.peek()) >= chart.get(index)) {
			stk.pop();
		}
		if(stk.isEmpty()) {
			return -1;
		}
		return stk.peek();
	}
	
	private int[] firstLeftSmaller(){
		Stack<Integer> stk = new Stack<>();
		int[] firstLeft = new int[chart.size()];
		firstLeft[0] = -1;
		stk.push(0);
		for(int i = 1; i < chart.size(); i++) {
			firstLeft[i] = getTopStack(stk, i);
			stk.push(i);
		}
		return firstLeft;
	}
	
	private int[] firstRightSmaller(){
		Stack<Integer> stk = new Stack<>();
		int[] firstRight = new int[chart.size()];
		firstRight[chart.size() - 1] = chart.size();
		stk.push(chart.size() - 1);
		for(int i = chart.size() - 2; i >= 0; i--) {
			firstRight[i] = getTopStack(stk, i);
			if(firstRight[i] == -1) firstRight[i] = chart.size();
			stk.push(i);
		}
		return firstRight;
	}
	
	public long getMaxArea() {
		int[] firstLeft = firstLeftSmaller();
		int[] firstRight = firstRightSmaller();
		long maxArea = 0;
		for(int i = 0; i < chart.size(); i++) {
			maxArea = Math.max(maxArea, (long)(firstRight[i] - firstLeft[i] - 1) * chart.get(i));
		}
		return maxArea;
	}
}
