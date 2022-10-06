package model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	private static int[] prime = new int[1000001];
	private static int maxSize = 1000001;
	private static int[] arr = new int[maxSize];
	private static void erathone() {
		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for(int i = 4; i < maxSize; i+=2)
			prime[i] = 0;
		for(int i = 3; i <= Math.sqrt(maxSize); i+=2) {
			if(prime[i] == 1) {
				for(int j = i * i; j < maxSize; j += i) {
					prime[j] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream(new File("DATA.in")));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<Integer> list = (ArrayList<Integer>) obi.readObject();
		erathone();
		Arrays.fill(arr, 0);
		for(Integer nb : list) {
			if(prime[nb] == 1)
				arr[nb]++;
		}
		int cnt = 0;
		for(int i = maxSize - 1; i >= 0 && cnt < 10 ; i--) {
			if(arr[i] > 0) {
				cnt++;
				System.out.println(i + " " + arr[i]);
			}
		}
	}
	
	
}
