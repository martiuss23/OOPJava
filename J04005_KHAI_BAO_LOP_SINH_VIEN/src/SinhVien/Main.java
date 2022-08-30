package SinhVien;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, birthDay;
		float score1, score2, score3;
		name = scanner.nextLine();
		birthDay = scanner.next();
		score1 = scanner.nextFloat();
		score2 = scanner.nextFloat();
		score3 = scanner.nextFloat();
		Student std = new Student(name, birthDay, score1, score2, score3);
		System.out.println(std);
	}
}
