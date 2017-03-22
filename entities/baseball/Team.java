package entities.baseball;

import java.util.Arrays;

public class Team {
	//--------------------------------------------------- data structure
	private static final int PLAYERS_ON_FIELD = 9;
	// manager
	private Manager manager;
	// coaches array
	private Coach[] coaches;
		// players array
	private Player[] players;
	
	private String name;
	//--------------------------------------------------- constructors
	public Team() {
		this(new Manager(), new Coach[]{}, new Player[]{}, "Unnamed team");
	}
	
	public Team(Manager manager, Coach[] coaches, Player[] players, String name) {
		super();
		this.manager = manager;
		this.coaches = coaches;
		this.players = players;
		this.name = name;
	}

	//---------------------------------------------------- processes
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Coach[] getCoaches() {
		return coaches;
	}
	public void setCoaches(Coach[] coaches) {
		this.coaches = coaches;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	

	@Override
	public String toString() {
		return "Team [manager=" + manager + ", coaches=" + Arrays.toString(coaches) + ", players="
				+ Arrays.toString(players) + ", name=" + name + "]";
	}

	//---------------------------------------------------- test
	public static void main(String[] args) {
		Team royals = new Team();
		Manager yost = new Manager("Ned Yost");
		Coach[] coachRoster = { new Coach(), new Coach(), new Coach() };
		Player[] playerRoster = { new Player(), new Player(), new Player() };
		
		royals.manager = yost;
		royals.coaches = coachRoster;
		royals.players = playerRoster;
		
		Team myFavoriteTeam = royals;
		System.out.println(royals);
		System.out.println(myFavoriteTeam);
	}
}
