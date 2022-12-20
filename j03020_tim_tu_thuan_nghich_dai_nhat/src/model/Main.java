package model;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static boolean isPalindrome(String str) {
		int sz = str.length();
		for(int i = 0; i < sz/2; i++) {
			if(str.charAt(i) != str.charAt(sz - 1- i)) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		int maxLength = 0;
		while(scn.hasNext()) {
			String str = scn.next();
			if(isPalindrome(str)) {
				maxLength = Math.max(maxLength, str.length());
				if (hashMap.containsKey(str)) 
					hashMap.put(str, hashMap.get(str) + 1);
				else 
					hashMap.put(str, 1);
			}
		}
		for(Entry<String, Integer> entry : hashMap.entrySet()) {
			if(entry.getKey().length() == maxLength) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
