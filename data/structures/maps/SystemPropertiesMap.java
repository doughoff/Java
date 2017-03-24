package data.structures.maps;

import java.util.*;

public class SystemPropertiesMap {
	private static void print(Map<String,String> mapOfStrings) {
		System.out.println("---------------------------------------");
		for (Map.Entry<String,String> pair : mapOfStrings.entrySet()) {
			System.out.printf("%-30s = %s\n", pair.getKey(), pair.getValue());
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		SortedMap<String, String> systemPropertiesMap = new TreeMap(System.getProperties());
		print(systemPropertiesMap);
		
		// print only Java runtime and specification info
		SortedMap<String, String> systemPropertiesSubMap = 
				systemPropertiesMap.subMap("java.runtime.name", "java.vendor");
		print(systemPropertiesSubMap);
		
		// print only user properties
		SortedMap<String, String> userPropertiesSubMap = 
				systemPropertiesMap.tailMap("user.country");
		print(userPropertiesSubMap);
		
	}


}
