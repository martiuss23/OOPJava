package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<String, Subject> subMap = new HashMap<>();
		HashMap<String, Lecturer> lecMap = new HashMap<>();
		LinkedHashMap<String, List<TeachingSchedule>> scheduleMap = new LinkedHashMap<>();
		
		int nbOfSubjects = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfSubjects; i++) {
			Subject subject = new Subject(scn.next(), scn.nextLine().trim());
			subMap.put(subject.getID(), subject);
		}
		
		int nbOfLecturer = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfLecturer; i++) {
			Lecturer lecturer = new Lecturer(scn.next(), scn.nextLine().trim());
			lecMap.put(lecturer.getID(), lecturer);
		}
		
		int nbOfSchedule = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfSchedule; i++) {
			TeachingSchedule teachingSchedule = new TeachingSchedule(lecMap.get(scn.next()), subMap.get(scn.next()), Float.parseFloat(scn.nextLine().trim()));
			if(!scheduleMap.containsKey(teachingSchedule.getLecturer().getID())) {
				scheduleMap.put(teachingSchedule.getLecturer().getID(), new ArrayList<>());
			}
			scheduleMap.get(teachingSchedule.getLecturer().getID()).add(teachingSchedule);
		}
		
		String lecturerId = scn.next();
		System.out.println("Giang vien: " + lecMap.get(lecturerId).getName());
		float totalTime = 0;
		for(TeachingSchedule tSchedule: scheduleMap.get(lecturerId)) {
			System.out.println(tSchedule.getSubject().getName() + " " + tSchedule.getTimeTeaching());
			totalTime += tSchedule.getTimeTeaching();
		}
		System.out.println( "Tong: " + String.format("%.2f", totalTime));
				
	}
}

//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
