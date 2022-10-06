package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, NumberFormatException, ParseException {
		Scanner fileInput = new Scanner(new File("KHACHHANG.in"));
		int amount = Integer.parseInt(fileInput.nextLine());
		ArrayList<Receipt> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			Scanner scn = new Scanner(fileInput.nextLine());
			String name = "";
			while(scn.hasNext()) {
				String token = scn.next();
				name += Character.toUpperCase(token.charAt(0)) + token.substring(1).toLowerCase() + " ";
			}
			scn.close();
			list.add(new Receipt(String.format("%02d", i), name.trim(), fileInput.nextLine(), fileInput.nextLine(),fileInput.nextLine(), Integer.parseInt(fileInput.nextLine())));
		}
		fileInput.close();
		Collections.sort(list);
		list.forEach(((receipt)->System.out.println(receipt)));
	}
}
