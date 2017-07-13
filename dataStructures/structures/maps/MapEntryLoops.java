package dataStructures.structures.maps;

import java.util.*;

public class MapEntryLoops {
	public static void main(String[] args) {
		Map<String, String> aHashMap = new HashMap<>();
		aHashMap.put("Game1", "Baseball");
		aHashMap.put("Game2", "Soccer");
		aHashMap.put("Game3", "Football");
		aHashMap.put("Game4", "Basketball");
		aHashMap.put("Game5", "Rugby");
		System.out.println(aHashMap);
		System.out.println();
		
		System.out.println("---------------- Hard to read loop");
		Set<Map.Entry<String, String>> keyValues = aHashMap.entrySet();
		if (keyValues != null) {
			Iterator<Map.Entry<String, String>> i = keyValues.iterator();
			while (i.hasNext()) {
				Map.Entry<String, String> keyValue = i.next();
				System.out.printf("Key: %s = Value: %s\n", 
						keyValue.getKey(), keyValue.getValue());
			}
		}

		System.out.println("---------------- Recommended loop");
		for (Map.Entry<String,String> pair : aHashMap.entrySet()) {
			System.out.printf("Key: %s = Value: %s\n", pair.getKey(), pair.getValue());
		}

	}
}
