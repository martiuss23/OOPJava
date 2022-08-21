package Model;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Name {
	private String name;

	public Name() {
		
	}

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void standardName() {
		StringTokenizer token = new StringTokenizer(name);
		StringBuffer stringBuffer = new StringBuffer();
		boolean ok = false;
		char[] arrChar, arrFirstName = null;
		while(token.hasMoreTokens()) {
			if(!ok) {
				arrFirstName = token.nextToken().toCharArray();
				for(int i = 0; i < arrFirstName.length; i++) {
					arrFirstName[i] = Character.toUpperCase(arrFirstName[i]);
				}
				ok = true;
			}
			else {
				arrChar = token.nextToken().toCharArray();
				arrChar[0] = Character.toUpperCase(arrChar[0]);
				for(int i = 1; i < arrChar.length; i++) {
					arrChar[i] = Character.toLowerCase(arrChar[i]);
				}
				stringBuffer.append(arrChar);
				if(token.hasMoreTokens()) {
					stringBuffer.append(" ");
				}
				else {
					stringBuffer.append(", ");
				}
			}
		}
		stringBuffer.append(arrFirstName);
		name = stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		scanner.nextLine();
		Name name = new Name();
		while(test-->0) {
			String str = scanner.nextLine();
			name.setName(str);
			name.standardName();
			System.out.println(name.getName());
		}
	}
	
}
