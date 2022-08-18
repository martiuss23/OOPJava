package Model;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MyLinkedHashMap {
	private LinkedHashMap<Integer, Integer> myMap;
	
	public MyLinkedHashMap() {
		myMap = new LinkedHashMap<>();
	}
	
	public void clear() {
		myMap.clear();
	}
	
	public void put(int key) {
		if(myMap.containsKey(key)) {
			myMap.replace(key, myMap.get(key) + 1);
		}
		else myMap.put(key, 1);
	}
	
	public void print() {
		myMap.forEach((key, value)->System.out.println(key + " xuat hien " + value + " lan"));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTest = scanner.nextInt();
		int sz, item, testCurr = 0;
		MyLinkedHashMap myLinkedHashMap = new MyLinkedHashMap();
		while(testCurr++<numOfTest) {
			sz = scanner.nextInt();
			for(int i = 0; i < sz; i++) {
				item = scanner.nextInt();
				myLinkedHashMap.put(item);
			}
			System.out.println("Test " + testCurr + ":");
			myLinkedHashMap.print();
			myLinkedHashMap.clear();
		}
	}
	
}
