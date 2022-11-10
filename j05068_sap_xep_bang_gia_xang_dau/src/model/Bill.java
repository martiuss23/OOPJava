package model;

public class Bill implements Comparable<Bill>{
	private String bID;
	private Fuel fuel;
	private int quantity;
	
	Bill(String bID, int quantity){
		this.bID = bID;
		if(bID.startsWith("N")) fuel = new Viscous(bID);
		else if(bID.startsWith("D")) fuel = new Oil(bID);
		else fuel = new Gas(bID);
		this.quantity = quantity;
		
	}
	
	private long getRowCost() {
		return fuel.getUnitPrice() * quantity;
	}
	
	private long getTotal() {
		return (long) (getRowCost() + getTaxCost());
	}
	
	private long getTaxCost() {
		return (long) (getRowCost() * fuel.getTax());
	}
	
	@Override
	public String toString() {
		return bID + " " + fuel.getManufacturerName() + " " + fuel.getUnitPrice() + " " + getTaxCost() + " " + getTotal() ;
	}


	@Override
	public int compareTo(Bill o) {
		if(this.getTotal() < o.getTotal()) return 1;
		return -1;
	}
}
