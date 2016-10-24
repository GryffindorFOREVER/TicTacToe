package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

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
   @Test
   public void testWhatPlayer(){
   		assertEquals('O', TicTacToe.changePlayer('X'));
   }
}
