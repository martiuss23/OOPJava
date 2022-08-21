package Number;

import java.util.Scanner;

public class Number {
	private int[] table;
	public Number() {
		table = new int[1000001];
	}
	
	public void numbersHaveDivisorGreaterValIn(int start, int end) {
		for(int i = 2; i <= end; i++) {
			table[i] += 1;
			for(int j = i  + i; j <= end; j+= i) {
				table[j] += i;
			}
		}
		int cnt = 0;
		for(int i = start; i <= end; i++) {
			if(table[i] > i) cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		new Number().numbersHaveDivisorGreaterValIn(start, end);
	}
}
