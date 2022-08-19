package Model;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

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
	
	
	public int sizeShorten() {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(arr[0]);
		for(int i = 1; i < size; i++) {
			if(myStack.isEmpty()) myStack.push(arr[i]);
			else if((arr[i] + myStack.peek()) % 2 == 0) 
				myStack.pop();
			else myStack.push(arr[i]);
		}
		return myStack.size();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = 1;
		int size, item;
		MyArray myArray;
		while(test-->0) {
			size = scanner.nextInt();
			myArray = new MyArray(size);
			for(int i = 0; i < size; i++) {
				item = scanner.nextInt();
				myArray.add(i, item);
			}
			System.out.println(myArray.sizeShorten());	
		}
	}
}
