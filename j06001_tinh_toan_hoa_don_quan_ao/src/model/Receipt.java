package model;

public class Receipt {
	private String id;
	private String name;
	private int numberOfProduct;
	private long discount;
	private long totalPayment;
	
	public Receipt(String id, String name, int numberOfProduct, long discount, long totalPayment) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfProduct = numberOfProduct;
		this.discount = discount;
		this.totalPayment = totalPayment;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + discount + " " + totalPayment; 
	}
}
