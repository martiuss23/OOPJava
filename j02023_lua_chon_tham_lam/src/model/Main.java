package model;

import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static String getMinNumber(int size, int sum) {
		if(sum/9 > size || (sum == 0 && size > 1)) return "-1";
		String min = "";
		sum-=1;
		while(sum >= 9) {
			min += '9';
			sum -= 9;
		}
		while(min.length() < size - 1) {
			min = (sum % 9) + min;
			sum /= 9;
		}
		return (sum + 1) + min;
	}
	
	public static String getMaxNumber(int size, int sum) {
		if(sum/9 > size || (sum == 0 && size > 1)) return "-1";
		String max = "";
		while(sum >= 9) {
			max += '9';
			sum -= 9;
		}
		while(max.length() < size) {
			max += (sum% 9);
			sum /= 9;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int sum = scn.nextInt();
		System.out.println(getMinNumber(size, sum) + " " + getMaxNumber(size, sum));
	}
}
