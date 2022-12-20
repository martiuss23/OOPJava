package vn.edu.ptit;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private Student student;
	private List<Subject> subjects;
	private Rule rule;
	
	public Invoice(Student student, List<Subject> subjects, Rule rule) {
		this.student = student;
		this.subjects = subjects;
		this.rule = rule;
	}
	
	private double getTotalCost() {
		int singleCost = rule.getCost();
		long totalCost = 0;
		for(Subject subject : subjects) {
			totalCost += subject.getCredits() * singleCost;
 		}
		return totalCost;
	}
	
	public double getAmount() {
		return getTotalCost();
	}
	
	public Student getSt() {
		return student;
	}
	
		
	public List<Subject> getAlSubject(){
		return subjects;
	}
	
	public Rule getRule() {
		return rule;
	}
	
}
