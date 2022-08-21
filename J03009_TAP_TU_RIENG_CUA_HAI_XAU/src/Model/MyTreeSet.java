package Model;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MyTreeSet {
	private TreeSet<String> myTreeSet;
	
	public MyTreeSet() {
		myTreeSet = new TreeSet<>();
	}
	
	public void add(String str) {
		StringTokenizer token = new StringTokenizer(str);
		while(token.hasMoreTokens()) {
			myTreeSet.add(token.nextToken());
		}
	}
	
	public void reset() {
		myTreeSet.clear();
	}
	
	public boolean contains(String str) {
		return myTreeSet.contains(str);
	}
	
	public void printElementsNotIn(MyTreeSet obj) {
		this.myTreeSet.forEach((item)->System.out.print(obj.contains(item)?"":item + " "));
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyTreeSet myTreeSet1 = new MyTreeSet();
		MyTreeSet myTreeSet2 = new MyTreeSet();
		scanner.nextLine();
		while(test--> 0) {
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			
			myTreeSet1.add(str1);
			myTreeSet2.add(str2);
			
			
			myTreeSet1.printElementsNotIn(myTreeSet2);
			myTreeSet1.reset();
			myTreeSet2.reset();
		}
	}
}
