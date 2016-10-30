package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest { 

	public static void main(String args[]) {
    	org.junit.runner.JUnitCore.main("is.ru.tictactoetest.TicTacToeTest");
	}

   @Test
	public void XwinsDiagonalFromUpperLeft()
	{
	   Player player = new Player();
	   	TicTacToe t = new TicTacToe(player);
		t.setMove(1, "X");
		t.setMove(2, "O");
		t.setMove(5, "X");
		t.setMove(3, "O");
		t.setMove(9, "X");
	    assertTrue(t.isWinner(9));
	}

	@Test
	public void OwinsDiagonalFromUpperLeft()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(3, "X");
		t.setMove(1, "O");
		t.setMove(2, "X");
		t.setMove(5, "O");
		t.setMove(8, "X");
		t.setMove(9, "O");
	    assertTrue(t.isWinner(9));
	}
	
	@Test
	public void XwinsDiagonalFromUpperRigth()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(3,"X");
		t.setMove(1, "O");
		t.setMove(5, "X");
		t.setMove(2, "O");
		t.setMove(7, "X");
	    assertTrue(t.isWinner(3));
	}
	
	@Test
	public void OwinsDiagonalFromUpperRigth()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(1,"X");
		t.setMove(3, "O");
		t.setMove(2, "X");
		t.setMove(5, "O");
		t.setMove(8, "X");
		t.setMove(7, "O");
	    assertTrue(t.isWinner(3));
	}

	@Test
	public void XwinsVertical()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(3, "X");
		t.setMove(1, "O");
		t.setMove(6, "X");
		t.setMove(5, "O");
		t.setMove(9, "X");
	    assertTrue(t.isWinner(9));
	}
	
	@Test
	public void OwinsVertical()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(1, "X");
		t.setMove(2, "O");
		t.setMove(3, "X");
		t.setMove(5, "O");
		t.setMove(7, "X");
		t.setMove(8, "O");
	    assertTrue(t.isWinner(5));
	}
	
	@Test
	public void XwinsHorizontal()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(7, "X");
		t.setMove(1, "O");
		t.setMove(8, "X");
		t.setMove(5, "O");
		t.setMove(9, "X");
	    assertTrue(t.isWinner(9));
	}

	@Test
	public void OwinsHorizontal()
	{
		Player player = new Player();
	    TicTacToe t = new TicTacToe(player);
		t.setMove(4, "X");
		t.changePlayer(player.getPlayer2());
		t.setMove(1, "O");
		t.changePlayer(player.getPlayer1());
		t.setMove(9, "X");
		t.changePlayer(player.getPlayer2());
		t.setMove(2, "O");
		t.changePlayer(player.getPlayer1());
		t.setMove(8, "X");
		t.changePlayer(player.getPlayer2());
		t.setMove(3, "O");
	    assertTrue(t.isWinner(3));
	}
	

	@Test
	public void testFull(){
		Player player = new Player();
		TicTacToe b = new TicTacToe(player);
	 	assertFalse(b.full());
	}

	@Test
	public void testGetSizeOfBoard(){
		Player player = new Player();
		TicTacToe b = new TicTacToe(player);
		assertEquals(3, b.getSizeOfBoard());
	}

	@Test
	public void testGetCurrentPlayer(){
		Player player = new Player();
		TicTacToe t = new TicTacToe(player);
		t.setCurrentPlayer("haffa");
		assertEquals("haffa", t.getCurrentPlayer());
	}

	@Test
	public void testGetRow() {
		Player player = new Player();
		TicTacToe t = new TicTacToe(player);
		assertEquals(0, t.getRow(2));
	}
	
	@Test
	public void testGetColumn() {
		Player player = new Player();
		TicTacToe t = new TicTacToe(player);
		assertEquals(1, t.getColumn(2));
	}
	
	@Test
	public void testSetMove() {
		Player player = new Player();
		TicTacToe t = new TicTacToe(player);
    	t.setMove(8 , "O");
		assertTrue(t.setMoved(8));
	}
	@Test
	public void testChangePlayer(){
		Player player = new Player();
		TicTacToe t = new TicTacToe(player);
		player.setPlayer1("haffa");
		player.setPlayer2("ausa");
		t.setCurrentPlayer(player.getPlayer1());
		t.changePlayer(t.getCurrentPlayer());
		assertEquals("ausa", t.getCurrentPlayer());
	}
	
}
