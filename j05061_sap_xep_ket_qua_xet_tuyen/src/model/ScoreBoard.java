package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreBoard {
	private List<Candidate> candidates;

	public ScoreBoard() {
		candidates = new ArrayList<>();
	}
	
	public void addCandidate(Candidate candidate) {
		candidates.add(candidate);
	}
	
	public void sortByRatingScore(boolean des) {
		this.sort(new Comparator<Candidate>() {

			@Override
			public int compare(Candidate o1, Candidate o2) {
				// TODO Auto-generated method stub
				if(o1.getRatingScore() > o2.getRatingScore()) return -1;
				return 1;
			}
		});
	}
	
	public void sortByRatingScore() {
		this.sort(new Comparator<Candidate>() {

			@Override
			public int compare(Candidate o1, Candidate o2) {
				// TODO Auto-generated method stub
				if(o1.getRatingScore() < o2.getRatingScore()) return -1;
				return 1;
			}
		});
	}
	
	private <T> void sort(Comparator<T> cprt) {
		candidates.sort((Comparator<? super Candidate>) cprt);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		candidates.forEach((candidate)->{sbd.append(candidate + "\n");});
		return sbd.toString();
	}
	
	
}
