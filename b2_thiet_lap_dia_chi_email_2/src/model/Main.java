package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static String standardName(String name) {
		Scanner scn = new Scanner(name);
		String str = "";
		while(scn.hasNext()) {
			String s = scn.next();
			str += s + " ";
		}
		scn.close();
		return str;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inp = new Scanner(new File("DANHSACH.in"));
		List<Email> eList = new ArrayList<>();
		HashSet<String> st = new HashSet<>();
		while(inp.hasNextLine()) {
			String name = standardName(inp.nextLine().toLowerCase());
			if(!st.contains(name)) {
				st.add(name);
				eList.add(new Email(name));
			}
		}
		for(Email e : eList) {
			System.out.println(e);
		}
	}
}
