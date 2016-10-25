package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private static Board board;
	private char player;
	private static final int SIZE = 3;

	public TicTacToe(){
		board = new Board();
		player = 'X';
	}

	public char[][] getBoardFromBoardClass(){
		return board.getBoard();
	}

	public char getPlayer(){
		return this.player;
	}
	
	public static void singlePlay(char player){
		boolean valid = false;
		do 
		{
			System.out.println("Player "+ player + " enter your move, 1-9: ");
			Scanner scanner = new Scanner(System.in);
			int move = scanner.nextInt();
			Board b = new Board();
			
			if(move > 0 && move <= 9 && !(b.setMoved(move))){
				b.setMove(move, player);
				valid = false;
				changePlayer(player);
			}
			else{
				System.out.println("Move is not valid! Try again!");
			}
		} while(!valid);
	}
	
	/*
	public static void main(String[] args) {
		/*int counter = 0;

		b = new Board();
		//player klasi?
		char player = 'X';
		

		while(!b.full()){
			b.display();

			if(b.isWinner()){
				System.out.print("Player " + player + " WINS!");
			}
			//else
		}
		if(!b.isWinner()){
			System.out.print("Draw!");
		}
	}*/

	public static char changePlayer(char player){
		if(player == 'X'){
			return 'O';
		}
		else{
			return 'X';
		}
	}

	public static boolean isWinner(int row, int col){
		 boolean winner = false;
		 char player = board.getBoardValue(row,col);
		 int count = 0;
		 
		 //athugum larett
		 for(int i = 0; i < SIZE; i++){
			 if(board.getBoardValue(i,col) == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum lodrett
		 for(int j = 0; j < SIZE; j++){
			 if(board.getBoardValue(row,j) == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra vinstri
		 for(int i = 0; i < SIZE; i++){
			 if(board.getBoardValue(i,i) == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra haegri
		 for(int j = 0; j < SIZE; j++){
			 if(board.getBoardValue(j,2-j) == player)
				 count++;
		 }
		 winner = win(count);
		 
		 return winner;
	 }

	 public static int getSizeOfBoard(){
	 	return board.getSize();
	 }

 	 public static boolean win(int count){
	 boolean win = false;
	 if(count == SIZE) {
		 win = true;
	 }
	 count = 0;
	 return win;
 	}

	 public static boolean full(){

	 	for(int i = 0; i < SIZE; i++){
	 		for(int j = 0; j < SIZE; j++){
	 			if(board.getBoardValue(i, j) == ' '){
	 				return false;
	 			}
	 		}
	 	}
	 	return true;
	 }
}
