package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chart {
	private List<Athlete> athletes;
	
	public Chart() {
		athletes = new ArrayList<>();
	}
	
	public void add(Athlete athlete) {
		athletes.add(athlete);
	}
	
	public void update() throws ParseException {
		setRank();
	}
	
	public void sortByID() {
		Collections.sort(athletes, new Comparator<Athlete>() {
			@Override
			public int compare(Athlete o1, Athlete o2) {
				return o1.getID().compareTo(o2.getID());
			}
		});
	}
	
	public void sortByAchivement() {
		Collections.sort(athletes, new Comparator<Athlete>() {
			@Override
			public int compare(Athlete o1, Athlete o2) {
				try {
					return o1.getFinalResult().compareTo(o2.getFinalResult());
				} catch (ParseException e) {
				
				}
				return 0;
			}
		});
	}
	
	private void setRank() throws ParseException {
		int rank = 1;
		athletes.get(0).setRank(1);
		for(int i = 1; i < athletes.size(); i++) {
			if(!athletes.get(i).getFinalResult().equals(athletes.get(i-1).getFinalResult())) {
				rank = i + 1;
			}
			athletes.get(i).setRank(rank);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		athletes.forEach((athlete)->{
			sbd.append(athlete + "\n");
		});
		return sbd.toString().trim();
	}
	
}
