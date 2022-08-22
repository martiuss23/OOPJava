package Model;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MyText {
	private String text;
	
	
	
	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}


	public void reverseWordInText() {
		StringTokenizer token = new StringTokenizer(text);
		StringBuffer stringBuffer = new StringBuffer();
		while(token.hasMoreTokens()) {
			String str = token.nextToken();
			for(int i = str.length() - 1; i >= 0; i--) {
				stringBuffer.append(str.charAt(i));
			}
			stringBuffer.append(" ");
		}
		text = stringBuffer.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		MyText myText = new MyText();
		scanner.nextLine();
		while(test-->0) {
			String text = scanner.nextLine();
			myText.setText(text);
			myText.reverseWordInText();
			System.out.println(myText.getText());
		}
	}
}
