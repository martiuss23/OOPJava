package model;

public class Gas extends Fuel{

	public Gas(String manufacturerID) {
		super(manufacturerID);
		this.unitPrice = 128000;
		this.tax = 0.03;
	}

	

}
