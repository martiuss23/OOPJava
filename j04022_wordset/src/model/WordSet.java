package model;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
	private TreeSet<String> words;
	
	public WordSet() {
		words = new TreeSet<>();
	}
	
	public WordSet(String line) {
		words = new TreeSet<>();
		StringTokenizer stk = new StringTokenizer(line);
		while(stk.hasMoreTokens()) {
			words.add(stk.nextToken().toLowerCase());
		}
	}
	
	public WordSet union(WordSet second) {
		WordSet result = new WordSet();
		words.forEach((word)->result.words.add(word));
		second.words.forEach((word)->result.words.add(word));
		return result;
	}
	
	public WordSet intersection(WordSet second) {
		WordSet result = new WordSet();
		words.forEach((word)->{if(second.words.contains(word)) 
			result.words.add(word);});
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		words.forEach((word)->{str.append(word + " ");});
		return str.toString();
	}
}
