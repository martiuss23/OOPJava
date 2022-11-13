package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map.Entry;

public class MyQueue {
	private ArrayList<String> ls;
	public MyQueue() {
		ls = new ArrayList<>();
		generate();
	}
	
	private void generate() {
		ArrayDeque<Pair<String, Integer>> q = new ArrayDeque<>();
		q.addFirst(new Pair<String, Integer>("1", 0));
		q.addLast(new Pair<String, Integer>("2", 1));
		while(!q.isEmpty() && ls.size() <= 1000 ) {
			Pair<String, Integer> p = q.pollFirst();
			String k = p.getK();
			Integer v = p.getV();
			if(v > k.length()/2) {
				ls.add(k);
			}
			//if(ls.size() < 1000) {
			q.addLast(new Pair<String, Integer>(k + "0", v));
			q.addLast(new Pair<String, Integer>(k + "1", v));
			q.addLast(new Pair<String, Integer>(k + "2", v + 1));
			//}
			
		}
	}
	
	public void show(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(ls.get(i) + " ");
		}
	}
}
