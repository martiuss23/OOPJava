package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inp = new Scanner(new File("MONHOC.in"));
		List<Subject> sList = new ArrayList<>();
		HashSet<String> setId = new HashSet<>();
		while(inp.hasNextLine()) {
			String id = inp.nextLine();
			String name = inp.nextLine();
			String type = inp.nextLine();
			if(!setId.contains(id.trim())) {
				setId.add(id.trim());
				sList.add(new Subject(id.trim(), name.trim(), type.trim()));
			}
		}
		Collections.sort(sList);
		for(Subject s : sList) {
			System.out.println(s);
		}
	}
}
