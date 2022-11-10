package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-->0) {
			int width = scn.nextInt();
			List<Integer> ls = new ArrayList<>();
			for(int i = 0; i < width; i++) {
				ls.add(scn.nextInt());
			}
			Chart chart = new Chart(ls);
			System.out.println(chart.getMaxArea());
		}
	}
}
