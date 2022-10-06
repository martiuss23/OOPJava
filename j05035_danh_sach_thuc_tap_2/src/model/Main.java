package model;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<String, TreeSet<Student>> table = new HashMap<>();
		int amount = scn.nextInt();
		scn.nextLine();
		for(int i = 1; i <= amount; i++) {
			Student std = new Student(i, scn.nextLine().trim(), scn.nextLine().trim(), scn.nextLine().trim(), scn.nextLine().trim(), scn.nextLine().trim());
			if(table.containsKey(std.getEnterprise())) {
				table.get(std.getEnterprise()).add(std);
			}
			else {
				TreeSet<Student> s = new TreeSet<>();
				s.add(std);
				table.put(std.getEnterprise(), s);
			}
		}
		int q = scn.nextInt();
		scn.nextLine();
		while(q-->0) {
			String enterprise = scn.nextLine();
			TreeSet<Student> ls = table.get(enterprise);
			ls.forEach((student)->System.out.println(student));
		}
	}
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT
