package data.structures.utilties;

import java.util.*;

public class MinAndMax {
public static void main(String[] args) {
	// create a list of 50 random numbers from 0 to 999
	List<Integer> aList = new ArrayList<Integer>();
	Random randomGenerator = new Random();
	for (int i = 0; i < 50 ; i++) {
		aList.add(randomGenerator.nextInt(1000));
	}
	
	// show the minimum and the maximum
	System.out.println("Minimum: " + Collections.min(aList));
	System.out.println("Maximum: " + Collections.max(aList));

}
}
