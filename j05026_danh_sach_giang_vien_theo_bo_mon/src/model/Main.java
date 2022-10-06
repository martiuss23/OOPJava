package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static String shorten(String line) {
		StringTokenizer stk = new StringTokenizer(line);
		String key = "";
		while(stk.hasMoreTokens()) {
			key += stk.nextToken().charAt(0);
		}
		return key.toUpperCase();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		HashMap<String, ArrayList<Lecturer>> mp = new HashMap<>();
		scn.nextLine();
		for(int i = 1; i <= amount; i++) {
			Lecturer lecturer = new Lecturer(i, scn.nextLine(), shorten(scn.nextLine()));
			if(mp.containsKey(lecturer.getFields())) mp.get(lecturer.getFields()).add(lecturer);
			else {
				ArrayList<Lecturer> ls = new ArrayList<>();
				ls.add(lecturer);
				mp.put(lecturer.getFields(),ls);
			}
		}
		int q = scn.nextInt();
		scn.nextLine();
		while(q-- > 0) {
			String fields = shorten(scn.nextLine());
			System.out.println("DANH SACH GIANG VIEN BO MON " + fields +":");
			if(mp.containsKey(fields)) {
				mp.get(fields).forEach((lecturer)->System.out.println(lecturer));
			}
		}
	}
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem