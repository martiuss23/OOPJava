package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean containPytago(ArrayList<Long> ls) {
		Collections.sort(ls);
		for(int i = 0; i < ls.size() - 2; i++) {
			for(int j = i + 1; j < ls.size() - 1; j++) {
				long k = (long)ls.get(i)*ls.get(i) + (long)ls.get(j) * ls.get(j);
				long sqrtk = (long) Math.sqrt(k);
				if(sqrtk * sqrtk == k) {
					if(ls.contains(sqrtk))
						return true;
				}
			//	else if(sqrtk > ls.get(ls.size() - 1)) break;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			ArrayList<Long> ls = new ArrayList<>();
			int size = scn.nextInt();
			for(int i = 0; i < size; i++) {
				ls.add(scn.nextLong());
			}
			System.out.println((containPytago(ls)?"YES":"NO"));
		}
	}
}
