package model;

public class Principle extends Teacher {

	public Principle(String id, String name, int salary) {
		super(id, name, salary);
	}
	
	protected int getAllowance(){
		return 2000000;
	}

}
