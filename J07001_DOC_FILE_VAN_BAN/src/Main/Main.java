package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		File file = new File("E:\\OOPJava\\J07001_DOC_FILE_VAN_BAN\\src\\Main\\DATA.in");
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader bfr = new BufferedReader(fr);
			try {
				while(bfr.ready()) {
					System.out.println(bfr.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
