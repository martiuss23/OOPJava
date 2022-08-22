package Model;

import java.util.Scanner;

public class MyMath {
	
	public static int cmp(char[] nb1, int len1, char[] nb2, int len2) {
		if(len1 < len2) return -1;
		else if(len1 > len2) return 1;
		for(int i = len1 - 1; i >= 0; i--) {
			if(nb1[i] > nb2[i]) return 1;
			else if(nb1[i] < nb2[i]) return -1;
		}
		return 0;
	}
	
	public static String sub(char[] nb1, char[] nb2) {
		int len1 = nb1.length - 1, len2 = nb2.length - 1;
		while(len1 > 0 && nb1[len1] == '0') len1--;
		while(len2 > 0 && nb2[len2] == '0') len2--;
		int cp = MyMath.cmp(nb1, len1, nb2, len2);
		if(cp == -1) {
			char[] tmp = nb1;
			nb1 = nb2;
			nb2 = tmp;
			int temp = len1;
			len1 = len2;
			len2 = temp;
		}
		else if(cp == 0) return "0";
		
		int carry = 0;
		for(int i = 0; i <= len2; i++) {
			int val = (nb1[i] - '0') - (nb2[i] - '0') - carry;
			if(val < 0) {
				val += 10;
				carry = 1;
			}
			else carry = 0;
			nb1[i] = (char)((int)'0' + val);
		}
		for(int i = len2 + 1; i <= len1; i++) {
			int val = (nb1[i] - '0') - carry;
			if(val < 0) {
				val += 10;
				carry = 1;
			}
			else carry = 0;
			nb1[i] = (char)((int)'0' + val);
		}
		while(len1 > 0 && nb1[len1] == '0') len1--;
		StringBuffer str = new StringBuffer("");
		if(cp == -1) str.append("-");
		while(len1 >= 0) {
			str.append(nb1[len1]);
			len1--;
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String num1 = ip.next();
		String num2 = ip.next();
		System.out.println(MyMath.sub(new StringBuffer(num1).reverse().toString().toCharArray(), 
				new StringBuffer(num2).reverse().toString().toCharArray()));
	}
	
	
}
