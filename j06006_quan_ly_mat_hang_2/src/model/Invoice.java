package model;

public class Invoice {
	private static int counter = 1;
	private String id;
	private Customer customer;
	private Product product;
	private int amount;
	
	
	public Invoice(Customer customer, Product product, int amount) {
		id = String.format("HD%03d", counter++);
		this.customer = customer;
		this.product = product;
		this.amount = amount;
	}
	
	long getTotal() {
		return (long)product.getPrice() * amount;
	}
	
	long getProfit() {
		return (long)(product.getPrice() - product.getCost())* amount;
	}
	
	
	@Override
	public String toString() {
		return id + " " + customer + " " + product + " " + amount + " " + getTotal() + " " + getProfit() ;
	}
	
}
