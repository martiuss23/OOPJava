package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sz = scn.nextInt();
		List<Pair<Integer, Integer>> eList = new ArrayList<>();
		for(int i = 1; i <= sz; i++) {
			for(int j = 1; j <= sz; j++) {
				int v = scn.nextInt();
				if(v == 1 && j > i) {
					eList.add(new Pair<>(i, j));
				}
			}
		}
		for(Pair<Integer, Integer> edg : eList) {
			System.out.println(edg);
		}
	}
}
