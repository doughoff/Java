package dataStructures.structures.utilties;

import java.util.*;

public class Unmodifiable {
	public static List<String> list;
	public static final List<String> FINAL_LIST;
	public static List<String> unmodifiableList;
	static {
		String[] states = {"Alabama", "Colorado", "Delaware", "Florida"};
		list = Arrays.asList(states);
		FINAL_LIST = new ArrayList<String>(list);
		unmodifiableList = Collections.unmodifiableList(list);
	}
	
	public static void printLists() {
		System.out.println(list);
		System.out.println(FINAL_LIST);
		System.out.println(unmodifiableList);
		System.out.println();
	}		
	
	public static void main(String[] args) {
		printLists();
		
		// update the list and print
		list.set(0, "ALASKA");
		printLists();
		
		// update the final list and print
		FINAL_LIST.set(0, "ARIZONA");
		printLists();
		
		// update the unmodifiable and print
		try {
			unmodifiableList.set(0, "*ARKANSAS*");
		} catch (Exception e) {
			System.err.println("You can't modify this list!!!");
		}
		printLists();
		
		// update the original list
		list.set(0, "***ARKANSAS***");
		printLists();
	}


}
