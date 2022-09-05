package Teacher;

public class Teacher {
	private String ID;
	private String name;
	private int salary;
	private int hierSalary;
	private int allowance;
	
	public Teacher(String iD, String name, int salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.calcAllowance();
		this.calcHierSalary();
	}
	
	private void calcAllowance() {
		allowance = 500000;
		if(ID.startsWith("HT")) {
			allowance = 2000000;
		}
		else if(ID.startsWith("HP")) {
			allowance = 900000;
		}
	}
	
	private void calcHierSalary() {
		hierSalary = Integer.parseInt(ID.substring(2));
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + hierSalary +" " + allowance + " " + (salary*hierSalary + allowance);
	}
}
