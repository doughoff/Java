package dataStructures.arrays;

import java.util.Arrays;
import entities.Egg;

public class EggArrayTest {
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg);
		
		// create a 1d container for the Egg objects
		Egg[] carton = new Egg[12];
		
		// print the object/carton
		System.out.println(carton);
		
		// print the items in the carton
		System.out.println(Arrays.toString(carton));
		
		// add an egg and print
		carton[0] = egg;
		System.out.println(Arrays.toString(carton));
		
		// create a 2d container for cartons
		Egg[][] crate = new Egg[30][]; // holds any size of carton
		crate[1] = carton;
		
		// create a 3d container for crates
		Egg[][][] truck = new Egg[96][][];
		truck[95] = crate;
		
		// print out just the top level (level 3) of the arrays/the truck
		System.out.println(Arrays.toString(truck));
		
		// print out all levels of the arrays/the truck
		System.out.println(Arrays.deepToString(truck));
		
		// print out all cartons with for/each
		// print out contents of truck
		System.out.println("----------------------------- for-each of crates");
		for (Egg[][] item : truck) {
			System.out.print(item + ", ");
		}

	}
}
