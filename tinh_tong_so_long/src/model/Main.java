package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("DATA.in"));
		long res = 0;
		while(scn.hasNext()) {
			String token = scn.next();
			try {
				int val = Integer.parseInt(token);
			} catch (NumberFormatException e) {
				try {
					long val = Long.parseLong(token);
					res += val;
				} catch (NumberFormatException e2) {
					
				}
				
			}
		}
		System.out.println(res);
	}
}
