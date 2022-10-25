package model;

public class Staff {
	private static int counter = 1;
	
	private String id;
	private String name;
	private String position;
	private long dailySalary;
	private int workingDays;
	
	public Staff(String name, String position, long dailySalary, int workingDays) {
		this.id = "NV" + String.format("%02d", counter++);
		this.name = name;
		this.position = position;
		this.dailySalary = dailySalary;
		this.workingDays = workingDays;
	}
	
	public int getAllowance() {
		if(position.equals("GD")) return 500;
		if(position.equals("PGD")) return 400;
		if(position.equals("TP")) return 300;
		if(position.equals("KT")) return 250;
		return 100;
	}
	
	public long getMonthlySalary() {
		return dailySalary * workingDays;
	}
	
	public long getRemain() {
		return getMonthlySalary() + getAllowance() - getAdvanceSalary();
	}
	
	public long getAdvanceSalary() {
		long advanceSalary = (long) ((Math.round((getMonthlySalary() + getAllowance())* 2 * 0.001/3 ))*1000);
		if(advanceSalary < 25000) return advanceSalary;
		return 25000;
	}
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + getAllowance() + " " + getMonthlySalary() + " " + getAdvanceSalary() + " " + getRemain();
	}
	
}
