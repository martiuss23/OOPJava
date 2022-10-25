package model;

public class Goods implements Comparable<Goods> {
	private String id;
	private int importQuantity;
	
	public Goods(String id, int importQuantity) {
		this.id = id;
		this.importQuantity = importQuantity;
	}

	public String getId() {
		return id;
	}
	
	public int getExport() {
		if(id.startsWith("A")) return (int)Math.round(importQuantity * 0.6);
		return (int)Math.round(importQuantity * 0.7);
	}

	public int getUnitPrice() {
		if(id.endsWith("Y")) return 110000;
		return 135000;
	}
	
	public long getMoney() {
		return (long)getExport() * getUnitPrice();
	}
	
	public long getFee() {
		if(id.startsWith("A")) {
			if(id.endsWith("Y")) return (long)Math.round(getMoney() * 0.08);
			return (long)Math.round(getMoney() * 0.11);
		}
		if(id.endsWith("Y")) 
			return (long)Math.round(getMoney() * 0.17);
		return (long)Math.round(getMoney() * 0.22);
	}
	
	@Override
	public String toString() {
		return id + " " + importQuantity + " " + getExport() + " " + 
				getUnitPrice() + " " + getMoney() + " " + getFee();
	}

	@Override
	public int compareTo(Goods o) {
		if(getFee() > o.getFee()) return -1;
		if(getFee() < o.getFee()) return 1;
		return 0;
	}
	
}
