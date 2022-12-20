package model;

import java.util.TreeSet;

public class IntSet extends TreeSet<Integer>{
	
	public IntSet() {
		super();
	}
	
	public IntSet(int[] a) {
		super();
		for(Integer nb: a) {
			this.add(nb);
		}
	}
	
	public IntSet intersection(IntSet o) {
		IntSet intersection = new IntSet();
		for(Integer nb: o) {
			if(this.contains(nb))
				intersection.add(nb);
		}
		return intersection;
	}
	
	@Override
	public String toString() {
		StringBuilder intSet = new StringBuilder();
		for(Integer nb: this)
			intSet.append(nb + " ");
		return intSet.toString().trim();
	}
}
