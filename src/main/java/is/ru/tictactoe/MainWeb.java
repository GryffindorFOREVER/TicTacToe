package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import org.json.simple.JSONObject;

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
		tic.setCurrentPlayer(player.getPlayer1());
		post("/turn", (req, res) -> {
			JSONObject obj = new JSONObject();
			obj.put("mark", tic.getMark());
			tic.changePlayer(tic.getCurrentPlayer());
			obj.put("currentPlayer", tic.getCurrentPlayer());
			obj.put("isFull", tic.full());
			//tic.setMove(numer af reitnum)
			//obj.put("",tic.isWinner());
			return obj;
		});

	}
}
