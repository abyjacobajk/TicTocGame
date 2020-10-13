package Tic;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;



public class TicTacToe {
	static Scanner in;
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String one =null;
		Random toss = new Random();
	//	int player;
	//	int computer = 1- player;
		populateEmptyBoard();

		System.out.println("Lets's play  Tic Tac Toe.");
		System.out.println("--------------------------------");
	//	printBoard();
	//	System.out.println("Start palying by choosing X or 0");
		TicTacToe ch = new TicTacToe();
		ch.chooseBoard();
		System.out.println("Enter a number 1 to 9 to make a move:");
	
	while (one == null) {
		int numInput;
		try {
			numInput = in.nextInt();
			if (!(numInput > 0 && numInput <= 9)) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input; re-enter slot number:");
			continue;
		}
		if (board[numInput-1].equals(String.valueOf(numInput))) {
			board[numInput-1] = turn;
			if (turn.equals("X")) {
				turn = "O";
			} else {
				turn = "X";
			}
			printBoard();
			System.out.println("Enter a number 1 to 9 to make next move");
		} else {
			System.out.println("Slot already taken; re-enter slot number:");
			continue;
		}
	}
	}		

	public void chooseBoard() {
		int tossResult=(int) Math.floor(Math.random()*10)%10;
		if(tossResult == 1)
			turn = "O";
		else
	    	turn = "X";
		//Scanner toss = null;
		//int random = (int)(Math.random()* 1);
		//if (toss.nextInt() == random)
		//	
	//			
}	

	static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
}