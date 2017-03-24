package data.structures.maps;

import java.util.*;

public class SystemPropertiesMap {
	private static void print(Map<String,String> systemProperties) {
		System.out.println("---------------------------------------");
		for (Map.Entry<String,String> pair : systemProperties.entrySet()) {
			System.out.printf("%-30s = %s\n", pair.getKey(), pair.getValue());
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		SortedMap<String, String> systemProperties = new TreeMap(System.getProperties());
		print(systemProperties);
		
		// print only Java runtime and specification info
		SortedMap<String, String> systemPropertiesSubMap = 
				systemProperties.subMap("java.runtime.name", "java.vendor");
		print(systemPropertiesSubMap);
		
		// print only user properties
		SortedMap<String, String> userPropertiesSubMap = 
				systemProperties.tailMap("user.country");
		print(userPropertiesSubMap);
		
	}


}
