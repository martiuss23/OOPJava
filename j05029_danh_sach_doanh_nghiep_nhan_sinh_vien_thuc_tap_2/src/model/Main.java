package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int amount = scn.nextInt();
		Enterprises list = new Enterprises();
		for(int i = 1; i <= amount; i++) {
			scn.nextLine();
			list.add(new Enterprise(scn.nextLine(), scn.nextLine(), scn.nextInt()));
		}
		list.sort();
		int q = scn.nextInt();
		while(q-- > 0) {
			int st = scn.nextInt();
			int ed = scn.nextInt();
			System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + st + " DEN " + ed + " SINH VIEN:");
			System.out.println(list.searchAboutNumberOfIntern(st, ed));
		}
	}
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
