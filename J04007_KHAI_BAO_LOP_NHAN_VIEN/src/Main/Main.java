package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, gender, birthDay, address, taxID, finalizedDay;
		name = scanner.nextLine();
		gender = scanner.nextLine();
		birthDay = scanner.nextLine();
		address = scanner.nextLine();
		taxID = scanner.nextLine();
		finalizedDay = scanner.nextLine();
		Employee ep = new Employee("00001", name, gender, birthDay, address, taxID, finalizedDay);
		System.out.println(ep.toString());
	}
}
