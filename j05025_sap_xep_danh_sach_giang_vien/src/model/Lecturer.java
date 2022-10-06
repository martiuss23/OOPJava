package model;

public class Lecturer implements Comparable<Lecturer> {
	private String id;
	private String firstName;
	private String lastName;
	private String fields;
	
	public Lecturer(int id, String firstName, String lastName, String fields) {
		this.id = "GV" + String.format("%02d", id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.fields = fields;
	}

	@Override
	public int compareTo(Lecturer o) {
		int cmp = lastName.compareTo(o.lastName);
		if(cmp == 0)
			return id.compareTo(o.id);
		return cmp;
	}
	
	@Override
	public String toString() {
		return id + " " + (firstName.equals("")?"":firstName + " ") + lastName + " " + fields;
	}
	
}
