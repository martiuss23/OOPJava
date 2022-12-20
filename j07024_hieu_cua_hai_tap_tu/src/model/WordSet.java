package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet extends TreeSet<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WordSet() {
		super();
	}
	
	public WordSet(String path) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File(path));
		while(fileIn.hasNext()) {
			this.add(fileIn.next().toLowerCase());
		}
	}
	
	public WordSet difference(WordSet o) {
		WordSet diff = new WordSet();
		for(String word: this) {
			if(!o.contains(word))
				diff.add(word);
		}
		return diff;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(String word: this)
			sbd.append(word + " ");
		return sbd.toString().trim();
	}
}
