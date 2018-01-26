package dataStructures.properties;

import java.util.*;

public class SystemProperties {
	public static Properties systemProperties;
	public static TreeMap<String,String> systemPropertiesMap;
	
	static {
		systemProperties = System.getProperties();
		systemPropertiesMap = 
				new TreeMap(systemProperties);
	}
	
	public static void main(String[] args) {
		System.out.println(systemProperties);
		System.out.println("---Properties------------");
		systemProperties.list(System.out);
		System.out.println("---Map------------");
		System.out.println(systemPropertiesMap);
		
		// find all properties with path in the key	
		System.out.println("-------Path props---------");
		for (Map.Entry<String, String> entry : 
				systemPropertiesMap.entrySet()) {
			if (entry.getKey().toLowerCase().contains("path")) {
				System.out.printf("%s = %s %n",
					entry.getKey(),
					entry.getValue()
				);
			}
		}
		
	}
}
