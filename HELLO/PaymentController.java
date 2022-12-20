package controller;

import java.util.ArrayList;
import java.util.Scanner;

import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

public class PaymentController {

	public PaymentController() {
		
	}
	
	public Invoice getInvoice() {
		Scanner scn = new Scanner(System.in);
		Student student = new Student(scn.nextLine().trim(), scn.nextLine().trim());
		ArrayList<Subject> subjects = new ArrayList<>();
		int nbOfSubjects = Integer.parseInt(scn.nextLine());
		int totalCredit = 0;
		for(int i = 0; i < nbOfSubjects; i++) {
			Subject sub = new Subject(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
			subjects.add(sub);
			totalCredit += sub.getCredit();
		}
			
		Rule rule = new Rule(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
		Invoice invoice = new Invoice(rule);
		invoice.setSt(student);
		invoice.setAlSubject(subjects);
		invoice.setAmount(rule.getCreditPrice()*totalCredit);
		scn.close();
		return invoice;
	}

}
