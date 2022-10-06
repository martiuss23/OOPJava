package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream bfi = new BufferedInputStream(new FileInputStream("DATA.in"));
		ObjectInputStream obi = new ObjectInputStream(bfi);
		ArrayList<Integer> list = (ArrayList<Integer>) obi.readObject();
		TreeMap<Integer, Integer> mp  = new TreeMap<>();
		for(Integer num : list) {
			if(mp.containsKey(num)) mp.put(num, mp.get(num) + 1);
			else mp.put(num, 1);
		}
		mp.forEach((key, val)->System.out.println(key + " " + val));
		
		obi.close();
		bfi.close();
		
	}
}
