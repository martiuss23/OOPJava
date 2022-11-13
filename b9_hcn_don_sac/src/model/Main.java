package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int h = scn.nextInt();
		int w = scn.nextInt();
		List<Integer> down = new ArrayList<>();
		List<Integer> up = new ArrayList<>();
		for(int i = 0; i < w; i++) {
			int val = scn.nextInt();
			down.add(val);
			up.add(h - val);
		}
		Chart upC = new Chart(w, up);
		Chart downC = new Chart(w, down);
		System.out.println(Math.max(upC.getMaxArea(), downC.getMaxArea()));
	}
}
