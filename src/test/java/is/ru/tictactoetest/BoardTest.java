package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetSize(){
		assertEquals(3, Board.getSize());
	}
	
	@Test
	public void testGetBoardValue() {
		Board b = new Board();
		b.setBoardMove(2,2, "X");
		assertEquals("X", b.getBoardValue(2,2));
	}
}
