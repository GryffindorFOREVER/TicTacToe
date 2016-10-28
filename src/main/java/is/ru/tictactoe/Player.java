package is.ru.tictactoe;

public class Player {
	
	private String player1;
	private String player2;
	
	Player() {
		player1 = null;
		player2 = null;
	}
	
	public void setPlayer1(String player){
		player1 = player;
	}
	
	public String getPlayer1(){
		return player1;
	}
	public String getPlayer2(){
		return player2;
	}
	
	public void setPlayer2(String player){
		player2 = player;
	}


}