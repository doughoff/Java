package collections;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> aCollection = new ArrayList<String>(); // 1.7 syntax
		System.out.println(aCollection.add("dog"));
		System.out.println(aCollection.add("cat"));
		aCollection.add("bird");
		System.out.println(aCollection.remove("pig"));
		System.out.println(aCollection.remove("bird"));
		System.out.println(aCollection.add("dog"));
		System.out.println(aCollection);

		Collection<Object> maybeRecursive= new ArrayList<Object>();
		maybeRecursive.addAll(aCollection);
		maybeRecursive.add(maybeRecursive);
		System.out.println(maybeRecursive);
	}
}
