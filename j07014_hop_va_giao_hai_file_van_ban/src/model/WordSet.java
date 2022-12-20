package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet extends TreeSet<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WordSet() {
		super();
	}
	
	public WordSet(String path) throws FileNotFoundException {
		super();
		Scanner fileIn = new Scanner(new File(path));
		while(fileIn.hasNext()) {
			this.add(fileIn.next().toLowerCase());
		}
		fileIn.close();
	}
	
	
	public WordSet union(WordSet o) {
		WordSet union = new WordSet();
		for(String word: o)
			union.add(word);
		for(String word: this)
			union.add(word);
		return union;
	}
	
	public WordSet intersection(WordSet o) {
		WordSet intersection = new WordSet();
		for(String word: o)
			if(this.contains(word)) {
				intersection.add(word);
			}
		return intersection;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(String word: this)
			sbd.append(word + " ");
		return sbd.toString().trim();
	}
	
}
