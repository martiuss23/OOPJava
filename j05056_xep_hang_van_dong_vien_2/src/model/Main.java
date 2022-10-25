package model;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);
		int amount = Integer.parseInt(scn.nextLine());
		Chart athleteChart = new Chart();
		for(int i = 1; i <= amount; i++) {
			athleteChart.add(new Athlete(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine()));
		}
		athleteChart.sortByAchivement();
		athleteChart.update();
		//athleteChart.sortByID();
		System.out.println(athleteChart);
		
	}
	
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1998
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:02:00
//07:11:20