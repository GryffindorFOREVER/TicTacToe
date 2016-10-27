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
		String move;
		char playAgain = 'n';

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
					System.out.print("Do you want to play again (y/n): ");
					playAgain = in.next().charAt(0);
					System.out.println();
					if(playAgain == 'y'){
						newGame();
					}else{
						System.out.println("Thanks for playing!");
						break;
					}
				}
				else{
					gamePlay.changePlayer(gamePlay.getPlayer());	
				}
			}
		}
	} 
}
