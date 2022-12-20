package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class InternManager {
	private static InternManager itmng;
	private HashMap<String,Student> students;
	private HashMap<String, Manufacture> manufactures;
	private HashMap<String, List<String>> table;
	
	private InternManager() {
		students = new HashMap<>();
		manufactures = new HashMap<>();
		table = new HashMap<>();

	}
	
	public static InternManager getInstance() {
		if(itmng == null) {
			itmng = new InternManager();
		}
		return itmng;
	}
	
	void addStudent(Student std) {
		students.put(std.getID(), std);
	}
	
	void addManufacture(Manufacture manufacture) {
		manufactures.put(manufacture.getID(), manufacture);
	}
	
	final Manufacture getManufacture(String manufactureID) {
		return manufactures.get(manufactureID);
	}
	
	void addIntern(String studentID, String manufactureID) {
		if(students.containsKey(studentID) && manufactures.containsKey(manufactureID)) {
			if(table.containsKey(manufactureID)) {
				table.get(manufactureID).add(studentID);
			}
			else {
				ArrayList<String> it = new ArrayList<>();
				it.add(studentID);
				table.put(manufactureID, it);
			}
				
		}
	}
	
	
	List<Student> getInternInManufacture(String manID){
		List<String> internID = table.get(manID);
		if(internID == null) return null;
		
		Manufacture man = manufactures.get(manID);
		Collections.sort(internID);
		List<Student> interns = new ArrayList<>();
		for(int i = 0; i < Math.min(internID.size(), man.getNumberOfStudent()); i++) {
			interns.add(students.get(internID.get(i)));
		}
		return interns;
	}
}
