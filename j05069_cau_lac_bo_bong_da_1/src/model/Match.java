package model;

public class Match {
	private String id;
	private CLB clb;
	private int fans;
	
	public Match(String id, int fans) {
		this.id = id;
		clb = CLB.getCLB(id.substring(1, 3));
		this.fans = fans;
	}
	
	private int getTurnover() {
		return clb.getFare() * fans;
	}
	
	@Override
	public String toString() {
		return id + " " + clb + " " + getTurnover();
	}
	
}
