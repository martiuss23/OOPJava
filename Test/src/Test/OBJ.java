package Test;

import java.util.ArrayList;

public class OBJ implements Comparable<OBJ> {
	
	private ArrayList<Integer> arr;
	
	public OBJ() {
		arr = new ArrayList<>();
	}
	
	public OBJ(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	public int compareTo(OBJ o) {
		if(this.arr.size() > o.arr.size()) {
			return 1;
		}
		else if(this.arr.size() < o.arr.size()) {
			return -1;
		}
		for(int i = 0; i < this.arr.size(); i++) {
			if(this.arr.get(i) < o.arr.get(i)) {
				return -1;
			}
			else if(this.arr.get(i) > o.arr.get(i)) {
				return 1;
			}
		}
		return 0;
	}

}
