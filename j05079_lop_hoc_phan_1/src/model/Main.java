package model;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nbOfGroup = Integer.parseInt(scn.nextLine());
		HashMap<String, Subject> subjects = new HashMap<>();
		List<Group> groups = new ArrayList<>();
		for(int i = 0; i < nbOfGroup; i++) {
			Subject sj = new Subject(scn.nextLine(), scn.nextLine());
			if(!subjects.containsKey(sj.getID())) {
				subjects.put(sj.getID(), sj);
			}
			groups.add(new Group(scn.nextLine(), scn.nextLine(), subjects.get(sj.getID())));
		}
		Collections.sort(groups);
		int query = Integer.parseInt(scn.nextLine());
		while(query-- > 0) {
			Subject sub = subjects.get(scn.nextLine());
			for(Group gr: groups) {
				if(gr.getSubject().equals(sub)) 
					System.out.println(gr);
			}
		}
	}
}

//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//THCS2D20