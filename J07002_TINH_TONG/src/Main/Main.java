package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try {
			FileInputStream fip = new FileInputStream("DATA.in");
			Scanner scn = new Scanner(fip);
			long sum = 0;
			while(scn.hasNext()) {
				
				try {
					sum  += scn.nextInt();
				} catch (Exception e) {
					 scn.next();
				}
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
