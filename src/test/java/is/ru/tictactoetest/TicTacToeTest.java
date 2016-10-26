package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest { 

	public static void main(String args[]) {
    	org.junit.runner.JUnitCore.main("is.ru.tictactoetest.TicTacToeTest");
	}
	/*
   @Test
   public void testYOLO() {
	   TicTacToe tic = new TicTacToe();
	   assertEquals("YOLO", tic.YOLO());	
   }	*/
 /*  @Test
   public void testWhatPlayer(){
   		assertEquals('O', TicTacToe.changePlayer('X'));
   }
   */
   @Test
	public void XwinsDiagonalFromUpperLeft()
	{
	   	TicTacToe t = new TicTacToe();
		t.setMove(1,'X');
		t.setMove(2, 'O');
		t.setMove(5, 'X');
		t.setMove(3, 'O');
		t.setMove(9, 'X');
	    assertTrue(t.isWinner(2, 2));
	}
/*	
	@Test
   public void Whatplayer(){
	   Board b = new Board();
	   b.getBoard();
	   TicTacToe t = new TicTacToe();
	   b.setMove(1,'X');
	   assertEquals(t.whatPlayer(0,0), 'X');
	   b.setMove(2,'O');
	   assertEquals(t.whatPlayer(0,1), 'O');
	   
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

	@Test
	public void testFull(){
		TicTacToe b = new TicTacToe();
	 	assertFalse(b.full());
	}

	@Test
	public void testGetSizeOfBoard(){
		TicTacToe b = new TicTacToe();
		assertEquals(3, b.getSizeOfBoard());
	}

	@Test
	public void testGetPlayer(){
		TicTacToe t = new TicTacToe();
		assertEquals('X', t.getPlayer());
	}

	@Test
	public void testSinglePlayPass(){
		TicTacToe b = new TicTacToe();
		assertTrue(b.singlePlay(3));
	}
	
	@Test
	public void testSinglePlayFail(){
		TicTacToe b = new TicTacToe();
		assertFalse(b.singlePlay(12));
	}

}
