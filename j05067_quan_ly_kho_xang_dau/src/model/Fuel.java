package model;


public class Fuel {
	private String manufacturerID;
	protected long unitPrice;
	protected double tax;
	
	public Fuel(String manufacturerID) {
		this.manufacturerID = manufacturerID;
		this.unitPrice = 0;
		this.tax = 0;
	}

	private boolean isLocalProduct() {
		if(manufacturerID.endsWith("TN")) return true;
		return false;
	}
	
	double getTax() {
		if(isLocalProduct()) {
			tax = 0;
		}
		return tax;
	}
	
	long getUnitPrice() {
		return unitPrice;
	}
	
	String getManufacturerName() {
		if(isLocalProduct()) return "Trong Nuoc";
		if(manufacturerID.endsWith("BP")) return "British Petro";
		if(manufacturerID.endsWith("ES")) return "Esso";
		if(manufacturerID.endsWith("SH")) return "Shell";
		if(manufacturerID.endsWith("CA")) return "Castrol";
		return "Mobil";
	}
	
	
}
