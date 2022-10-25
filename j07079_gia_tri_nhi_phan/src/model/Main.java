package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	
	public static boolean isBinary(String str) {
		if(str.equals("")) return false;
		for(Character chr : str.toCharArray()) {
			if(chr != '0' && chr != '1' ) return false;
		}
		return true;
	}
	
	public static String filerBinary(String str) {
		String binary = "";
		for(Character chr : str.toCharArray()) {
			if(isBinary(chr + "")) {
				binary += chr;
			}
		}
		return binary;
	}
	
	public static long toDecimal(String binary) {
		long decimal = 0;
		for(Character chr : binary.toCharArray()) {
			decimal = decimal*2 + (chr - '0');
		}
		return decimal;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("DATA.in"));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<String> list = (ArrayList<String>) obi.readObject();
		
		for(String str : list) {
			String binary = filerBinary(str);
			if(isBinary(binary)) {
				System.out.println(binary + " " + toDecimal(binary));
			}
		}
		
		
		obi.close();
		buf.close();
	}
}
