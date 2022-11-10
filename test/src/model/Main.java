package model;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<A> ls = new ArrayList<>();
		ls.add(new B(1, 1));
		ls.add(new A(1));
		for(A a : ls) {
			System.out.println(a.getClass().equals(B.class));
		}
	}
}
