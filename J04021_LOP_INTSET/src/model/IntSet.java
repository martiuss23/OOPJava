package model;

public class IntSet {
	private int[] table;
	
	public IntSet() {
		table = new int[1000];
	}
	
	public IntSet(int[] table) {
		this.table = new int[1000];
		for(Integer nb : table) {
			this.table[nb] = 1;
		}
	}
	
	public void add(int num) {
		table[num] = 1;
	}
	
	public IntSet union(IntSet secondIntSet) {
		return IntSet.union(this, secondIntSet);
	}
	
	private static IntSet union(IntSet first, IntSet second) {
		IntSet unionIntSet = new IntSet();
		for(int i = 0; i < 1000; i++) {
			if(first.table[i] == 1 || second.table[i] == 1) {
				unionIntSet.add(i);
			}
		}
		return unionIntSet;
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < 1000; i++) {
			if(table[i] == 1) {
				res.append(i + " ");
			}
		}
		return res.toString();
	}
}
