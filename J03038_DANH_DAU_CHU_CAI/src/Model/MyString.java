package Model;

import java.util.HashSet;
import java.util.Scanner;

public class MyString {
	private String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	public int countAlpha() {
		HashSet<Character> set = new HashSet<>();
		for(Character chr : myString.toCharArray()) {
			set.add(chr);
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		MyString myString = new MyString();
		myString.setMyString(str);
		System.out.println(myString.countAlpha());
	}
}
