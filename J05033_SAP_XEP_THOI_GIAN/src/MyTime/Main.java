package MyTime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int h, m, s;
		manageTime list = new manageTime();
		for(int i = 0; i < n; i++) {
			h = scn.nextInt();
			m = scn.nextInt();
			s = scn.nextInt();
			myTime time = new myTime(h, m, s);
			list.addTime(time);
		}
		list.sort();
		list.show();
	}
}
