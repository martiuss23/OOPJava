package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Table tb = new Table();
		int amount = scn.nextInt();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			tb.add(new Student(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble()));
		}
		tb.sort();
		System.out.println(tb);
	}
}
//3
//B20DCCN999
//Nguyen Van Nam
//D20CQCN04-B
//10,0
//9,0
//8,0
//B20DCAT001
//Le Van An
//D20CQAT02-B
//6,0
//6,0
//4,0
//B20DCCN111
//Nguyen Van Binh
//D20CQCN01-B
//9,0
//5,0
//6,0