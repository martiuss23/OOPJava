package model;

public class Bill {
	private static int counter = 1;
	private String id;
	private Customer customer;
	private Product product;
	private int amount;
	
	Bill(Customer customer, Product product, int amount) {
		id = String.format("HD%03d", counter++);
		this.customer = customer;
		this.product = product;
		this.amount = amount;
	}
	
	long getCost() {
		return (long)product.getPrice() * amount;
	}
	
	@Override
	public String toString() {
		return id + " " + customer + " " + product + " " + amount + " " + getCost();
	}
	
}
