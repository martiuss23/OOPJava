package model;

public class Enterprise implements Comparable<Enterprise> {
	private String id;
	private String name;
	private int numberOfIntern;
	
	public Enterprise(String id, String name, int numberOfIntern) {
		this.id = id;
		this.name = name;
		this.numberOfIntern = numberOfIntern;
	}
	
	public int getNumberOfIntern() {
		return numberOfIntern;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + numberOfIntern;
	}

	@Override
	public int compareTo(Enterprise o) {
		if(numberOfIntern < o.numberOfIntern) return 1;
		if(numberOfIntern > o.numberOfIntern) return -1;
		return id.compareTo(o.id);
	}
}
