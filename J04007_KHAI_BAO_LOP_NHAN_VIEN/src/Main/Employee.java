package Main;

public class Employee {
	private String id;
	private String name;
	private String gender;
	private String birthDay;
	private String address;
	private String taxID;
	private String finalizedDay;

	public Employee() {
	}

	public Employee(String id, String name, String gender, String birthDay, String address, String taxID,
			String finalizedDay) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.address = address;
		this.taxID = taxID;
		this.finalizedDay = finalizedDay;
	}
	
	public String toString() {
		return id + " " + name + " " + gender + " " + birthDay + " " + address + " " + taxID + " " + finalizedDay;
	}
	
}
