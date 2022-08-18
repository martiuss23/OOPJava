package Model;

import java.util.Scanner;
import java.util.TreeSet;

public class MyTreeSet {
	private TreeSet<Integer> first, second, union;
	
	public MyTreeSet() {
		first = new TreeSet<>();
		second = new TreeSet<>();
		union = new TreeSet<>();
	}
	
	public void clear() {
		first.clear();
		second.clear();
		union.clear();
	}
	
	public void addFirst(int value) {
		first.add(value);
	}

	public void addSecond(int value) {
		second.add(value);
		
	}
	
	public void addUnion(int value) {
		union.add(value);
	}
	
	public void printCommon() {
		first.forEach((item)->System.out.print(second.contains(item)?item + " ":""));
	}
	
	public void printUnionOfBoth() {
		union.forEach((item)->System.out.print(item + " "));
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyTreeSet myTreeSet = new MyTreeSet();
		int sz1, sz2;
		sz1 = scanner.nextInt();
		sz2 = scanner.nextInt();
		int item;
		for(int i = 0; i < sz1; i++) {
			item = scanner.nextInt();
			myTreeSet.addUnion(item);
		}
		for(int i = 0; i < sz2; i++) {
			item = scanner.nextInt();
			myTreeSet.addUnion(item);
		}
		myTreeSet.printUnionOfBoth();
		
	}
}
