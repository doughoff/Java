package dataStructures.arrays;

import java.util.Arrays;

public class MainArgs {
	// ----------------- data definition ? - no
	// a data structure is only for an entity class
	// this is a utility class

	// ----------------- testing
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println("The length was " + args.length);
		if (args.length > 0) {
			System.out.println("-------------------sorted------------");
			Arrays.sort(args);
			System.out.println(Arrays.toString(args));
		}
		System.out.println("---Done printing args---\n");
		
		System.out.println("---Foreach printing---");
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
