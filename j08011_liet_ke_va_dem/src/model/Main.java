package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		AscendingNumberMap map = new AscendingNumberMap();
		while(scn.hasNext()) {
			try {
				map.put(scn.next());
			}
			catch (AscendingNumberException e) {
				continue;
			}
		}
		List<Entry<String, Integer>> descendingOrder = map.getListDescendingValue();
		for(Entry<String, Integer> entry : descendingOrder) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
