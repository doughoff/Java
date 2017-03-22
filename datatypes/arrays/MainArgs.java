package datatypes.arrays;

import java.util.Arrays;

public class MainArgs {
	//----------------- data definition ? - no
		// a data structure is only for an entity class
		// this is a utility class
	//----------------- processes ? maybe
		
	//----------------- testing
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println("The length was " + args.length);
		Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		System.out.println("---Done printing args---");
	}
}
