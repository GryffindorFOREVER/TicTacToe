package is.ru.tictactoe;

public class Board {
	 private static char[][] board;
	 private static final int SIZE = 3;
	 
	 public Board() {
		 board = new char[SIZE][SIZE];
		 for( int row = 0; row < SIZE; row++){
			 for( int col = 0; col < SIZE; col++){
				 board[row][col] = ' ';
			 }
		 }
	 }
	 public void setBoardMove(int row, int col, char player){
		 board[row][col] = player;
	 }

	 public char[][] getBoard(){
	 	return board;
	 }
	 public char getBoardValue(int row, int col){
	 	return board[row][col];
	 }

	 public static int getSize(){
	 	return SIZE;
	 }
}