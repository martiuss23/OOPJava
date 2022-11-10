package model;

import java.util.Stack;

public class KeyBoard {
	private Stack<Character> pointer;
	private Stack<Character> rightPointer;
	
	public KeyBoard() {
		pointer = new Stack<>();
		rightPointer = new Stack<>();
	}
	
	private void left() {
		if(!pointer.isEmpty()) {
			rightPointer.push(pointer.pop());
		}
	}
	
	private void right() {
		if(!rightPointer.isEmpty()) {
			pointer.push(rightPointer.pop());
		}
	}
	
	private void backspace() {
		if(!pointer.isEmpty()) {
			pointer.pop();
		}
	}
	
	private void add(Character chr) {
		pointer.add(chr);
	}
	
	private void update(Character chr) {
		if(chr == '<') left();
		else if(chr == '>') right();
		else if(chr == '-') backspace();
		else add(chr);
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(Character chr : pointer) {
			sbd.append(chr);
		}
		while(!rightPointer.isEmpty()) {
			sbd.append(rightPointer.pop());
		}
		return sbd.toString();
	}
	
	public static String decode(String str) {
		KeyBoard kb = new KeyBoard();
		for(int i = 0; i < str.length(); i++) {
			kb.update(str.charAt(i));
		}
		return kb.toString();
	}
	
}
