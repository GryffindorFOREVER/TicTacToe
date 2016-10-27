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
		 
		 //final TicTacToe tic = new TicTacToe();
		//System.out.println(tic.jsonYOLO());
		
		MainWeb.init();		
		
	}
	
		
	@Override
    public void init() {
		final TicTacToe tic = new TicTacToe();
		System.out.println(tic.jsonYOLO());
		get("/random", (req, res) -> tic.getPlayer());
	}
}
