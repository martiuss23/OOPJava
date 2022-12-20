package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int gcd(int a, int b) {
		while(b > 0) {
			if(a < b) {
				int tmp = a;
				a = b;
				b = tmp;
				continue;
			}
			a = a%b;
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		while(test-- > 0) {
			int sz = scn.nextInt();
			List<Integer> A = new ArrayList<>();
			for(int i = 0; i < sz; i++) {
				A.add(scn.nextInt());
			}
			List<Integer> B = new ArrayList<>();
			B.add(A.get(0));
			for(int i = 0; i < A.size() - 1; i++) {
				int mul = A.get(i)*A.get(i + 1);
				int gcd = gcd(A.get(i), A.get(i + 1));
				B.add(mul/gcd);
			}
			B.add(A.get(sz - 1));
			for(Integer bi : B) {
				System.out.print(bi + " ");
			}
			System.out.println();
		}
	}
}
