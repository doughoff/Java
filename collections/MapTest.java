package collections;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, String> aHashMap = new HashMap<>();
		aHashMap.put("Game1", "tic tac toe");
		aHashMap.put(null, "Chess");
		aHashMap.put("Game3", "Checkers");
		aHashMap.put("Game3", "Foosball");
		aHashMap.put("Game4", "Chess");
		System.out.println(aHashMap);
		
		Set<String> keySet = aHashMap.keySet();
		for (String key : keySet) {
			System.out.println(key + " = " + aHashMap.get(key));
		}

	}
}
