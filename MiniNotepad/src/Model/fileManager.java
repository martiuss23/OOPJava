package Model;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class fileManager {
	private File file;
	public fileManager() {
		file = new File("C:\\Users\\chaum\\OneDrive\\Máy tính\\Untitled");
	}

	public fileManager(File file) {
		this.file = file;
	}
	
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
		
	}

	public void writerFile(String text) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String readerFile() {
		StringBuffer str = new StringBuffer("");
		String s;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((s = br.readLine())!=null) {
					str.append(s);
					if(!str.equals("")) str.append('\n');
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str.toString();
	}
	

	public void createFile(String text) {
		try {
			file.createNewFile();
			this.writerFile(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
