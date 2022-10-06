package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Product> list = new ArrayList<>();
		Scanner fileIn = new Scanner(new File("SANPHAM.in"));
		int amount = Integer.parseInt(fileIn.nextLine());
		for(int i = 1; i <= amount; i++) {
			list.add(new Product(fileIn.nextLine(), fileIn.nextLine(), Integer.parseInt(fileIn.nextLine()), Integer.parseInt(fileIn.nextLine())));
		}
		Collections.sort(list);
		list.forEach((product)->System.out.println(product));
	}
}
