package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class MainWeb implements SparkApplication{
	
	public static void main(String[] args){
		
		staticFileLocation("/public");
		SparkApplication MainWeb = new MainWeb();

        String port = System.getenv("PORT");
         if (port != null) {
             setPort(Integer.valueOf(port));
         }
		
		MainWeb.init();		
		
	}
	
	@Override
    public void init() {
		Player player = new Player();
		final TicTacToe tic = new TicTacToe(player);
		post("/random", (req, res) -> tic.getCurrentPlayer());
	}
}
