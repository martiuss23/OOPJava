package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> lines = new ArrayList<>();
		String str = "";
		while(scn.hasNext()) {
			String word = scn.next().toLowerCase();
			for(char chr : word.toCharArray()) {
				if(chr == '.' || chr == '?' || chr == '!') {
					lines.add(str);
					str = "";
				}
				else str += chr;
			}
			if(!str.equals(""))
				str += " ";
		}
		for(String s : lines) {
			System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
		}
	}
}
