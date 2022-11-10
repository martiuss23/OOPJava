package model;

public class Match implements Comparable<Match> {
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

	@Override
	public int compareTo(Match o) {
		if(getTurnover() < o.getTurnover()) return 1;
		if(getTurnover() > o.getTurnover()) return -1;
		return clb.getName().compareTo(o.clb.getName());
	}
	
}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000