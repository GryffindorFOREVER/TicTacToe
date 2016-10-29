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
			String sTileNumber = req.queryParams("tileNumber");
			int iTileNumber = (Integer.parseInt(sTileNumber));
			tic.setMove(iTileNumber, tic.getMark());
			obj.put("mark", tic.getMark());
			
			
			//Check if there is a winner
			String endMessage = "";
			boolean isNotWinner = true;
			if(tic.isWinner(iTileNumber)){
				endMessage = tic.getMark();
				endMessage += " is winner";
				tic.resetBoard();
				isNotWinner = false;
				obj.put("isOver", endMessage);
				return obj;
			}
			
			//Check if board is full and display message
//			String full = "";
			if(tic.full() && isNotWinner){
				endMessage = "Draw";
				tic.resetBoard();
				obj.put("isOver", endMessage);
				return obj;
			}
			
			obj.put("isOver", endMessage);
			
			
			tic.changePlayer(tic.getCurrentPlayer());
			obj.put("currentPlayer", tic.getCurrentPlayer());
			
			//obj.put("isFull", tic.full());
			//tic.setMove(numer af reitnum)
			//obj.put("",tic.isWinner());
			return obj;
		});

	}
}
