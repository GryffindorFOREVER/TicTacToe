package is.ru.tictactoe;

public class Board {
	 private char[][] board;
	 private final int SIZE = 3;
	 
	 public Board() {
		 board = new char[SIZE][SIZE];
		 int i = 1
		 for( int row : SIZE){
			 for( int col : SIZE){
				 board[row][col] = i;
				 i++;
			 }
		 }
	 }
}

