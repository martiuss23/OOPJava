package mon_hoc;

public class Subject implements Comparable<Subject>{
	private String ID;
	private String name;
	private String examFormat;
	
	public Subject(String iD, String name, String examFormat) {
		ID = iD;
		this.name = name;
		this.examFormat = examFormat;
	}

	
	public int compareTo(Subject o) {
		return this.ID.compareTo(o.ID);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID + " " + name + " " + examFormat;
	}
	
	
}
