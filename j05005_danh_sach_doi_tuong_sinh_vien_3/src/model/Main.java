package model;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		StudentManagement manager = new StudentManagement();
		for(int i = 0; i < size; i++) {
			scn.nextLine();
			String name = scn.nextLine();
			StringTokenizer stkz = new StringTokenizer(name);
			StringBuilder sbd = new StringBuilder();
			while(stkz.hasMoreTokens()) {
				String token = stkz.nextToken();
				sbd.append(token.substring(0, 1).toUpperCase());
				sbd.append(token.substring(1, token.length()).toLowerCase());
				if(!stkz.hasMoreTokens()) break;
				sbd.append(' ');
			}
			manager.add(new Student(sbd.toString(), scn.next(), scn.next(), scn.nextDouble()) );
			
		}
		manager.sort();
		System.out.println(manager);
	}
}
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2,17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3,0
 