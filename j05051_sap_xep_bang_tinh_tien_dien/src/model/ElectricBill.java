package model;

import java.util.Scanner;

public class ElectricBill implements Comparable<ElectricBill>{
	private static int counter = 1;
	
	private String id;
	private String type;
	private int start;
	private int end;
	
	public ElectricBill(String type, int start, int end) {
		id = "KH" + String.format("%02d", counter++);
		this.type = type;
		this.start = start;
		this.end = end;
	}
	
	public int getCoefficient() {
		if(type.equals("KD")) return 3;
		if(type.equals("NN")) return 5;
		if(type.equals("TT")) return 4;
		if(type.equals("CN")) return 2;
		return 1;
	}
	
	public int getElectricUsed() {
		return end - start;
	}
	
	public long intoMoney() {
		return (long)getElectricUsed() * getCoefficient() * 550;
	}
	
	public long getExtraFee() {
		if(getElectricUsed() < 50) return 0;
		if(getElectricUsed() <= 100) return (long)(Math.round(intoMoney() * 35/100.0));
		return intoMoney();
	}
	
	public long getTotal() {
		return getExtraFee() + intoMoney();
	}
	
	@Override
	public String toString() {
		return id + " " + getCoefficient() + " " + intoMoney() + " " + getExtraFee() + " " + getTotal();
	}

	@Override
	public int compareTo(ElectricBill o) {
		if(getTotal() < o.getTotal()) return 1;
		if(getTotal() > o.getTotal()) return -1;
		return 0;
	}
	
}
