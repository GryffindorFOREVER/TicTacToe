package is.ru.tictactoe;

public class Board {
	 private static char[][] board;
	 private static final int SIZE = 3;
	 
	 public Board() {
		 board = new char[SIZE][SIZE];
		 int i = 1;
		 for( int row = 0; row < SIZE; row++){
			 for( int col = 0; col < SIZE; col++){
				 board[row][col] = ' ';
			 }
		 }
	 }
	 
	 public void setMove(int move, char player){
		int row = (move - 1) / 3;
		int column = (move + 2) % 3;
		this.board[row][column] = player;
	 }
	 
	 public boolean setMoved(int move) {
		int row = (move - 1) / 3;
		int column = (move + 2) % 3;
		if(board[row][column] == ' ') {
			return false;
		}
		return true;
	 }

	 public char[][] getBoard(){
	 	return this.board;
	 }
	 public char getBoardValue(int row, int col){
	 	return board[row][col];
	 }

	 public static int getSize(){
	 	return SIZE;
	 }
}