package SinhVien;


public class Student {
	private String name;
	private String birthDay;
	private float score1, score2, score3;
	
	public Student() {
	}

	public Student(String name, String birthDay, float score1, float score2, float score3) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public float totalScore() {
		return score1 + score2 + score3;
	}
	
	public String toString() {
		return name + " " + birthDay + " " + String.format("%.1f", this.totalScore());
	}
	
}
