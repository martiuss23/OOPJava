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
	
	public void selectionSort() {
		for(int i = 0; i < size - 1; i++) {
			int minIndex = i + 1;
			for(int j = i + 2; j < size; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(arr[i] > arr[minIndex]) {
				int tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
			System.out.print("Buoc " + (int)(i + 1) + ": ");
			for(int j = 0; j < size; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
	
	public void insertSort() {
		for(int i = 0; i < size; i++) {
			int post = arr[i];
			int j;
			for(j = i-1; j >= 0; j--) {
				if(arr[j] <= post) break; 
				arr[j+1] = arr[j];
			}
			arr[j+1] = post;
			System.out.print("Buoc " + i + ": ");
			for(j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bubbleSort() {
		int tmp;
		for(int i = size-1; i > 0; i--) {
			boolean ok = true;
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					ok = false;
				}
			}
			if(ok) break;
			System.out.print("Buoc " + (int)(size-i) + ": ");
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
		myArray.bubbleSort();
	}
	
}
