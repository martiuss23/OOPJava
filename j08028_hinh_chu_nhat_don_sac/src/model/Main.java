package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int height = scn.nextInt();
		int width = scn.nextInt();
		List<Integer> blue = new ArrayList<>();
		List<Integer> yellow = new ArrayList<>();
		for(int i = 0; i < width; i++) {
			int valColumn = scn.nextInt();
			blue.add(valColumn);
			yellow.add(height-valColumn);
		}
		Chart blueChart = new Chart(blue);
		Chart yellowChart = new Chart(yellow);
		System.out.println(Math.max(blueChart.getMaxArea(), yellowChart.getMaxArea()));
	}
}
