package entities.baseball;

public class MLB {
	
	// American league
		// Kansas City Royals
	private static Coach[] royalsCoaches = {
		new Coach("Don Wakamatsu, Bench Coach"),
		new Coach("Dave Eilan, Pitching Coach"),
		new Coach("Dale Sveum, Hitting Coach")
	};
	private static Player[] royalsPlayers = {
		new Player("Alcides Escobar"),
		new Player("Eric Hosmer"),
		new Player("Whit Merrifield")
	};
	public static final Team ROYALS = new Team( new Manager("Ned Yost"), 
				royalsCoaches, royalsPlayers, "Kansas City Royals");
		// Orioles, Red Sox, White Sox, Indians...
	
	// National league
		// St. Louis Cardinals
	public static final Team CARDINALS = new Team ();
		// Diamondbacks, Braves, Cubs, Reds...
	
	public static final Team[] AMERICAN_LEAGUE = { ROYALS };
	public static final Team[] NATIONAL_LEAGUE = { CARDINALS };

}
