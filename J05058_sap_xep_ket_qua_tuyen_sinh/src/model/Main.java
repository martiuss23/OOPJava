package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = Integer.parseInt(input.nextLine());
		List<Examinee> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			list.add(new Examinee(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
		}
		Collections.sort(list);
		list.forEach((examinee)->System.out.println(examinee));
	}
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7