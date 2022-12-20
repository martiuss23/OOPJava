package controller;

import java.util.ArrayList;
import java.util.List;
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
		List<Subject> subjects = new ArrayList<>();
		int nbOfSubjects = Integer.parseInt(scn.nextLine());
		for(int i = 0; i < nbOfSubjects; i++)
			subjects.add(new Subject(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine())));
		Rule rule = new Rule(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
		Invoice invoice = new Invoice(student, subjects, rule);
		scn.close();
		return invoice;
	}

}
