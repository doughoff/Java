package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
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
