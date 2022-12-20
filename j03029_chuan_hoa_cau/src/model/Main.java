package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder sbd = new StringBuilder();
		while(scn.hasNextLine()) {
			String lines = scn.nextLine().toLowerCase();
			String currentLine = "";
			String[] words = lines.split("[.?!]");
			String dau = "";
			
			int len = 0;
			for(int i = 0; i < words.length - 1; i++) {
				words[i] += lines.charAt(len + words[i].length());
				len += words[i].length() + 1;
			}
//			if(words[words.length - 1].length() + len ==)
			for(String word: words)
				System.out.println(word);
			
		}
	}
}

//Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
//
//co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
//
//muc tieu cua chuong trinh la. trang bi cho sinh vien cac ky nang nghe nghiep
//
//moi    CAC BAN danG ky     thaM giA !