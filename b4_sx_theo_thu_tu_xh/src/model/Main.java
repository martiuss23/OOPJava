package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
			int sz  = scn.nextInt();
			for(int i = 0; i < sz; i++) {
				int nb = scn.nextInt();
				if(hm.containsKey(nb)) {
					hm.put(nb, hm.get(nb) + 1);
				}
				else{
					hm.put(nb, 1);
				}
			}
			
			List<Entry<Integer, Integer>> eList = new ArrayList(hm.entrySet());
			Collections.sort(eList, new Comparator<Entry<Integer, Integer>>() {

				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
				{	
					if(o1.getValue() < o2.getValue()) return 1;
					if(o1.getValue() > o2.getValue()) return -1;
					return 0;
				}
			});
			for(Entry<Integer, Integer> e : eList) {
				for(int i = 1; i <= e.getValue(); i++) {
					System.out.print(e.getKey() + " ");
				}
			}
			System.out.println();
		}
	}
}
