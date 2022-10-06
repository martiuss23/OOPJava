package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner scn = new Scanner(new File("XETTUYEN.in"));
		int amount = scn.nextInt();
		ArrayList<Candidate> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			list.add(new Candidate(String.format("%02d", i), scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble()));
		}
		list.forEach((candidate)->System.out.println(candidate));
	}
}
