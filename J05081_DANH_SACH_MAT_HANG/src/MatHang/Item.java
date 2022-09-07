package MatHang;

import java.util.ArrayList;

public class Item implements Comparable<Item>{
	public static int ct = 1;
	private String ID;
	private String name;
	private String unit;
	private int purchasePrice;
	private int price;
	private int interest;
	Item(){
		
	}
	
	public Item(String name, String unit, int purchasePrice, int price) {
		this.ID = "MH" + String.format("%03d", ct);
		this.name = name;
		this.unit = unit;
		this.purchasePrice = purchasePrice;
		this.price = price;
		this.interest = price-purchasePrice;
		ct++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID + " " + name + " " + unit + " " + purchasePrice + " " + price + " " + interest;
	}

	@Override
	public int compareTo(Item o) {
		if(this.interest < o.interest) return 1;
		if(this.interest > o.interest) return -1;
		return 0;
	}
	
}
