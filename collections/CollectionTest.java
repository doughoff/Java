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

		Collection maybeRecursive= new ArrayList();
		maybeRecursive.addAll(aCollection);
		maybeRecursive.add(maybeRecursive);
		System.out.println(maybeRecursive);

		List<Integer> anArrayList = new ArrayList<Integer>();
		for (int i = 0 ; i < 10 ; i++) {
			anArrayList.add(i); 
		}
		List aList = new LinkedList(anArrayList);
		int length = aList.size();
		LinkedList aLinkedList = (LinkedList) aList;
		System.out.println(aLinkedList.getFirst());
		aLinkedList.addFirst(-1);
		aLinkedList.addLast(10);

		System.out.println(aLinkedList.removeLast());
		System.out.println(aLinkedList);

	}
}
