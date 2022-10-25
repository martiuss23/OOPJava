package model;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int n = scn.nextInt();
			long k = scn.nextLong();
			TreeMap<Long, Integer> map = new TreeMap<>();
			long countPair = 0;
			for(int i = 0; i < n; i++) {
				long nb = scn.nextLong();
				if(map.containsKey(nb))
					map.put(nb, map.get(nb) + 1);
				else map.put(nb, 1);
			}
			for(Entry<Long, Integer> et : map.entrySet()) {
				if(et.getKey() > k/2) break;
				if(map.containsKey(k - et.getKey())) {
					if(2*et.getKey() == k) {
						countPair += (long)(et.getValue() - 1) * et.getValue()/2; 
					}
					else {
						countPair += (long)et.getValue()*map.get(k-et.getKey()); 
						
					}
				}
			}
			System.out.println(countPair);
		}
	}
}
//4
//4 6
//1 5 7 -1
//5 6
//1 5 7 -1 5
//4 2
//1 1 1 1
//13 11
//10 12 10 15 -1 7 6 5 4 2 1 1 1
//
