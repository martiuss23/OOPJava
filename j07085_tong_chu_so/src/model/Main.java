package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	
	public static String filterDigit(String str) {
		String decimal = "";
		for(Character chr : str.toCharArray()) {
			if(Character.isDigit(chr)) {
				if((chr == '0' && !decimal.equals("")) || chr != '0')
					decimal += chr;
			}
		}
		return decimal;
	}
	
	public static long getSum(String decimal) {
		long sum = 0;
		for(Character chr : decimal.toCharArray()) {
			sum +=  (chr - '0');
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream("DATA.in"));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<String> list = (ArrayList<String>) obi.readObject();
		
		for(String str : list) {
			String decimal = filterDigit(str);
			if(!decimal.equals(""))
				System.out.println(decimal + " " + getSum(decimal));
		}
		
		
		obi.close();
		buf.close();
	}
}
