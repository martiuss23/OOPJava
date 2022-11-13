package model;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long st = scn.nextInt();
		long ed = scn.nextInt();
		ArrayDeque<String> q = new ArrayDeque<>();
		q.addLast("4");
		q.addLast("7");
		long s = 0;
		while(!q.isEmpty()) {
			String nb = q.pollFirst();
			long b = Long.parseLong(nb);
			if(b >= st) {
				s += (long)(Math.min(b, ed) - st + 1)*b;
				st = Math.min(b, ed) + 1;
			}
			if(st > ed) break;
			q.addLast(nb +"4");
			q.addLast(nb + "7");
			
		}
		System.out.println(s);
	}
}
