package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Match> matches = new ArrayList<>();
		int amountOfCLB = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= amountOfCLB; i++) {
			new CLB(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
		}
		int amountOfMatches = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= amountOfMatches; i++) {
			matches.add(new Match(scn.next(), scn.nextInt()));
		}
		Collections.sort(matches);
		matches.forEach((match)->{System.out.println(match);});
	}
}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000