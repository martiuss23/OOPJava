package model;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MyQueue {
	private ArrayDeque<Integer> queue;
	
	public MyQueue() {
		queue = new ArrayDeque<>();
	}
	
	private int BFS(int start, int end) {
		queue.add(start);
		int[] counter = new int[20001];
		Arrays.fill(counter, -1);
		counter[start] = 0;
		while(!queue.isEmpty()) {
			int nb = queue.pollFirst();
			if(nb == end) {
				return counter[nb];
			}
			if(nb <= 0) continue;
			if(nb - 1 < 20001 &&counter[nb-1] == -1) {
				counter[nb-1] = counter[nb] + 1;
				queue.addLast(nb-1);
			}
			if(nb * 2 < 20001 && counter[nb*2] == -1) {
				counter[nb*2] = counter[nb] + 1;
				queue.addLast(nb*2);
			}
		}
		return -1;
	}
	
	public int getMinStep(int start, int end) {
		return BFS(start, end);
	}
	
}
