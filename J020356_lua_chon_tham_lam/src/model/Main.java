package model;

import java.util.Scanner;

public class Main {
	
	public static String getMin(int n, int s) {
		if(s == 0 && n > 1) return "-1";
		if(n * 9 < s) return "-1";
		String min = "";
		s -= 1;
		int num9 = s/9;
		int mod = s % 9;
		for(int i = 0; i < num9; i++) {
			min += "9";
		}
		if(min.length() == n - 1) {
			return (mod + 1) + min;
		}
		min = mod + min;
		while(min.length() < n - 1) {
			min = "0" + min;
		}
		return 1 + min;
	}
	
	public static String getMax(int n, int s) {
		if(s == 0 && n > 1) return "-1";
		if(n* 9 < s) return "-1";
		String max = "";
		while(max.length() < n) {
			max += Math.min(9, s);
			s -= Math.min(9, s);
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = scn.nextInt();
		String min = getMin(n, s);
		String max = getMax(n, s);
		System.out.println((min.equals("-1") || max.equals("-1")?"-1 -1":min + " " +max));
	}
}
