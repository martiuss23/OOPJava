package model;

public class Pair<K, V> {
	private K k;
	private V v;
	public Pair(K k, V v) {
		this.k = k;
		this.v = v;
	}

	@Override
	public String toString() {
		return "(" + k +  "," + v + ")";
	}
}
