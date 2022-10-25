package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Graph graph = new Graph();
		int amount = scn.nextInt(), u, v;
		for(int i = 0; i < amount - 1; i++) {
			u = scn.nextInt();
			v = scn.nextInt();
			graph.add(u, v);
			graph.add(v, u);
		}
		System.out.println(graph.isStarGraph()?"Yes":"No");
		
	}
}
