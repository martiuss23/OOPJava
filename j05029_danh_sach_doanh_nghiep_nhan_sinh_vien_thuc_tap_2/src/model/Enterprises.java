package model;

import java.util.ArrayList;
import java.util.Collections;

public class Enterprises {
	private ArrayList<Enterprise> list;
	
	public Enterprises() {
		list = new ArrayList<>();
	}
	
	public void add(Enterprise etp) {
		list.add(etp);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public Enterprises searchAboutNumberOfIntern(int start, int end) {
		Enterprises result = new Enterprises();
		list.forEach((enterprise)->{if(enterprise.getNumberOfIntern() >= start && enterprise.getNumberOfIntern() <= end) 
				result.list.add(enterprise); });
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		list.forEach((enterprise)->sbd.append(enterprise + "\n"));
		return sbd.toString().trim();
	}
}

