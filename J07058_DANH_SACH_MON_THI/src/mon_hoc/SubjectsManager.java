package mon_hoc;

import java.util.ArrayList;
import java.util.Collections;

public class SubjectsManager {
	private ArrayList<Subject> list;
	public SubjectsManager() {
		list = new ArrayList<>();
	}
	
	public void add(Subject sj) {
		list.add(sj);
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void show() {
		list.forEach((subject)->{System.out.println(subject);});
	}
	
}
