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
	   	TicTacToe t = new TicTacToe();
		t.setMove(1,'X');
		t.setMove(2, 'O');
		t.setMove(5, 'X');
		t.setMove(3, 'O');
		t.setMove(9, 'X');
	    assertTrue(t.isWinner(9));
	}

	@Test
	public void OwinsDiagonalFromUpperLeft()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(3,'X');
		t.setMove(1, 'O');
		t.setMove(2, 'X');
		t.setMove(5, 'O');
		t.setMove(8, 'X');
		t.setMove(9, 'O');
	    assertTrue(t.isWinner(9));
	}
	
	@Test
	public void XwinsDiagonalFromUpperRigth()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(3,'X');
		t.setMove(1, 'O');
		t.setMove(5, 'X');
		t.setMove(2, 'O');
		t.setMove(7, 'X');
	    assertTrue(t.isWinner(3));
	}
	
	@Test
	public void OwinsDiagonalFromUpperRigth()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(1,'X');
		t.setMove(3, 'O');
		t.setMove(2, 'X');
		t.setMove(5, 'O');
		t.setMove(8, 'X');
		t.setMove(7, 'O');
	    assertTrue(t.isWinner(3));
	}

	@Test
	public void XwinsVertical()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(3,'X');
		t.setMove(1, 'O');
		t.setMove(6, 'X');
		t.setMove(5, 'O');
		t.setMove(9, 'X');
	    assertTrue(t.isWinner(9));
	}
	
	@Test
	public void OwinsVertical()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(1,'X');
		t.setMove(2, 'O');
		t.setMove(3, 'X');
		t.setMove(5, 'O');
		t.setMove(7, 'X');
		t.setMove(8, 'O');
	    assertTrue(t.isWinner(5));
	}
	
	@Test
	public void XwinsHorizontal()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(7,'X');
		t.setMove(1, 'O');
		t.setMove(8, 'X');
		t.setMove(5, 'O');
		t.setMove(9, 'X');
	    assertTrue(t.isWinner(9));
	}

	@Test
	public void OwinsHorizontal()
	{
	    TicTacToe t = new TicTacToe();
		t.setMove(4,'X');
		t.setMove(1, 'O');
		t.setMove(9, 'X');
		t.setMove(2, 'O');
		t.setMove(8, 'X');
		t.setMove(3, 'O');
	    assertTrue(t.isWinner(3));
	}
	

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
	public void checkIfValid(){
		TicTacToe b = new TicTacToe();
		assertTrue(b.checkValid(3));
	}
	
	@Test
	public void checkIfInvalid(){
		TicTacToe b = new TicTacToe();
		assertFalse(b.checkValid(12));
	}
	
	@Test
	public void testGetRow() {
		TicTacToe t = new TicTacToe();
		assertEquals(0, t.getRow(2));
	}
	
	@Test
	public void testGetColumn() {
		TicTacToe t = new TicTacToe();
		assertEquals(1, t.getColumn(2));
	}
	
	@Test
	public void testSetMove() {
		TicTacToe t = new TicTacToe();
    	t.setMove(8 , 'O');
		assertTrue(t.setMoved(8));
	}
	
}
