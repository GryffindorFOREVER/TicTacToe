package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetSize(){
		assertEquals(3, Board.getSize());
	}
	//thetta er comment
	
	@Test
	public void testGetBoardValueX() {
		Board b = new Board();
		b.setBoardMove(2,2, "X");
		assertEquals("X", b.getBoardValue(2,2));
	}
	
	@Test
	public void testGetBoardValueO() {
		Board b = new Board();
		b.setBoardMove(1,1, "O");
		assertEquals("O", b.getBoardValue(1,1));
	}
}
