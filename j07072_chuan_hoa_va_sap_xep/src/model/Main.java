package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileInput = new Scanner(new File("DANHSACH.in"));
		List<Name> list = new ArrayList<>();
		while(fileInput.hasNextLine()) {
			list.add(new Name(fileInput.nextLine()));
		}
		Collections.sort(list);
		list.forEach((name)->System.out.println(name));
	}
}
