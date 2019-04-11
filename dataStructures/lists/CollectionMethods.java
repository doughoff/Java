package dataStructures.lists;

import java.util.*;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> anyCollection = new ArrayList<String>();
		int length = anyCollection.size();
		System.out.println("The length of the ArrayList is " + length);
		anyCollection.add("new element");
		anyCollection.remove("old element that appears first");
		
		// toArray methods
		// Object[] values = anyCollection.toArray(); // vague
		// String[] values = anyCollection.toArray(); // error
		// String[] values = (String[])anyCollection.toArray(); // error
		String[] values = (String[])anyCollection.toArray(new String[0]);
		System.out.println(Arrays.toString(values));
	}
}
