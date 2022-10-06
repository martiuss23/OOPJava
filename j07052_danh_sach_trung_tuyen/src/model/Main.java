package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileInput = new Scanner(new File("THISINH.in"));
		int amount = Integer.parseInt(fileInput.nextLine());
		ArrayList<Examinee> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			String id = fileInput.nextLine();
			Scanner scn = new Scanner(fileInput.nextLine());
			String name = "";
			while(scn.hasNext()) {
				String token = scn.next();
				name += Character.toUpperCase(token.charAt(0)) + token.substring(1).toLowerCase() + " ";
			}
			scn.close();
			list.add(new Examinee(id, name.trim(), Double.parseDouble(fileInput.nextLine()), Double.parseDouble(fileInput.nextLine()), Double.parseDouble(fileInput.nextLine()) ));
		}
		Collections.sort(list);
		int chiTieu = fileInput.nextInt();
		ExamineeConstants.setSmall(list.get(chiTieu - 1).getTotalScore());
		System.out.println(list.get(chiTieu - 1).getTotalScore());
		list.forEach((examinee)->System.out.println(examinee));
	}
}
