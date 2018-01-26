package dataStructures.lists;

import java.util.*;

public class ForEachLambdas {

	public static String result;
	public static List<String> letters ;

	static {
		result = "";
		letters = Arrays.asList("a", "b", "c");
	}
	
	public static void process(String item) {
		result += item;
	}

	public static void main(String[] args) {
//		non-lambda
//		for (String string : strings) {
//			process(string);
//		}

//		lambda variations
//		strings.forEach((item)  -> {result += item;});
//		strings.forEach( item   -> {result += item;});
		letters.forEach( item   ->  result += item);
//		letters.forEach( item   ->  process(item) );

		System.out.println(result);
	}
}
