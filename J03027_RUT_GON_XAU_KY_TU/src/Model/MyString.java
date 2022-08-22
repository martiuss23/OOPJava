package Model;
import java.util.Scanner;
import java.util.Stack;

public class MyString {
	private String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
	
	public String shortenString() {
		Stack<Character> stk = new Stack<>();
		for(Character chr : myString.toCharArray()) {
			if(stk.empty() || chr != stk.peek()) {
				stk.push(chr);
			}
			else {
				stk.pop();
			}
		}
		if(stk.empty()) return "Empty String";
		else {
			StringBuffer res = new StringBuffer();
			while(!stk.empty()) {
				res.append(stk.pop());
			}
			return res.reverse().toString();
		}
	}
	
	public static void main(String[] args) {
		MyString myString = new MyString();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		myString.setMyString(s);
		System.out.println(myString.shortenString());
	}
}
