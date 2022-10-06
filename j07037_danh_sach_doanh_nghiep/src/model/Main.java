package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("DN.in"));
		int amount = fileIn.nextInt();
		ArrayList<Enterprise> list = new ArrayList<>();
		for(int i = 1; i <= amount; i++) {
			fileIn.nextLine();
			list.add(new Enterprise(fileIn.nextLine(), fileIn.nextLine(), fileIn.nextInt()));
		}
		Collections.sort(list);
		list.forEach((enterprise)->System.out.println(enterprise));
		fileIn.close();
	}
}
//E:\OOPJava\j07037_danh_sach_doanh_nghiep\src\model