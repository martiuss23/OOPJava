package NumbersCounter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File fl = new File("DATA.IN");
		try {
			DataInputStream dip = new DataInputStream(new FileInputStream(fl));
			NumbersCounter ct = new NumbersCounter();
			try {
				while(true) {
					try {
						ct.add(dip.readInt());
						
					} catch (EOFException e) {
						// TODO Auto-generated catch block
						break;
					}
				}
				ct.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
		
		
	}
}
