package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		scn.nextLine();
		ArrayList<Gamer> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Gamer(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		Collections.sort(list);
		list.forEach((gamer)->System.out.println(gamer));
	}
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00