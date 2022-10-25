package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(a%b, b);
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("DATA.in"));
//		ObjectOutputStream obs = new ObjectOutputStream(bof);
//		ArrayList<Pair> ls1 = new ArrayList<>();
//		ls1.add(new Pair(3,  3));
//		ls1.add(new Pair(3,  2));
//		ls1.add(new Pair(3,  6));
//		ls1.add(new Pair(5, 5));
//		obs.writeObject(ls1);
//		obs.close();
//		bof.close();
		
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("DATA.in"));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<Pair> ls = (ArrayList<Pair>) obi.readObject();
		Collections.sort(ls);
		Pair pr = null;
		for(int i = 0; i < ls.size(); i++) {
			if(ls.get(i).getFirst() < ls.get(i).getSecond() && gcd(ls.get(i).getSecond(), ls.get(i).getFirst()) == 1) {
				if(pr == null || !pr.equals(ls.get(i))) {
					System.out.println(ls.get(i));
					pr = ls.get(i);
				}
			}
		}
		obi.close();
		//buf.close();
		
	}
}
