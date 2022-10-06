package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("DATA.in"));
		ArrayList<String> ls = new ArrayList<>();
		while(scn.hasNext()) {
			String token = scn.next();
			try {
				int number = Integer.parseInt(token);
			}
			catch (NumberFormatException e) {
				ls.add(token);
			}
		}
		Collections.sort(ls);
		StringBuilder sbd = new StringBuilder();
		ls.forEach((token)->sbd.append(token + " "));
		System.out.println(sbd.toString().trim());
	}
}
//E:\\OOPJava\\j07022_loai_bo_so_nguyen\\src\\model\\