package Main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		scn.nextLine();
		while(test-- > 0) {
			String listNum = scn.nextLine();
			int even = 0;
			int odd  = 0;
			StringTokenizer stringTokenizer = new StringTokenizer(listNum);
			while(stringTokenizer.hasMoreTokens()) {
				String token = stringTokenizer.nextToken();
				if(Integer.parseInt(token) % 2 == 0) {
					even++;
				}
				else odd++;
			}
			if(even > odd && (even + odd) % 2 == 0) {
				System.out.println("YES");
			}
			else if(even < odd && (even + odd) % 2 == 1) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}
