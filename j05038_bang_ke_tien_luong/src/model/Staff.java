package model;

public class Staff {
	private static int counter = 1;
	
	private String id;
	private String name;
	private int dailySalary;
	private int workingDays;
	private String position;
	
	public Staff(String name, int dailySalary, int workingDays, String position) {
		this.id = "NV" + String.format("%02d", counter++);
		this.name = name;
		this.dailySalary = dailySalary;
		this.workingDays = workingDays;
		this.position = position;
	}
	
	public long getMonthlySalary() {
		return (long) dailySalary * workingDays;
	}
	
	public long getAward() {
		if(workingDays >= 25) return (long) (getMonthlySalary()*0.2);
		if(workingDays >= 22) return (long) (getMonthlySalary()*0.1);
		return 0;
	}
	
	public long getAllowance() {
		if(position.equals("GD")) return 250000;
		if(position.equals("PGD")) return 200000;
		if(position.equals("TP")) return 180000;
		return 150000;
	}
	
	public long getTotal() {
		return getMonthlySalary() + getAward() + getAllowance();
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getMonthlySalary() + " " + getAward() + " " + getAllowance() + " " + getTotal();
	}
}
