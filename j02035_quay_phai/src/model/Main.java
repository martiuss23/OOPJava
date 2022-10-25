package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- >0) {
			int n = scn.nextInt();
			List<Long> ls = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				ls.add(scn.nextLong());
			}
			int index = 0;
			for(int i = 0; i < n - 1; i++) {
				if(ls.get(i) > ls.get(i + 1)) {
					index = i + 1;
					break;
				}
			}
			System.out.println(index);
		}
	}
}
