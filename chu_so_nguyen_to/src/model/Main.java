package model;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayDeque<String> q = new ArrayDeque<>();
		Scanner scn = new Scanner(System.in);
		int sz = scn.nextInt();
		q.addLast("2");
		q.addLast("3");
		q.addLast("5");
		q.addLast("7");
		while(!q.isEmpty()) {
			String s = q.pollFirst();
			if(!s.endsWith("2") && s.length() >= 4 && s.length() <= sz && s.contains("2") && s.contains("3") && s.contains("5") && s.contains("7")) {
				System.out.println(s);
			}
			if(s.length() < sz) {
				q.addLast(s + "2");
				q.addLast(s + "3");
				q.addLast(s + "5");
				q.addLast(s + "7");
			}
		}
	}
}
