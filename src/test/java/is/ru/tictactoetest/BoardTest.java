package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetSize(){
		assertEquals(3, Board.getSize());
	}
}