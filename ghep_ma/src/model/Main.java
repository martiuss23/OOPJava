package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("DATA1.in"));
		BufferedInputStream buf2 = new BufferedInputStream(new FileInputStream("DATA2.in"));
		ObjectInputStream obs = new ObjectInputStream(buf);
		ObjectInputStream obs2 = new ObjectInputStream(buf2);
		TreeSet<String> st1= new TreeSet<>();
		st1.addAll((ArrayList<String>) obs.readObject());
		TreeSet<Integer> st2= new TreeSet<>();
		st2.addAll((ArrayList<Integer>) obs2.readObject());
		obs.close();
		obs2.close();
		buf.close();
		buf2.close();
		for(String str : st1) {
			for(Integer num: st2) {
				System.out.println(str + num);
			}
		}
	}
}
