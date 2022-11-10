package model;

import java.util.LinkedHashMap;

public class PalindromeCounter {
	private int maxLength;
	private LinkedHashMap<String, Integer> wordsPalindrome;
	
	public PalindromeCounter() {
		wordsPalindrome = new LinkedHashMap<>();
	}
	
	public void add(String words) {
		if(words.length() >= maxLength) {
			maxLength = Math.max(maxLength, words.length());
			if(wordsPalindrome.containsKey(words)) {
				wordsPalindrome.put(words, wordsPalindrome.get(words) + 1);
			}
			else {
				wordsPalindrome.put(words, 1);
			}
		}
	}
	
	public static boolean isPalindrome(String words) {
		for(int i = 0; i < words.length()/2; i++) {
			if(words.charAt(i) != words.charAt(words.length() - 1- i)) {
				return false;
			}
		}
		return true;
	}
	
	public String getPalindromesMaxLength() {
		StringBuilder sbd = new StringBuilder();
		for(String word : wordsPalindrome.keySet()) {
			if(word.length() == maxLength) {
				sbd.append(word + " " + wordsPalindrome.get(word) + "\n");
			}
		}
		return sbd.toString();
	}
	
}
