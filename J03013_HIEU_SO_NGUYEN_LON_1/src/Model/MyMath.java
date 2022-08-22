package Model;

import java.util.Scanner;

public class MyMath {
	
	public static int cmp(char[] nb1, char[] nb2) {
		int len1 = nb1.length, len2 = nb2.length;
		if(len1 > len2) return 1;
		if(len1 < len2) return -1;
		for(int i = len1 - 1; i >= 0; i--) {
			if(nb1[i] > nb2[i]) return 1;
			else if(nb1[i] < nb2[i]) return -1;
		}
		return 0;
	}
	
	public static String sub(char[] nb1, char[] nb2) {
		if (nb1 == null || nb2 == null ) {
			return "";
		}
		int cp = MyMath.cmp(nb1, nb2);
		if(cp == -1) {
			char[] tmp = nb1;
			nb1 = nb2;
			nb2 = tmp;
		}
		
		int len1 = nb1.length, len2 = nb2.length;
		int carry = 0;
		StringBuffer str = new StringBuffer("");
		for(int i = 0; i < len2; i++) {
			int val = (nb1[i] - '0') - (nb2[i] - '0') - carry;
			if(val < 0) {
				val += 10;
				carry = 1;
			}
			else carry = 0;
			nb1[i] = (char)((int)'0' + val);
			str.append(nb1[i]);
		}
		for(int i = len2; i < len1; i++) {
			int val = (nb1[i] - '0') - carry;
			if(val < 0) {
				val += 10;
				carry = 1;
			}
			else carry = 0;
			nb1[i] = (char)((int)'0' + val);
			str.append(nb1[i]);
			
		}
		return str.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int test = ip.nextInt();
		while(test > 0) {
			test--;
			String num1 = ip.next();
			String num2 = ip.next();
			System.out.println(MyMath.sub(new StringBuffer(num1).reverse().toString().toCharArray(), 
					new StringBuffer(num2).reverse().toString().toCharArray()));
		}
	}
	
	
}
