package dataStructures.lists;

import java.util.ArrayList;

public class Boxing {
	public static void main(String[] args) {
		// Collections only store Objects, not primitives
		// ArrayList<int> ints = new ArrayList<int>();
		
		// must wrap int in wrapper
		Integer zero = new Integer(0);
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(zero);
		
		for (int i = 1; i < 10; i++) {
			// let Java wrapper/autobox it for you
			ints.add(i);
		}
		System.out.println(ints);
		
		// Java will also "auto-unbox"
		for (Integer integer : ints) {
			System.out.println(integer + 100);
		}
		
		// Java allows Integers to work as ints
		Integer ten = new Integer(10);
		System.out.println(ten/2);
	}
}
