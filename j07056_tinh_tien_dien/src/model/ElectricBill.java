package model;

import java.util.Scanner;

public class ElectricBill implements Comparable<ElectricBill>{
	private String id;
	private String name;
	private String type;
	private int start;
	private int end;
	
	public ElectricBill(String id, String name, String type, int start, int end) {
		this.id = "KH" + id;
		this.name = standardName(name);
		this.type = type;
		this.start = start;
		this.end = end;
	}
	
	private static String standardName(String name) {
		Scanner scn = new Scanner(name);
		StringBuilder sbd = new StringBuilder();
		while(scn.hasNext()) {
			String token = scn.next();
			sbd.append(Character.toUpperCase(token.charAt(0)) + token.substring(1).toLowerCase());
			sbd.append(" ");
		}
		return sbd.toString().trim();
	}
	
	
	public long getNorm() {
		return (long)Math.min(end - start, getTypeElectric()) * 450;
	}
	
	public long getBeyondNorm() {
		return (long)Math.max(end-start - getTypeElectric(), 0) * 1000;
	}
	
	public long getVAT() {
		return  getBeyondNorm()/20;
	}
	
	public long getTotalPayment() {
		return getNorm() + getBeyondNorm() + getVAT();
	}
	
	public int getTypeElectric() {
		if(type.equals("A")) return 100;
		if(type.equals("B")) return 500;
		return 200;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getNorm() + " " + getBeyondNorm() + " " + getVAT() + " " + getTotalPayment();
	}

	@Override
	public int compareTo(ElectricBill o) {
		long thisTotalPayment = this.getTotalPayment();
		long oTotalPayment = o.getTotalPayment();
		if(thisTotalPayment > oTotalPayment) return -1;
		if(thisTotalPayment < oTotalPayment) return 1;
		return 0;
	}
	
	
}
