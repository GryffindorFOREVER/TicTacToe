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
	 public boolean isWinner(int row, int col){
		 boolean winner = false;
		 char player = board[row][col];
		 int count = 0;
		 
		 //athugum larett
		 for(int i : SIZE){
			 if(board[i][col] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum lodrett
		 for(int j : SIZE){
			 if(board[row][j] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 //athugum a ska fra vinstri
		 for(int i : SIZE){
			 if(board[i][i] == player)
				 count++
		 }
		 winner = win(count);
		 
		 //athugum a ska fra haegri
		 for(int j : SIZE){
			 if(board[j][2-j] == player)
				 count++;
		 }
		 winner = win(count);
		 
		 return winner;
		 
	 }
	 private boolean win(int count){
		 boolean win = false;
		 if(count == SIZE) {
			 win = true;
		 }
		 count = 0;
		 return win;
	 }

