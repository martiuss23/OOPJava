package model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main implements Serializable{

	private static boolean isDecrease(String s) {
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) > s.charAt(i + 1)) return false;
		}
		return true;
	}
	
	public static void filterListToMap(ArrayList<Integer> list, int[] arr) {
		for(Integer it : list) {
			if(it > 10 && isDecrease(it + "")) {
				arr[it]++;
			}
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream obs = new ObjectInputStream(buf);
		ArrayList<Integer> list1 = (ArrayList<Integer>) obs.readObject();
		obs.close();
		buf.close();
		buf = new BufferedInputStream(new FileInputStream("DATA2.in"));
		obs = new ObjectInputStream(buf);
		ArrayList<Integer> list2 = (ArrayList<Integer>) obs.readObject();
		obs.close();
		buf.close();
		int[] mp1 = new int[10001];
		int[] mp2 = new int[10001];
		Arrays.fill(mp1, 0);
		Arrays.fill(mp2, 0);
		filterListToMap(list1, mp1);
		filterListToMap(list2, mp2);
		for(int i = 11; i < 10001; i++) {
			if(mp1[i] > 0 && mp2[i] > 0) {
				System.out.println(i + " " + mp1[i] + " " + mp2[i]);
			}
		}
	}
}
