package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(new File("MONHOC.in"));
		HashMap<String, Subject> subMap = new HashMap<>();
		HashMap<String, List<TeachingSchedule>> scheduleMap = new HashMap<>();
		
		int nbOFSub = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOFSub; i++) {
			Subject subject = new Subject(scn.nextLine(), scn.nextLine(), Integer.parseInt(scn.nextLine()));
			subMap.put(subject.getID(), subject);
		}
		
		scn = new Scanner(new File("LICHGD.in"));
		int nbOfSchedule = Integer.parseInt(scn.nextLine());
		for(int i = 1; i <= nbOfSchedule; i++) {
			TeachingSchedule schedule = new TeachingSchedule(subMap.get(scn.nextLine()), Integer.parseInt(scn.nextLine()), Integer.parseInt(scn.nextLine()), scn.nextLine(), scn.nextLine());
			if(!scheduleMap.containsKey(schedule.getSubject().getID())) 
				scheduleMap.put(schedule.getSubject().getID(), new ArrayList<>());
			scheduleMap.get(schedule.getSubject().getID()).add(schedule);
		}
		
		String subID = scn.nextLine();
		List<TeachingSchedule> schedules = scheduleMap.get(subID);
		Collections.sort(schedules);
		System.out.println("LICH GIANG DAY MON " + subMap.get(subID).getName() + ":");
		for(TeachingSchedule schedule: schedules)
			System.out.println(schedule);
	}
}
