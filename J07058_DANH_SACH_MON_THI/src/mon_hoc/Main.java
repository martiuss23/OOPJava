package mon_hoc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("MONHOC.in");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			try {
				int size = Integer.parseInt(bufferedReader.readLine());
				SubjectsManager manager = new SubjectsManager();
				String ID, name, examFormat;
				while(size-- > 0) {
					ID = bufferedReader.readLine();
					name = bufferedReader.readLine();
					examFormat = bufferedReader.readLine();
					Subject subject = new Subject(ID, name, examFormat);
					manager.add(subject);
				}
				manager.sort();
				manager.show();
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
