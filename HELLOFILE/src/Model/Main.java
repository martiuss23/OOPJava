package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
	
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(new File("E:\\OOPJava\\HELLOFILE\\src\\Model\\Hello.txt"));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
				String str;
				try {
					str = bufferedReader.readLine();
					if(str==null) {
						break;
					}
					System.out.println(str);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
