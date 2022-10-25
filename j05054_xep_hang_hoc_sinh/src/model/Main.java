package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScoreChart chart = new ScoreChart();
		int amount = Integer.parseInt(input.nextLine());
		for(int i = 1; i <= amount; i++) {
			chart.add(new Student(input.nextLine(), Double.parseDouble(input.nextLine())));
		}
		chart.update();
		chart.sortByID();
		System.out.println(chart);
	}
}

//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//8.6