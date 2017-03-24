package data.structures.maps;

import java.util.*;

public class PropertiesMap {
	public static void main(String[] args) {
		SortedMap<String, String> systemProperties 
			= new TreeMap(System.getProperties());
		
		SortedMap<String, String> systemPropertiesSubMap = 
				systemProperties.subMap("java.runtime.name", "java.vm.info");
		
		System.out.println(systemPropertiesSubMap);
	}
}
