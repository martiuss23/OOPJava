package model;

public class Pair <K, V>{
	private K key;
	private V val;
	public Pair(K k, V v) {
		this.key = k;
		this.val = v;
	}
	public K getKey() {
		return key;
	}
	public V getVal() {
		return val;
	}
	
	
}
