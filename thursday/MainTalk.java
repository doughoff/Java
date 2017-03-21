package thursday;

import java.util.Arrays;

public class MainTalk {
	//----------------- data definition ? - no
	// a data structure is only for an entity class
	// we are a utility class
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
