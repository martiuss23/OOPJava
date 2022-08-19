package Model;

import java.util.Scanner;

public class MyArray {
	private int[] arr, prefix, suffix;
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
	
	public void createPrefix() {
		prefix = new int[size];
		prefix[0] = arr[0];
		for(int i = 1; i < size; i++) {
			prefix[i] = arr[i] + prefix[i-1];
		}
	}
	
	public void createSuffix() {
		suffix = new int[size];
		suffix[size-1] = arr[size-1];
		for(int i = size-2; i >=0; i--) {
			suffix[i] = arr[i] + suffix[i+1];
		}
	}
	
	public int firstBalancePoint() {
		this.createPrefix();
		this.createSuffix();
		for(int i = 0; i < size; i++) {
			if(prefix[i] == suffix[i]) return i + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int size, item;
		MyArray myArray;
		while(test-->0) {
			size = scanner.nextInt();
			myArray = new MyArray(size);
			for(int i = 0; i < size; i++) {
				item = scanner.nextInt();
				myArray.add(i, item);
			}
			System.out.println(myArray.firstBalancePoint());	
		}
	}
}
