package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("DATA.in"));
		String str = "";
		while(!(str = scn.nextLine()).equals("END")) {
			StringTokenizer stk = new StringTokenizer(str);
			StringBuilder sbd = new StringBuilder();
			while(stk.hasMoreTokens()) {
				String token = stk.nextToken();
				sbd.append(Character.toUpperCase(token.charAt(0)));
				sbd.append(token.substring(1).toLowerCase());
				sbd.append(" ");
			}
			System.out.println(sbd.toString().trim());
		}
	}
}
//j07021_chuan_hoa_xau_ho_ten_trong_file