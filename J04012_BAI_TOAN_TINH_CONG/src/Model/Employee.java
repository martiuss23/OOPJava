package Model;

public class Employee {
	private static int cntEmp = 0;
	
	private String ID;
	private String name;
	private int basicSalary;
	private int workingDay;
	private String position;
	private int allowance;
	private int bonus;
	private int salary;
	private int income;
	
	public Employee(String name, int basicSalary, int workingDay, String position) {
		cntEmp++;
		this.ID = ConstEmp.NV + String.format("%02d", cntEmp); 
		this.name = name;
		this.basicSalary = basicSalary;
		this.workingDay = workingDay;
		this.position = position;
		this.calcSalary();
		this.calcAllowance();
		this.calcBonus();
		this.calcIncome();
	}
	
	private void calcSalary() {
		this.salary = this.basicSalary * this.workingDay;
	}
	
	private void calcBonus() {
		if(workingDay >= 25) {
			bonus = (int) (salary * ConstEmp.WORKING_DAY_PERCENT_BIGGEST);
		}
		else if(workingDay >= 22) {
			bonus = (int)(salary * ConstEmp.WORKING_DAY_PERCENT_MEDIUM);
		}
		else
			bonus = (int)(salary * ConstEmp.WORKING_DAY_PERCENT_SMALLEST); 
	}
	
	private void calcAllowance() {
		if(position.equals(ConstEmp.GD)) {
			this.allowance = ConstEmp.GD_BONUS;
		}
		else if(position.equals(ConstEmp.PGD)) {
			this.allowance = ConstEmp.PGD_BONUS;
		}
		else if(position.equals(ConstEmp.TP)) {
			this.allowance = ConstEmp.TP_BONUS;
		}
		else {
			this.allowance = ConstEmp.NV_BONUS;
		}
	}
	
	private void calcIncome() {
		this.income = this.salary + this.allowance + this.bonus;
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + salary + " " + bonus + " " + allowance + " " + income;
	}
	
}

