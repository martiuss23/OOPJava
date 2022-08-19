package Model;

import java.util.Scanner;

public class Combination {
	private int k;
	private int n;
	private int ckn;
	
	public Combination(int n, int k) {
		this.k = k;
		this.n = n;
		ckn = 0;
	}
	
	public void backTrack(int i, int last, StringBuffer str) {
		for(int j = last + 1; j <= n - k + i; j++) {
			str.append((char)('0' + j));
			if(i == k) {
				String s = str.toString();
				for(char id : s.toCharArray()) {
					System.out.print(id + " ");
				}
				System.out.println();
				ckn++;
			}
			else {
				backTrack(i + 1, j, str);
			}
			str.deleteCharAt(i - 1);
		}
	}
	
	public void showCKN() {
		this.backTrack(1, 0, new StringBuffer());
		System.out.println("Tong cong co " + ckn + " to hop");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt();
		new Combination(n, k).showCKN();
		
	}
}
