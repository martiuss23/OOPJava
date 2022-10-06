package model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("NHIPHAN.in"));
//		ObjectOutputStream obo = new ObjectOutputStream(bof);
//		ArrayList<String> ls = new ArrayList<>();
//		for(int i = 1; i <= 10; i++) {
//			String s = new Scanner(System.in).nextLine();
//			ls.add(s);
//		}
//		obo.writeObject(ls);
//		obo.close();
//		bof.close();
		
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("NHIPHAN.in"));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<String> list = (ArrayList<String>) obi.readObject();
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		for(String str : list) {
			Scanner scn = new Scanner(str);
			while(scn.hasNext()) {
				String token = scn.next();
				set1.add(token.toLowerCase());
			}
			scn.close();
		}
		obi.close();
		buf.close();
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		Scanner fileInput = new Scanner(new File("VANBAN.in"));
		while(fileInput.hasNext()) {
			String token = fileInput.next();
			set2.add(token.toLowerCase());
		}
		
		for(String str:set2) {
			if(set1.contains(str)) {
				System.out.println(str);
			}
		}
		fileInput.close();
	}
}
