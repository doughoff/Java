package collections;

import java.util.*;

public class IteratorLoops {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		// add integers
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		System.out.println("basic toString()");
		System.out.println(ints);

		System.out.println("\nno iterator");
		// no iterator and for loop
		for (int i = 0; i < ints.size(); i++) {
			System.out.print(ints.get(i) + ", ");
		}
		System.out.println("\niterator v1");
		// iterator versions
		for (Iterator<Integer> iterator = ints.iterator(); iterator.hasNext();) {
			int i = iterator.next();
			System.out.print(ints.get(i) + ", ");
		}
		System.out.println("\niterator v2");
		Iterator<Integer> iterator2 = ints.iterator();
		while (iterator2.hasNext()) {
			int i = iterator2.next();
			System.out.print(ints.get(i) + ", ");
		}

	}
}
