package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("STRING.in"));
		int test = Integer.parseInt(scn.nextLine());
		while(test-- > 0) {
			String a = scn.next();
			String b = scn.next();
			int k = 0;
			
			while(k != -1) {
				k = a.indexOf(b, k);
				if(k == -1)
					break;
				System.out.print(k + 1 +" ");
				k += 1;
			}
			System.out.println();
		}
	}
}
