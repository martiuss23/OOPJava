package model;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner input = new Scanner(System.in);
		ScoreBoard scoreBoard = new ScoreBoard();
		int amount = Integer.parseInt(input.nextLine());
		for(int index = 1; index <= amount; index++) {
			scoreBoard.addCandidate(new Candidate(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine())));
		}
		System.out.print(scoreBoard);
	}
}
//3
//Doan Thi Kim
//13/03/1982
//10
//10
//Dinh Thi Ngoc Ha
//03/09/1996
//7.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9