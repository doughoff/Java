package collections;

import java.util.*;

public class IteratorLoops {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		// add integers
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		System.out.println("sysout the collection");
		System.out.println(ints);

		System.out.println("\nforeach loop with no iterator");
		// no iterator and for loop
		for (Integer integer : ints) {
			System.out.print(integer + ", ");
		}

		System.out.println("\n\nfor loop with no iterator");
		for (int i = 0; i < ints.size(); i++) {
			System.out.print(ints.get(i) + ", ");
		}

		Iterator<Integer> iterator = ints.iterator();
		System.out.println("\n\nfor loop with iterator");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}
	}
}
