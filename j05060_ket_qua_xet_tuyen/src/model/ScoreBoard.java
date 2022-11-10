package model;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
	private List<Candidate> candidates;

	public ScoreBoard() {
		candidates = new ArrayList<>();
	}
	
	public void addCandidate(Candidate candidate) {
		candidates.add(candidate);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		candidates.forEach((candidate)->{sbd.append(candidate + "\n");});
		return sbd.toString();
	}
	
	
}
