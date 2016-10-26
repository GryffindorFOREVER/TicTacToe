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
	
	public Board getBoard(){
		return this.board;
	}

	public char getPlayer(){
		return this.player;
	}
	
	public int singlePlay(int move){

		if(move > 0 && move <= 9 && !(this.board.setMoved(move))){
			setMove(move, this.player);
			int row = getRow(move);
			int col = getColumn(move);
			if(isWinner(row, col)) {
				return 1;			//return 1 if there is a winner
			}
			changePlayer(this.player);
			return 0;				//return 0 if move was valid
		}
			
		return -1;					//return -1 if move was invalid
		
	}
	
	public void changePlayer(char player){
		if(player == 'X'){
			this.player = 'O';
		}
		else{
			this.player = 'X';
		}
	}
	public char whatPlayer(int row, int col) {
		return board.getBoardValue(row,col);
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
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		 
		 //athugum lodrett
		 for(int j = 0; j < SIZE; j++){
			 if(this.board.getBoardValue(row,j) == currPlayer)
				 count++;
		 }
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		
		 //athugum a ska fra vinstri
		 for(int i = 0; i < SIZE; i++){
			 if(this.board.getBoardValue(i,i) == currPlayer)
				 count++;
		 }
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		 //athugum a ska fra haegri
		 for(int j = 0; j < SIZE; j++){
			 if(this.board.getBoardValue(j,2-j) == currPlayer)
				 count++;
		 }
		 if(count==3){
		 	return true;
		 }
		
		 return winner;
	 }

	 public int getSizeOfBoard(){
	 	return board.getSize();
	}
	
	public int getRow(int number) {
		return (number - 1) / 3;
	}
	
	public int getColumn(int number) {
		return ((number + 2) % 3);
	}
		
 	public void setMove(int move, char player){
		int row = getRow(move);
		int col = getColumn(move);
		this.board.setBoardMove(row, col, player);
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
