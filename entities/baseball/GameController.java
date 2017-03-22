package entities.baseball;

import static entities.baseball.MLB.*;

public class GameController {
	public void playBaseballSeries() {
		// initialize two teams
		// set players names
		// set coaches
		// set managers
		// set team name 
	// initialize series of games
		// set the teams
		// set location
		// set scores
		BaseballGame game1 = 
				new BaseballGame(ROYALS, CARDINALS, "Kansas City");
		BaseballGame game2 = 
				new BaseballGame(ROYALS, CARDINALS, "St. Louis");
	// play the games
		game1.play();
		game2.play();
		// randomly generate scores and show
		// print out the results of series	
	}	
	
	public static void main(String[] args) {
		// play baseball series between two teams
		GameController gc = new GameController();
		gc.playBaseballSeries();
	}
}
