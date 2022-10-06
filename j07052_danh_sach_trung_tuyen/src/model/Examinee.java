package model;

public class Examinee implements Comparable<Examinee> {
	private String ID;
	private String name;
	private double prioritiesPoint; 
	private double ex1;
	private double ex2;
	private double ex3;
	private double totalScore;
	
	public Examinee(String iD, String name, double ex1, double ex2, double ex3) {
		ID = iD;
		this.name = name;
		this.ex1 = ex1;
		this.ex2 = ex2;
		this.ex3 = ex3;
		this.calcPrioritiesPoint();
		this.calcTotalScore();
	}
	
	private void calcTotalScore() {
		this.totalScore = ex1*2 + ex2 + ex3 + prioritiesPoint;
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
	
	private String getStatus() {
		if(this.totalScore + this.prioritiesPoint >= ExamineeConstants.SMALESS_SCORE) {
			return ExamineeConstants.PASS;
		}
		return ExamineeConstants.FAIL;
	}
	
	public double getTotalScore() {
		return totalScore;
	}
	
	@Override
	public String toString() {
		return ID + " " + name + " " + ((prioritiesPoint - (int)prioritiesPoint == 0)?(int)prioritiesPoint:String.format("%.1f", prioritiesPoint)) 
				+ " " + ((totalScore - (int)totalScore == 0)?(int)totalScore:String.format("%.1f", totalScore)) + " " + getStatus();
	}

	@Override
	public int compareTo(Examinee o) {
		if(totalScore > o.totalScore ) return -1;
		if(totalScore  < o.totalScore ) return 1;
		return ID.compareTo(o.ID);
	}
	
}
