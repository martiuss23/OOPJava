package model;

public class Product {
	private static int counter = 1;
	private String id;
	private String name;
	private String unit;
	private int cost;
	private int price;
	
	public Product(String name, String unit, int cost, int price) {
		id = String.format("MH%03d", counter++);
		this.name = name;
		this.unit = unit;
		this.cost = cost;
		this.price = price;
	}
	
	
	
	long getPrice() {
		return price;
	}
	
	long getCost() {
		return cost;
	}
	
	String getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return name ;
	}
	
}
