package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NodepadModel {
	private File file;
	
	public NodepadModel(String fileName) {
		file = new File("C:\\Users\\chaum\\Desktop\\" + fileName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void save(String text) {
		try {
			//FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write(text);
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
