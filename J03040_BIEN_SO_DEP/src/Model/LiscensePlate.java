package Model;

import java.util.Scanner;

public class LiscensePlate {
	private String val;
	
	
	public LiscensePlate(String val) {
		this.val = val;
	}
	
	public boolean isGreat() {
		int[] table = new int[4];
		int past = 5;
		if(val.charAt(past) != '6' && val.charAt(past)!= '8') 
			table[3] = -1; 
		for(int i = 6; i < 11; i++) {
			if(i == 8) continue;
			if(i == 9) {
				if(table[1] == 0 && val.charAt(9) == val.charAt(10)) {
					table[2] = 1;
				}
				else table[2] = -1;
			}
			int k = val.charAt(i) - val.charAt(past);
			if(k <= 0) table[0] = -1;
			if(k != 0) table[1] = -1;
			if(val.charAt(past) != '6' && val.charAt(past)!= '8')
				table[3] = -1;
			past = i;
		}
		for(int i = 0; i < 4; i++) {
			if(table[i] != -1) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-->0) {
			String str = scanner.next();
			LiscensePlate liscensePlate = new LiscensePlate(str);
			System.out.println(liscensePlate.isGreat()?"YES":"NO");
		}
	}
	
}
