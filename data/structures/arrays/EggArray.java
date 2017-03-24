package data.structures.arrays;

import java.util.Arrays;

import entities.Egg;

public class EggArray {
	// ----------------------------- testing
	public static void main(String[] args) {
		// make an array of eggs
		Egg[] carton = new Egg[12];
		carton[2] = new Egg();
		// a bunch of cartons
		Egg[][] crate = new Egg[30][];
		crate[0] = carton;
		// a unit for crates
		Egg[][][] truck = new Egg[96][][];
		truck[0] = crate;

		System.out.println(truck[0][0][2]);
		truck[0][0][2].setColor("white");
		truck[0][0][2].setSize("Large");
		
		System.out.println(truck.length);
		System.out.println(truck[truck.length - 1]); // last place on truck
		System.out.println(truck);

		// print out contents of truck
		for (Egg[][] eachCrate : truck) {
			System.out.println(eachCrate);
		}

		// print out the array - one dim
		System.out.println(Arrays.toString(truck));
		// print out the array - all levels deep
		System.out.println(Arrays.deepToString(truck));
	}
}
