package dataStructures.maps;

import java.util.*;

public class SortedMapTest {
	public static void main(String[] args) {
		SortedMap<Integer,String> aTreeMap = new TreeMap<Integer,String>();
		aTreeMap.put(2,"tic tac toe");
		aTreeMap.put(3,"Checkers");
		aTreeMap.put(1,"Foosball");
		aTreeMap.put(40,"Chess");
		aTreeMap.put(10,"Bowling");
		
		System.out.println(aTreeMap);

		SortedMap<Integer,String> partialView = aTreeMap.subMap(2,4);
		System.out.println(partialView);

	}
}
