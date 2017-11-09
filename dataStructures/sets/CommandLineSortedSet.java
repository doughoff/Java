package dataStructures.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CommandLineSortedSet {
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
		
		System.out.println("------------------------------ SortedSet");
		// put into a SortedSet
		SortedSet<String> aTreeSet	= new TreeSet<String>(commandLineArgs);
		for (String arg : aTreeSet) {
			System.out.println(arg);
		}

	}
}
