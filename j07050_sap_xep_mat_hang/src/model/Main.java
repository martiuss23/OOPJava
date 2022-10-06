package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("MATHANG.in"));
		int amount = scn.nextInt();
		ArrayList<Product> ls = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			ls.add(new Product(String.format("%02d", i), scn.nextLine(), scn.nextLine(), scn.nextDouble(), scn.nextDouble()));
		}
		Collections.sort(ls);
		ls.forEach((product)->System.out.println(product));
	}
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27,5
//37