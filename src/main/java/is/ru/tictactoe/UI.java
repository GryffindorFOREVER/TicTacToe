package is.ru.tictactoe;

public class UI {

	private TicTacToe gamePlay;
	
	public UI(){
		gamePlay = new TicTacToe();
	}

	public void displayBoard(){
		char[][] b = gamePlay.getBoardFromBoardClass(); 
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(b[i][j]);
				System.out.print("jojo");
			}
			System.out.println();
		}
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
