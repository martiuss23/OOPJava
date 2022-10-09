package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("DANHSACH.in"));
		int amount = Integer.parseInt(fileIn.nextLine());
		List<Name> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Name(fileIn.nextLine().trim()));
		}
		Collections.sort(list);
		int Q = Integer.parseInt(fileIn.nextLine());
		for(int i = 1; i <= Q; i++) {
			String shortName = fileIn.nextLine().trim();
			list.forEach((name)->{
				if(name.similarTo(shortName)) 
					System.out.println(name);
			});
		}
	}
}
