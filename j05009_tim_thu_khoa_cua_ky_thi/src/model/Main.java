package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sz = scn.nextInt();
		ExamineeList ls = new ExamineeList();
		for(int i = 0; i < sz; i++) {
			scn.nextLine();
			ls.add(new Examinee(scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble(), scn.nextDouble()));
		}
		ls.showBestScore();
	}
}
//3
//Nguyen Van A
//12/12/1994
//3,5
//7,0
//5,5
//Nguyen Van B
//1/9/1994
//7,5
//9,5
//9,5
//Nguyen Van C
//6/7/1994
//8,5
//9,5
//8,5