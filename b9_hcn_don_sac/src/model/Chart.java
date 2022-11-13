package model;

import java.util.List;
import java.util.Stack;

public class Chart {
	private int w;
	private List<Integer> ls;
	
	public Chart(int w, List<Integer> ls) {
		this.w = w;
		this.ls = ls;
	}
	
	private Integer[] getLeft(){
		Stack<Integer> stk = new Stack<>();
		Integer[] leftList = new Integer[w];
		leftList[0] = -1;
		stk.push(0);
		for(int i = 1; i < w; i++) {
			while(!stk.isEmpty() && ls.get(i) <= ls.get(stk.peek())) {
				stk.pop();
			}
			if(stk.isEmpty()) leftList[i] = -1;
			else leftList[i] = stk.peek();
			stk.push(i);
		}
		return leftList;
	}
	
	private Integer[] getRight(){
		Stack<Integer> stk = new Stack<>();
		Integer[] rightList = new Integer[w];
		rightList[w-1] = w;
		stk.push(w-1);
		for(int i = w-2; i >= 0; i--) {
			while(!stk.isEmpty() && ls.get(i) <= ls.get(stk.peek())) {
				stk.pop();
			}
			if(stk.isEmpty()) rightList[i] = w;
			else rightList[i] = stk.peek();
			stk.push(i);
		}
		return rightList;
	}
	
	private long calculate() {
		Integer[] left = getLeft();
		Integer[] right = getRight();
		long mxArea = 0;
		for(int i = 0; i < w; i++) {
			mxArea = Math.max(mxArea, (long)(right[i] - left[i] - 1) *ls.get(i));
		}
		return mxArea;
	}
	
	public long getMaxArea() {
		return calculate();
	}
	
}
