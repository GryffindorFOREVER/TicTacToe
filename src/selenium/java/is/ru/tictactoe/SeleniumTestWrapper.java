package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeleniumTestWrapper {
	static ChromeDriver driver;
    static String baseUrl;

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        baseUrl = "https://tictactoe-gryffindor.herokuapp.com/";
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}