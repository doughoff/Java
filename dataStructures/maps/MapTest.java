package dataStructures.maps;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String[]> games 
			= new TreeMap<String, String[]>();
		games.put("Doug's favorites", new String[] {"Chess"});
		games.put("John's favorites", new String[] {"Risk"});
		games.put("Hardest", 		 new String[] {"Go", "3-d chess"});
		games.put("Easiest", 		 new String[] {"Tic-tac-toe"});
		games.put("Next to learn",   new String[] {"Mahjong"});
		
		System.out.println(games);
		for (Map.Entry<String, String[]> entry : 
				games.entrySet()) {
			System.out.printf("Key: %s, Value: %s %n",
					entry.getKey(), Arrays.toString(entry.getValue())
					);
		}
	}
}
