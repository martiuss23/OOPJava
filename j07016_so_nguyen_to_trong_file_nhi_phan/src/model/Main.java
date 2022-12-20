package model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("DATA1.in"));
//		ObjectOutputStream obo = new ObjectOutputStream(bof);
//		ArrayList<Integer> ls = new ArrayList<>();
//		ls.add(new int[10],)
		BufferedInputStream bif = new BufferedInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream obi = new ObjectInputStream(bif);
		PrimeNumber pr1 = new PrimeNumber((ArrayList<Integer>)obi.readObject());
		bif = new BufferedInputStream(new FileInputStream("DATA2.in"));
		obi = new ObjectInputStream(bif);
		PrimeNumber pr2 = new PrimeNumber((ArrayList<Integer>)obi.readObject());
		obi.close();
		bif.close();
		pr1.showIntersection(pr2);
		
	}
}
