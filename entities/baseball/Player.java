package entities.baseball;

public class Player extends Participant {
	//---------------------------------- data structure
	
	//---------------------------------- constructors
	public Player() {
		this("Unnamed player");
	}
	public Player(String name) {
		super(name);
	}
}
