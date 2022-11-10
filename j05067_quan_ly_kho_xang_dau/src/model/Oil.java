package model;

public class Oil extends Fuel{

	public Oil(String manufacturerID) {
		super(manufacturerID);
		this.unitPrice = 11200;
		this.tax = 0.035;
		
	}

}
