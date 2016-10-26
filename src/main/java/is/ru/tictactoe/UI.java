package is.ru.tictactoe;

import java.util.Scanner;

public class UI {

	private TicTacToe gamePlay;
	private Scanner in;
	
	public UI(){
		gamePlay = new TicTacToe();
		in = new Scanner(System.in);
	}


	public void displayBoard(){
		char[][] b = gamePlay.getBoardFromBoardClass(); 
		int sz = gamePlay.getSizeOfBoard();

		for(int i = 0; i < sz; i++){
			for(int j = 0; j < sz; j++){
				System.out.print("[");
				System.out.print(b[i][j]);
				System.out.print("]");
			}
			System.out.println();
		}
	}

	public void newGame(){
		this.gamePlay = new TicTacToe();
	}

	public void letsPlay(){
		int move;
		String playAgain = "";

		while(!gamePlay.full() || playAgain == "y" || playAgain == "Y"){
			displayBoard();
			System.out.println("Choose an empty tile from 1 to 9");
			System.out.print("Player " + gamePlay.getPlayer() + ": ");
			move = in.nextInt();
			System.out.println();
			
			if(!gamePlay.checkValid(move)){
				System.out.println();
				System.out.println("Invalid move! Try again");
				System.out.println();
			}
			else{
				gamePlay.setMove(move, gamePlay.getPlayer());
				if(gamePlay.isWinner(move)){
					displayBoard();
					System.out.println(gamePlay.getPlayer() + " is the WINNER!!!");
					System.out.print("Do you want to play again (y/n): ");
					playAgain = in.next();
					System.out.println();
					System.out.println(playAgain);
					if(playAgain == "y" || playAgain == "Y"){
						newGame();
					}
				}
				else{
					gamePlay.changePlayer(gamePlay.getPlayer());	
				}
				
			}
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
