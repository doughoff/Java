package data.structures.maps;

import java.util.*;

public class SystemPropertiesMap {
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		SortedMap<String, String> systemProperties 
			= new TreeMap(System.getProperties());
		
		SortedMap<String, String> systemPropertiesSubMap = 
				systemProperties.subMap("java.runtime.name", "java.vm.info");
		
		System.out.println(systemPropertiesSubMap);
	}
}
