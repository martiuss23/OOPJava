package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream bif1 = new BufferedInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream obf1 = new ObjectInputStream(bif1);
		PrimePalindromeMap pr1 = new PrimePalindromeMap((ArrayList<Integer>)obf1.readObject());
		obf1.close();
		bif1.close();
		BufferedInputStream bif2 = new BufferedInputStream(new FileInputStream("DATA2.in"));
		ObjectInputStream obf2 = new ObjectInputStream(bif2);
		PrimePalindromeMap pr2 = new PrimePalindromeMap((ArrayList<Integer>)obf2.readObject());
		obf2.close();
		bif2.close();
		pr1.showIntersection(pr2);
	}
}
