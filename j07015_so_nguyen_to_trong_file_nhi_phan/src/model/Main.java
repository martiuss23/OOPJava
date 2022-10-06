package model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	private static boolean isPrime(int nb) {
		for(int i = 3; i <= Math.sqrt(nb); i+=2) {
			if(nb % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream(new File("SONGUYEN.in")));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<Integer> list = (ArrayList<Integer>) obi.readObject();
		int[] grid = new int[10001];
		Arrays.fill(grid, 0);
		for(Integer nb : list) {
			grid[nb]++;
		}
		if(grid[2] > 0) {
			System.out.println(2 + " " + grid[2]);
		}
		for(int i = 3; i <= 10000; i+=2) {
			if(grid[i] > 0 && isPrime(i)) {
				System.out.println(i + " " + grid[i]);
			}
		}
		
		
	}
	
	
}
