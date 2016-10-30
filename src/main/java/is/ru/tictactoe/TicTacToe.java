package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private Board board;
	private Player player;
	private String currentPlayer;
	private String mark;
	private static final int SIZE = 3;

	public TicTacToe(Player daPlayer){
		board = new Board();
		mark = "X";
		currentPlayer = null;
		player = daPlayer;
	}

	public char[][] getBoardFromBoardClass(){
		return board.getBoard();
	}
	
	public Board getBoard(){
		return this.board;
	}

	public void setCurrentPlayer(String player){
		currentPlayer = player;
	}
	public String getCurrentPlayer(){
		return currentPlayer;
	}

	public void changePlayer(String currentPlayer){

		if(currentPlayer == player.getPlayer1()){
			setCurrentPlayer(player.getPlayer2());
			mark = "O";
		}
		else{
			setCurrentPlayer(player.getPlayer1());
			mark = "X";
		}
	}
	
	public boolean isWinner(int move){
		int row = getRow(move);
		int col = getColumn(move);
		char mark = board.getBoardValue(row,col).charAt(0);
		int count = 0;
	
		 //athugum larett
		 for(int i = 0; i < SIZE; i++){
			char check;
			if(this.board.getBoardValue(i, col) != null) {
				check = this.board.getBoardValue(i, col).charAt(0);
				if(check == mark)
					count++;
			}
		 }
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		 
		 //athugum lodrett
		 for(int j = 0; j < SIZE; j++){
			 char check;
			 if(this.board.getBoardValue(row, j) != null) {
				check = this.board.getBoardValue(row, j).charAt(0);
				if(check == mark)
					count++;
			 }
		 }
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		
		 //athugum a ska fra vinstri
		 for(int i = 0; i < SIZE; i++){
			 char check;
			 if(this.board.getBoardValue(i,i) != null) {
				check = this.board.getBoardValue(i,i).charAt(0);
				if(check == mark) 
					count++;
			 }
		 }
		 if(count==3){
			 	return true;
		 }
		 count = 0;
		 //athugum a ska fra haegri
		 for(int j = 0; j < SIZE; j++){
			 char check;
			 if(this.board.getBoardValue(j,2-j) != null) {
				check = this.board.getBoardValue(j,2-j).charAt(0);
				if(check == mark)
					count++;
			 }
		 }
		 if(count==3){
		 	return true;
		 }
		
		 return false;
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
	
	public String getMark(){
		return mark;
	}
		
 	public void setMove(int move, String mark){
		int row = getRow(move);
		int col = getColumn(move);
		this.board.setBoardMove(row, col, mark);
	}
	 
	public boolean setMoved(int move) {
		int row = getRow(move);
		int column = getColumn(move);
		if(this.board.getBoardValue(row, column) == null) {
			return false;
		}
		return true;
	 }

	 public boolean full(){

	 	for(int i = 0; i < SIZE; i++){
	 		for(int j = 0; j < SIZE; j++){
	 			if(board.getBoardValue(i, j) == null){
	 				return false;
	 			}
	 		}
	 	}
	 	return true;
	 }
	 
	 public void resetBoard(){
		 board = new Board();
		 setCurrentPlayer(player.getPlayer1());
		 this.mark = "X";
	 }
}
