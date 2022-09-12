package ThiSinh;

public class Examinee {
	private String ID;
	private String name;
	private float prioritiesPoint; 
	private SubjectExam ex1;
	private SubjectExam ex2;
	private SubjectExam ex3;
	private float totalScore;
	private String status;
	
	public Examinee(String iD, String name, SubjectExam ex1, SubjectExam ex2, SubjectExam ex3) {
		ID = iD;
		this.name = name;
		this.ex1 = ex1;
		this.ex2 = ex2;
		this.ex3 = ex3;
		this.calcPrioritiesPoint();
		this.calcTotalScore();
		this.updateStatus();
	}
	
	private void calcTotalScore() {
		this.totalScore = ex1.getScore()*2 + ex2.getScore() + ex3.getScore();
	}
	
	private void calcPrioritiesPoint() {
		if(ID.startsWith(ExamineeConstants.KV1)) {
			prioritiesPoint = ExamineeConstants.SCORE_KV1;
		}
		else if(ID.startsWith(ExamineeConstants.KV2)) {
			prioritiesPoint = ExamineeConstants.SCORE_KV2;
		}
		else prioritiesPoint = ExamineeConstants.SCORE_KV3;
	}
	
	private void updateStatus() {
		if(this.totalScore + this.prioritiesPoint >= ExamineeConstants.SMALESS_SCORE) {
			status = ExamineeConstants.PASS;
		}
		else status = ExamineeConstants.FAIL;
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + ((prioritiesPoint - (int)prioritiesPoint == 0)?(int)prioritiesPoint:String.format("%.1f", prioritiesPoint)) 
				+ " " + ((totalScore - (int)totalScore == 0)?(int)totalScore:String.format("%.1f", totalScore)) + " " + status ;
	}
	
}
