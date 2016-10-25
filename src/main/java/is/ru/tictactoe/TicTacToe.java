package is.ru.tictactoe;

public class TicTacToe {
	private Board board;
	private char player;

	public TicTacToe(){
		board = new Board();
		player = 'X';
	}

	public char[][] getBoardFromBoardClass(){
		return board.getBoard();
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
}
