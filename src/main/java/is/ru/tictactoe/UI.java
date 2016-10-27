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

	public char playAgain(char playAgain){
		do {
			System.out.print("Do you want to play again (y/n): ");
			playAgain = in.next().charAt(0); 

			if(playAgain == 'y'){
				newGame();
				break;
			}
			else if(playAgain != 'n'){
				System.out.println("Please choose y or n. ");
			}

		} while(playAgain != 'y' && playAgain != 'n');

		return playAgain;
	}

	public void letsPlay(){
		String move;
		char playAgain = 'b';

		while(!gamePlay.full()){
			displayBoard();
			System.out.println("Choose an empty tile from 1 to 9");
			System.out.print("Player " + gamePlay.getPlayer() + ": ");
			move = in.next();
			System.out.println();
			
			if(!gamePlay.checkValid(move)){
				System.out.println();
				System.out.println("Invalid move! Try again");
				System.out.println();
			}
			else{
				int intMove = Integer.parseInt(move);
				gamePlay.setMove(intMove, gamePlay.getPlayer());
				if(gamePlay.isWinner(intMove)){
					displayBoard();
					System.out.println(gamePlay.getPlayer() + " is the WINNER!!!");
					System.out.println();
					playAgain = playAgain(playAgain);
				}
				else if(!gamePlay.isWinner(intMove) && gamePlay.full()){
					System.out.println("DRAW!");
					playAgain = playAgain(playAgain);
				}
				else{
					gamePlay.changePlayer(gamePlay.getPlayer());	
				}

				if(playAgain == 'n'){
					System.out.println("Thanks for playing!");
					break;
				}
			}	
		}
	} 
}
