package ThiSinh;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id = scn.nextLine();
		String name = scn.nextLine();
		float ex1, ex2, ex3;
		ex1 = scn.nextFloat();
		ex2 = scn.nextFloat();
		ex3 = scn.nextFloat();
		Examinee ps = new Examinee(id, name, new SubjectExam("Toan", ex1), new SubjectExam("Ly", ex2), new SubjectExam("Hoa", ex3));
		System.out.println(ps);
	}
}
