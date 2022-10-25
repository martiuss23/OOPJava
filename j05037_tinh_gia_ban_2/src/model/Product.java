package model;

public class Product implements Comparable<Product> {
	private static int counter = 1;
	private String id;
	private String name;
	private String unit;
	private double cost;
	private long amount;
	
	public Product(String name, String unit, double cost, int amount) {
		this.id = "MH" + String.format("%02d", counter++);
		this.name = name;
		this.unit = unit;
		this.cost = cost;
		this.amount = amount;
	}
	
	public double getRawCost() {
		return cost * amount ;
	}
	
	public long getTransportFee() {
		return Math.round(getRawCost() * 0.05f );
	}
	
	public long intoMoney() {
		return Math.round(getRawCost() + getTransportFee());
	}
	
	public long getPriceForEach() {
		return (long) Math.ceil( intoMoney()*(1.02)/(amount*100) )*100;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + unit + " " + getTransportFee() + " " + 
				intoMoney() + " " + getPriceForEach();
	}

	@Override
	public int compareTo(Product o) {
		if(getPriceForEach() < o.getPriceForEach()) return 1;
		return -1;
	}
	
}
