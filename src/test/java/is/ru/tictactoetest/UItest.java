package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class UItest {
	
	@Test
	public void checkIfValid(){
		UI ui = new UI();
		assertTrue(ui.checkValid("3"));
	}
	
	@Test
	public void checkIfInvalid(){
		UI ui = new UI();
		assertFalse(ui.checkValid("12"));
	}
	
	@Test
	public void checkIfChar(){
		UI ui = new UI();
		assertFalse(ui.checkValid("b"));
	}
	
	@Test
	public void checkIfCharSequence(){
		UI ui = new UI();
		assertFalse(ui.checkValid("YOLO"));
	}
}