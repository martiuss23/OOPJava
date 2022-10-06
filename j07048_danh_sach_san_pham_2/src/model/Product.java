package model;

public class Product implements Comparable<Product>{
	private String id;
	private String name;
	private int price;
	private int warrantyTime;
	
	public Product(String id, String name, int price, int warrantyTime) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.warrantyTime = warrantyTime;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + price + " " + warrantyTime;
	}


	@Override
	public int compareTo(Product o) {
		if(price > o.price) return -1;
		if(price < o.price) return 1;
		return id.compareTo(o.id);
	}
	
}
