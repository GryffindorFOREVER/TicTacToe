package is.ru.tictactoe;

import java.util.Scanner;

public class UI {

	private TicTacToe gamePlay;
	private Player player;
	private Scanner in;
	
	public UI(){
		player = new Player();
		gamePlay = new TicTacToe(player);
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
		this.gamePlay = new TicTacToe(player);
		setPlayerNames();

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
	public void setPlayerNames(){
		System.out.println("Player 1, choose a Name: ");
		String player1 = in.next();
		player.setPlayer1(player1);
		gamePlay.setCurrentPlayer(player.getPlayer1());
		
		System.out.println("Player 2, choose a Name: ");
		String player2 = in.next();
		player.setPlayer2(player2);
	}

	public void letsPlay(){
		String move;
		char playAgain = 'b';
		
		setPlayerNames();
		
		while(!gamePlay.full()){
			displayBoard();
			System.out.println("Choose an empty tile from 1 to 9");
			System.out.print(gamePlay.getCurrentPlayer() + ": ");
			move = in.next();
			System.out.println();
			
			if(!gamePlay.checkValid(move)){
				System.out.println();
				System.out.println("Invalid move! Try again");
				System.out.println();
			}
			else{
				int intMove = Integer.parseInt(move);
				gamePlay.setMove(intMove, gamePlay.getMark());
				if(gamePlay.isWinner(intMove)){
					displayBoard();
					System.out.println(gamePlay.getCurrentPlayer() + " is the WINNER!!!");
					System.out.println();
					playAgain = playAgain(playAgain);
				}
				else if(!gamePlay.isWinner(intMove) && gamePlay.full()){
					System.out.println("DRAW!");
					playAgain = playAgain(playAgain);
				}
				else{
					gamePlay.changePlayer(gamePlay.getCurrentPlayer());
					
					
				}

				if(playAgain == 'n'){
					System.out.println("Thanks for playing!");
					break;
				}
			}	
		}
	}
	 
}
