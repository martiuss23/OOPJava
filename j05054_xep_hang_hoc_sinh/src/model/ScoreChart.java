package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScoreChart {
	private List<Student> students;
	
	public ScoreChart() {
		students = new ArrayList<>();
	}
	
	public void add(Student std) {
		students.add(std);
	}
	
	public void update() {
		sortByAverage();
		setRank();
	}
	
	private void setRank() {
		int rank = 1;
		students.get(0).setRank(rank);
		for(int index = 1; index < students.size(); index++) {
			if(students.get(index).getAverage() != students.get(index - 1).getAverage()) {
				rank = index + 1;
			}
			students.get(index).setRank(rank);
		}
	}
	
	public void sortByID() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getID().compareTo(o2.getID());
			}
		});
	}
	
	public void sortByAverage() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getAverage() < o2.getAverage()) return 1;
				return -1;
			}
		
		});
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(int i = 0; i < students.size(); i++) {
			sbd.append(students.get(i) + "\n");
		}
		return sbd.toString().trim();
	}
	
}
