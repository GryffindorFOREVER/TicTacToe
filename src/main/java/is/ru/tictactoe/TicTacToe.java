package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private Board board;
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
	
	public boolean singlePlay(int move){

		if(move > 0 && move <= 9 && !(this.board.setMoved(move))){
			this.board.setMove(move, this.player);
			changePlayer(this.player);
			return true;
		}
			
		return false;
		
	}
	
	/*public char changePlayer(char player){
		if(player == 'X'){
			
			return 'O';
		}
		else{
			return 'X';
		}
	}*/
	
	public void changePlayer(char player){
		if(player == 'X'){
			this.player = 'O';
		}
		else{
			this.player = 'X';
		}
	}

	public boolean isWinner(int row, int col){
		 boolean winner = false;
		 char currPlayer = board.getBoardValue(row,col);
		 int count = 0;
		 
		 //athugum larett
		 for(int i = 0; i < SIZE; i++){
			 if(this.board.getBoardValue(i,col) == currPlayer)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum lodrett
		 for(int j = 0; j < SIZE; j++){
			 if(this.board.getBoardValue(row,j) == currPlayer)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra vinstri
		 for(int i = 0; i < SIZE; i++){
			 if(this.board.getBoardValue(i,i) == currPlayer)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra haegri
		 for(int j = 0; j < SIZE; j++){
			 if(this.board.getBoardValue(j,2-j) == currPlayer)
				 count++;
		 }
		 winner = win(count);
		 
		 return winner;
	 }

	 public int getSizeOfBoard(){
	 	return board.getSize();
	 }

 	 public boolean win(int count){
	 boolean win = false;
	 if(count == SIZE) {
		 win = true;
	 }
	 count = 0;
	 return win;
 	}

	 public boolean full(){

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
