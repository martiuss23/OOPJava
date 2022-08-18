package Model;

import java.util.HashMap;
import java.util.Scanner;

public class PrimeNumber {
	private int[] table;
	private long result;
	
	public long getResult() {
		return result;
	}
	
	public void setResult(long result) {
		this.result = result;
	}
	
	public PrimeNumber(){
		result = 0;
		table = new int[2000001];
		table[0] = -1;
		table[1] = -1;
		for(int i = 2; i <= Math.sqrt(2000000) ; i++) {
			if(table[i] == 0) {
				for(int j = i*i; j < table.length; j+= i) {
					if(table[j] == 0)
						table[j] = -1;
				}
				
			}
		}
	}
	
	public void addItem(int item) {
		if(table[item] == 0) {
			result += item;
			return;
		}
		for(int i = 2; i <= Math.sqrt(item) && table[i] == 0; i++) {
			while(item % i == 0) {
				result += i;
				item /= i;
			}
		}
		if(item > 1) result += item;
	}
	
	public static void main(String[] args) {
		int size, num;
		Scanner scanner = new Scanner(System.in);
		PrimeNumber primeNumber = new PrimeNumber();
		size = scanner.nextInt();		
		for(int i = 0; i < size; i++) {
			num = scanner.nextInt();
			primeNumber.addItem(num);
		}
		System.out.println(primeNumber.getResult());
		
		
	}
	
}
