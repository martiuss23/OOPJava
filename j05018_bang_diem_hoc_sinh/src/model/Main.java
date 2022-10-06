package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		ArrayList<Student> ls = new ArrayList<>();
		for(int i = 1; i <= size; i++) {
			scn.nextLine();
			ls.add(new Student(String.format("%02d", i),scn.nextLine() , new double[] {
					scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),
					scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble(),scn.nextDouble()
			}));
		}
		Collections.sort(ls);
		for(Student std : ls) {
			System.out.println(std);
		}
	}
}
//3
//Luu Thuy Nhi
//9,3  9,0  7,1  6,5  6,2  6,0  8,2  6,7  4,8  5,5
//Le Van Tam
//9,3  9,0  7,1  6,5  6,2  6,0  8,2  6,7  4,8  5,5
//Nguyen Thai Binh
//9,0 9,0 9,0 8,9 9,0 8,9 9,0 8,9 8,9 8,9
