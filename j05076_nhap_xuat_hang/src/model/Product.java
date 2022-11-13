package model;

public class Product {
	private String id;
	private String name;
	private String type;
	
	public Product(String id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Product(Product product) {
		this.id = product.id;
		this.name = product.name;
		this.type = product.type;
	}
	
	String getId() {
		return id;
	}
	
	double getInterest() {
		if(type.equals("A")) return 0.08;
		if(type.equals("B")) return 0.05;
		return 0.02;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
}
