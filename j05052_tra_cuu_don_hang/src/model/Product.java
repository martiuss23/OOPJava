package model;

public class Product {
	private String name;
	private String id;
	private long unitPrice;
	private int quantity;
	
	public Product(String name, String id, long unitPrice, int quantity) {
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public char getType() {
		return id.charAt(id.length() - 1);
	}
	
	
	public String getNumericalOrder() {
		return id.substring(1, 4);
	}
	
	public long getDiscount() {
		if(getType() == '1') return (long)(unitPrice * quantity * 0.5);
		return (long)(unitPrice * quantity * 0.3); 
	}
	
	public long intoMoney() {
		return unitPrice *  quantity - getDiscount();
	}
	
	
	@Override
	public String toString() {
		return name + " " + id + " " + getNumericalOrder() + " " + getDiscount() + " " + intoMoney();
	}
}
