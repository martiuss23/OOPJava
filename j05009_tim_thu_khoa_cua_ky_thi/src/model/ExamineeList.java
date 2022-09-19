package model;

import java.util.ArrayList;
import java.util.Collections;

public class ExamineeList {
	private ArrayList<Examinee> list;
	
	public ExamineeList() {
		list = new ArrayList<>();
	}
	
	public void add(Examinee exm) {
		list.add(exm);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void showBestScore() {
		this.sort();
		double bestScore = list.get(0).getTotalScore();
		int index = 0;
		while(index < list.size()) {
			Examinee exm = list.get(index);
			if(exm.getTotalScore() == bestScore) {
				System.out.println(exm);
				index++;
			}
			else break;
		}
	}
	
}
