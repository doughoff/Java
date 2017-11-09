package dataStructures.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDigits {
	public static void main(String[] args) {
		List<Integer> anArrayList = new ArrayList<Integer>();
		for (int i = 0 ; i < 10 ; i++) {
			anArrayList.add(i); 
		}
		List<Integer> aList = new LinkedList<Integer>(anArrayList);
		int size = aList.size();
		System.out.println("Size of the list is " + size);
		LinkedList<Integer> aLinkedList = (LinkedList<Integer>) aList;
		System.out.println("First is " + aLinkedList.getFirst());
		System.out.println("Adding items -1 and 10");
		aLinkedList.addFirst(-1);
		aLinkedList.addLast(10);

		System.out.println("Removing last item " + aLinkedList.removeLast());
		System.out.println(aLinkedList);
		
		// test for sorted or not
		aLinkedList.remove(4);
		System.out.println("3 was removed");
		System.out.println(aLinkedList);
		aLinkedList.add(3);
		System.out.println("3 was added");		
		// will it add at end or in order?
		System.out.println(aLinkedList);
		aLinkedList.set(4, 3333333);
		System.out.println("item for index 4 replaced");
		// item put back in to where one was removed? no holes there.
		System.out.println(aLinkedList);
		
		// if you want numbers in order, then sort them
		Collections.sort(aLinkedList);
		System.out.println("Sorted the list");
		System.out.println(aLinkedList);
	}
}
