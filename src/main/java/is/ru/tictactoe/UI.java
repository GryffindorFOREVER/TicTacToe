package is.ru.tictactoe;

public class UI {

	private TicTacToe gamePlay;
	
	public UI(){
		gamePlay = new TicTacToe();
	}

	public void displayBoard(){
		char[][] b = gamePlay.getBoardFromBoardClass(); 
		int sz = gamePlay.getSizeOfBoard();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

	public void play(){
		displayBoard();
		System.out.println("Choose a tile from 1 to 9");
		System.out.println("Player " + gamePlay.getPlayer() + " make your move ");
	}


	 	
	 	/*int k = 0;
		 	for(int i = 0; i < SIZE; i++){
		 		for(int j = 0; j < SIZE; j++){
		 			if(board[i][j] == ' '){
		 				System.out.print(k);
		 			}
		 			else{
		 				System.out.print(board[i][j]);
		 			}
		 			k++;
		 		}
		 		System.out.println();
		 	}
	 	}*/
}
