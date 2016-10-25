package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
/*

	@Test
	public void testDisplayBoard(){
		//prentast board út?
	}

	@Test 
	public void testIsWinner(){

	} */

	@Test
	public void testFull(){
		
		Board b = new Board();
	 	assertFalse(b.full());
	}
	
	@Test
	public void testSetMove() {
		Board b = new Board();
    	b.setMove(8, 'O');
		assertTrue(b.setMoved(8));
	}

	@Test
	public void testWin(){
		assertTrue(Board.win(3));
	}
}