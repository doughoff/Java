package dataStructures.lists;

import java.util.*;

public class ForEach {

	static String result = "";
	
	public static void process(String item) {
		result += item;
	}

	public static void main(String[] args) {
//		 String[] letters = {"a","b","c"};
//		 List<String> strings = Arrays.asList(letters);
		// or
		List<String> strings = Arrays.asList("a", "b", "c");
		
//		for (String string : strings) {
//			process(string);
//		}
		// or
		strings.forEach((item) -> result += item);

		System.out.println(result);
		Collections.reverse(strings);
		System.out.println(strings);
	}
}
