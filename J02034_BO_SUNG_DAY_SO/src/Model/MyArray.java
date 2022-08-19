package Model;

import java.util.Scanner;

public class MyArray {
	private int[] myArray;
	private int maxElement;
	
	public MyArray() {
		myArray = new int[201];
		maxElement = -1;
	}
	
	public void add( int value) {
		myArray[value] = 1;
		maxElement = Math.max(maxElement, value);
	}
	
	public void showTheMissingNumber() {
		boolean ok = true;
		for(int i = 1; i <= maxElement; i++) {
			if(myArray[i] == 0) {
				System.out.println(i);
				ok = false;
			}
		}
		if(ok) System.out.println("Excellent!");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		MyArray myArray = new MyArray();
		for(int i = 0; i < n; i++) {
			int item = scanner.nextInt();
			myArray.add(item);
		}
		myArray.showTheMissingNumber();
	}
}
