package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
	private TreeSet<String> words;
	
	public WordSet(String path) throws FileNotFoundException {
		Scanner scn = new Scanner(new File(path));
		words = new TreeSet<>();
		while(scn.hasNext()) {
			words.add(scn.next().toLowerCase());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		words.forEach(word->sbd.append(word + '\n'));
		return sbd.toString();
	}
}
