package model;

import java.util.Scanner;

public class LoaiPhong implements Comparable<LoaiPhong> {
	private String sign;
	private String type;
	private int price;
	private double serviceCharge;
	
	public LoaiPhong(String line) {
		Scanner scn = new Scanner(line);
		this.sign = scn.next();
		this.type = scn.next();
		this.price = scn.nextInt();
		this.serviceCharge = scn.nextDouble();
		scn.close();
	}
	
	@Override
	public String toString() {
		return sign + " " + type + " " + price + " " + String.format("%.2f", serviceCharge);
	}

	@Override
	public int compareTo(LoaiPhong o) {
		return type.compareTo(o.type);
	}
}
