package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
/*
	@Test
	public void XwinsDiagonalFromUpperLeft()
	{
		TicTacToe.Move(board[1][1], board[1][0], board[0][0], board[1][2], board[2][2]);
	    Assert.Equals(Board.isWinner(2, 2), true);
	}
	
	@Test
	public void OwinsDiagonalFromUpperLeft()
	{
		TicTacToe.Move(board[1][2], board[0][0], board[0][2], board[1][1], board[2][0], board[2][2]);
	    Assert.Equals(Board.isWinner(2, 2), true);
	}
	
	@Test
	public void XwinsDiagonalFromUpperRigth()
	{
		TicTacToe.Move(board[0][2], board[0][0], board[1][1], board[0][1], board[2][0]);
	    Assert.Equals(Board.isWinner(2, 0), true);
	}
	
	@Test
	public void OwinsDiagonalFromUpperRigth()
	{
		TicTacToe.Move(board[2][2], board[0][2], board[0][0], board[1][1], board[0][1], board[2][0]);
	    Assert.Equals(Board.isWinner(2, 0), true);
	}
	
	@Test
	public void XwinsVertical()
	{
		TicTacToe.Move(board[1][1], board[0][0], board[0][1], board[2][2], board[2][1]);
	    Assert.Equals(Board.isWinner(2, 1), true);
	}
	
	@Test
	public void OwinsVertical()
	{
		TicTacToe.Move(board[1][2], board[1][1], board[0][0], board[0][1], board[2][2], board[2][1]);
	    Assert.Equals(Board.isWinner(2, 1), true);
	}
	
	@Test
	public void XwinsHorizontal()
	{
		TicTacToe.Move(board[1][1], board[0][0], board[1][0], board[2][2], board[1][2]);
	    Assert.Equals(Board.isWinner(1, 2), true);
	}
	
	@Test
	public void OwinsHorizontal()
	{
		TicTacToe.Move(board[0][1], board[1][1], board[0][0], board[1][0], board[2][2], board[1][2]);
	    Assert.Equals(Board.isWinner(1, 2), true);
	}*/

	/*@Test
	public void testDisplayBoard(){
		//prentast board út?
	}

	@Test
	public void testFull(){
		
		Board b = new Board();
		
		/*for(int i = 0; i < 3; i++){
	 		for(int j = 0; j < 3; j++){
	 			b[i][j] = ' ';
	 		}
	 	}*/
	 //	assertFalse(b.full());
	//}
	
	@Test
	public void testSetMove() {
		Board b = new Board();
    	b.setMove(8, 'O');
		assertTrue(b.setMoved(8));
	}

	//}
	/*@Test 
	public void testIsWinner(){

	} */

	@Test
	public void testWin(){
		assertTrue(Board.win(3));
	}
}