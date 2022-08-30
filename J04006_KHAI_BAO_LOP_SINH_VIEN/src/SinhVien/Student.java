package SinhVien;


public class Student {
	private String ID;
	private String name;
	private String stdClass;
	private String birthDay;
	private float  gpa;
	
	public Student() {
	}

	public Student(String name,String stdClass, String birthDay, float gpa) {
		ID = "B20DCCN001";
		this.name = name;
		this.stdClass = stdClass;
		this.birthDay = birthDay;
		this.gpa = gpa;
	}
	
	
	public String toString() {
		return ID + " " + name + " " +stdClass+ " " + birthDay + " " + String.format("%.2f", gpa);
	}
	
}
