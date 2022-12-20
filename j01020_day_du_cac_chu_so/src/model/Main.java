package model;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = Integer.parseInt(scn.nextLine());
		while(test-- > 0) {
			ArrayDeque<String> queue = new ArrayDeque<>();
			HashSet<String> set = new HashSet<>();
			String num = scn.next();
			queue.add(num);
			int[] countNumber = new int[10];
			int countCheck = 0;
			boolean ok = false;
			Arrays.fill(countNumber, 0);
			while(!queue.isEmpty() && countCheck < 10) {
				String nb = queue.pollFirst();
				if(!set.contains(nb)) {
					set.add(nb);
					for(int i = 0; i < nb.length(); i++) {
						if(countNumber[nb.charAt(i) - '0'] == 0) {
							countNumber[nb.charAt(i) - '0'] = 1;
							countCheck += 1;
							if(countCheck == 10) {
								System.out.println(nb);
								ok = true;
								break;
							}
						}	
					}
					queue.add(Long.parseLong(nb) * 2 + "");
					queue.add(Long.parseLong(nb) * 3 + "");
				}
			}
			if(!ok) System.out.println("Impossible");
		}
	}
}

//1 1 
//2 1 2   
//3 1 2 3
//4 1 2 3 4
//5 1 2 3 4 5
//6 1 2 3 4 5 6
//7 1 2 3 4 5 6 7
//8 1 2 3 4 5 6 7 8
