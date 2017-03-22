package entities.baseball;

import java.util.*;

public class BaseballGame {
	public static final int MAX_SCORE_PER_INNING = 4;
	private static Random generator = new Random();
	//------------------------------------- data structure
	private Team team1;
	private Team team2;
	private String location;
	private ArrayList<Integer> score1;
	private ArrayList<Integer> score2;
	private int total1;
	private int total2;
	//------------------------------------- constructors
	public BaseballGame(Team team1, Team team2, String location) {
		this(team1, team2, location, new ArrayList<Integer>(), new ArrayList<Integer>());
	}
	public BaseballGame(Team team1, Team team2, String location, ArrayList<Integer> score1, ArrayList<Integer> score2) {
		super();
		this.setTeam1(team1);
		this.setTeam2(team2);
		this.setLocation(location);
		this.setScore1(score1);
		this.setScore2(score2);
	}
	//------------------------------------- instance methods
	public void play() {
		// initialization
		
		System.out.println("Playing a game...");
		System.out.println(this.team1);
		System.out.println(this.team2);
		// play the first 9 innings
		for (int i = 1; i <= 9; i++) {
			// get score for team1 and store in total and inning
			playInning();
		}
		// if a tie, play innings until no tie
		while (total1 == total2){
			System.out.println("Extra inning");
			playInning();
		}
		String boxScoreFormat = "%-20s %s Total: %d\n";
		System.out.printf(boxScoreFormat, this.getTeam1().getName(), this.getScore1(), this.total1);
		System.out.printf(boxScoreFormat, this.getTeam2().getName(), this.getScore2(), this.total2);
	}
	private void playInning() {
		int score = generator.nextInt(MAX_SCORE_PER_INNING);
		this.getScore1().add(score);
		this.total1 += score;
		
		// get score for team2 and store in total and inning
		score = generator.nextInt(MAX_SCORE_PER_INNING);
		this.getScore2().add(score);
		this.total2 += score;
	}
	//-------------------------------------- getters and setters
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Integer> getScore1() {
		return score1;
	}
	public void setScore1(ArrayList<Integer> score1) {
		this.score1 = score1;
	}
	public ArrayList<Integer> getScore2() {
		return score2;
	}
	public void setScore2(ArrayList<Integer> score2) {
		this.score2 = score2;
	}
}
