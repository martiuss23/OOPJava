package model;

public class VicePrincipal extends Teacher {

	public VicePrincipal(String id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	protected int getAllowance() {
		return 900000;
	}
	
	
}
