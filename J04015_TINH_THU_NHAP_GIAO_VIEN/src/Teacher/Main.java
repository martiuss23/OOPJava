package Teacher;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ID, name;
		int bsSalary;
		ID = scanner.nextLine();
		name = scanner.nextLine();
		bsSalary = scanner.nextInt();
		Teacher tc = new Teacher(ID, name, bsSalary);
		System.out.println(tc.toString());
		
	}
}
