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
		System.out.println(manager);
	}
}
//2
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3,1
//    trAn    minh   Chau
//D20CQCN01-B
//23/3/2002
//3,56
 