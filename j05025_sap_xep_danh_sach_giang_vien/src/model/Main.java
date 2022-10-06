package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		ArrayList<Lecturer> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			String firstName = "", lastName = "";
			StringTokenizer stk = new StringTokenizer(scn.nextLine());
			while(stk.hasMoreTokens()) {
				String token = stk.nextToken();
				if(stk.hasMoreTokens()) firstName += token + " ";
				else 
					lastName = token;
			}
			stk = new StringTokenizer(scn.nextLine());
			String fields = "";
			while(stk.hasMoreTokens()) {
				fields += stk.nextToken().charAt(0);
			}
			list.add(new Lecturer(i, firstName.trim(), lastName, fields.toUpperCase()));
		}
		Collections.sort(list);
		list.forEach((lecturer)->System.out.println(lecturer));
	}
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin