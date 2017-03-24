package data.structures.sets;

import java.util.*;

public class CommandLineSet {
	// args = one two one three one four one five one six one
	public static void main(String[] args) {
		// convert array to List
		List<String> argList = Arrays.asList(args);
		System.out.println(argList);
		
		// put args into a set
		System.out.println("---------Putting args in a set");
		Set<String> commandLineArgs = new HashSet<String>(argList);

		// print out set
		for (String arg : commandLineArgs) {
			System.out.println(arg);
		}
		
	}
}
