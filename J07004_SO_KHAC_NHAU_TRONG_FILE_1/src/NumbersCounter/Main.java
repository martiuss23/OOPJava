package NumbersCounter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("DATA.in");
			Scanner scn = new Scanner(fis);
			NumbersCounter ct = new NumbersCounter();
			while(scn.hasNextInt()) {
				ct.add(scn.nextInt());
			}
			ct.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
