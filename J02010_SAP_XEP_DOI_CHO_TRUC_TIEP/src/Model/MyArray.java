package Model;

import java.util.Scanner;

public class MyArray {
	private int[] arr;
	private int size;
	
	
	
	public MyArray(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void add(int index, int value) {
		if(index < size) {
			arr[index] = value;
			//System.out.println(arr[index]);
		}
	}
	
	public void insectionSort() {
		for(int i = 0; i < size; i++) {
			boolean ok = true;
			for(int j = i + 1; j < size; j++) {
				if(arr[i] > arr[j]) {
					ok = false;
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			if(ok) return;
			System.out.print("Buoc " + (int)(i + 1) + ": ");
			for(int j = 0; j < size; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt(), item;
		MyArray myArray = new MyArray(size);
		for(int i = 0; i < size; i++) {
			item = scanner.nextInt();
			myArray.add(i, item);
		}
		myArray.insectionSort();
	}
	
}
