package model;

public class Teacher {
	private String id;
	private String name;
	private int salary;
	
	public Teacher(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	protected int getAllowance() {
		return 500000;
	}
	
	private int getWage() {
		return Integer.parseInt(id.substring(2));
	}
	
	private long getIncome() {
		return (long)salary * getWage() + getAllowance();
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + getWage() + " " + getAllowance() + " " + getIncome();
	}
	
}
