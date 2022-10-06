package model;

public class Product implements Comparable<Product> {
	private String id;
	private String name;
	private String group;
	private double cost;
	private double salePrice;
	private double profit;
	
	
	public Product(String id, String name, String group, double cost, double salePrice) {
		this.id = "MH" + id;
		this.name = name;
		this.group = group;
		this.cost = cost;
		this.salePrice = salePrice;
		profit = salePrice - cost;
	}

	@Override
	public int compareTo(Product o) {
		if(profit < o.profit) return 1;
		if(profit > o.profit) return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + group + " " + String.format("%.2f", profit);
	}
	
	
	
}
