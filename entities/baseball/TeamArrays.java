package entities.baseball;

import java.util.Arrays;

public class TeamArrays {

	public static void main(String[] args) {
		Team[] americanLeague = new Team[15];
		Team[] nationalLeague = new Team[15];
		
		Team[][] mlb = {americanLeague, nationalLeague};
		
		Team royals = new Team();
		royals.setName("Kansas City Royals");
		americanLeague[6] = royals;
		
		Team cards = new Team();
		cards.setName("St. Louis Cardinals");
		nationalLeague[13] = cards;
		
		System.out.println(americanLeague);
		System.out.println(Arrays.toString(americanLeague));
		
		System.out.println(Arrays.deepToString(mlb));
		
		for (Team team : americanLeague) {
			System.out.println(team);
		}
	}
}
