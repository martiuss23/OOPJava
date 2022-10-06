package model;

public class Enterprise implements Comparable<Enterprise> {
	private String id;
	private String name;
	private int numOfIntern;

	public Enterprise(String id, String name, int numOfIntern) {
		this.id = id;
		this.name = name;
		this.numOfIntern = numOfIntern;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + numOfIntern;
	}

	@Override
	public int compareTo(Enterprise o) {
		return id.compareTo(o.id);
	}
	
	
}
