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
		ArrayList<Person> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Person(scn.next(), scn.next()));
		}
		Collections.sort(list);
		//youngest
		System.out.println(list.get(list.size() - 1));
		//oldest
		System.out.println(list.get(0));
	}
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990