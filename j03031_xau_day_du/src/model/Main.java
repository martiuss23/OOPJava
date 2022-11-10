package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test-->0) {
			String str = scn.nextLine();
			int step = Integer.parseInt(scn.nextLine());
			HashSet<Character> set = new HashSet<>();
			for(char chr : str.toCharArray()) {
				set.add(chr);
			}
			if(set.size() + step >= 26) {
				System.out.println("YES");
			}
			else System.out.println("NO");
			
		}
		
		
	}
}
