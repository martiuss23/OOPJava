package Model;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyListEmail {
	private LinkedHashSet<String> myListEmail;
	
	public MyListEmail() {
		myListEmail = new LinkedHashSet<>();
	}
	
	public void add(String str) {
		str = standardEmail(str);
		if(!myListEmail.contains(str)) {
			myListEmail.add(str);
		}
		else {
			int i = 2;
			while(myListEmail.contains(str + String.valueOf(i))) {
				i++;
			}
			myListEmail.add(str + String.valueOf(i));
		}
		
	}
	
	public static String standardEmail(String name) {
		StringTokenizer token  = new StringTokenizer(name);
		StringBuffer newName = new StringBuffer();
		String s = "";
		while(token.hasMoreTokens()) {
			char[] arr = token.nextToken().toCharArray();
			if(!token.hasMoreTokens()) {
				for(int i = 0; i < arr.length; i++) {
					newName.append(Character.toLowerCase(arr[i]));
				}
				newName.append(s);
			}
			else {
				s += Character.toLowerCase(arr[0]);
			}
		}
		return newName.toString();
	}
	
	public void printListEmail() {
		myListEmail.forEach((item)->System.out.println(item + "@ptit.edu.vn"));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		MyListEmail myListEmail = new MyListEmail();
		scanner.nextLine();
		for(int i = 0; i < size; i++) {
			String name = scanner.nextLine();
			myListEmail.add(name);
		}
		myListEmail.printListEmail();
	}
	
}
