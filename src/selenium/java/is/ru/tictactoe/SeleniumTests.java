package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SeleniumTests extends SeleniumTestWrapper {

@Test
public void titleMatches() {
	driver.get(baseUrl);
	assertEquals("Wizard TicTacToe", driver.getTitle());
	}
}