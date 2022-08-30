package SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, stdClass, birthDay;
		float gpa;
		name = scanner.nextLine();
		stdClass = scanner.next();
		birthDay = scanner.next();
		gpa = scanner.nextFloat();
		SimpleDateFormat spfm = new SimpleDateFormat("dd/mm/yyyy");
		Date date;
		try {
			date = spfm.parse(birthDay);
			birthDay = spfm.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student std = new Student(name, stdClass, birthDay, gpa);
		System.out.println(std);
	}
}

