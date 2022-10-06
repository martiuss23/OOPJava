package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static ArrayList<Integer> source; 
	public static int size;
	public static TreeSet<String> result;
	public static void backTrack(ArrayList<Integer> ls, int id) {
		for(int i = id; i < size; i++) {
			if(ls.size() == 0 || source.get(i) > ls.get(ls.size() - 1)) {
				ls.add(source.get(i));
				if(ls.size() > 1) {
					String s = "";
					for(Integer it  : ls) {
						s += it + " ";
					}
					s.trim();
					result.add(s);
				}
				if(i < size - 1) {
					backTrack(ls, i + 1);
				}
				if(ls.size() > 0) ls.remove(ls.size() - 1);
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("DAYSO.in"));
		size = scn.nextInt();
		source = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			source.add(scn.nextInt());
		}
		result = new TreeSet<>();
		backTrack(new ArrayList<>(), 0);
		for(String str : result)
			System.out.println(str);
	}
	
	
}
