package model;

public class Product implements Comparable<Product>{
	private ID pid;
	private String name;
	private long amount;
	private long unitPrice;
	
	public Product(String name, long amount, long unitPrice) {
		this.pid = new ID(name);
		this.name = name;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}
	
	private double getDiscountPercent() {
		if(amount > 10) return 0.05f;
		if(amount >= 8) return 0.02f;
		if(amount >= 5) return 0.01f;
		return 0;
	}
	
	public long getDiscount() {
		return (long)Math.round(getRawCost() * getDiscountPercent());
	}
	
	public long getRawCost() {
		return unitPrice * amount;
	}
	
	public long getFinalCost() {
		return getRawCost() - getDiscount();
	}
	
	@Override
	public String toString() {
		return pid + " " + name + " " + getDiscount() + " " + getFinalCost();
	}

	@Override
	public int compareTo(Product o) {
		if(getDiscount() < o.getDiscount()) return 1;
		return -1;
	}
	
}
